package baseTest;


//import org.json.JSONObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class BrowserstackAPIs {

    JSONParser parser = new JSONParser();
    org.json.simple.JSONObject config = (org.json.simple.JSONObject) parser.parse(new FileReader("src/test/resources/ANRConfig.json"));

    private static String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
    private static String ACCESS_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");

    public BrowserstackAPIs() throws IOException, ParseException {
    }

    @Test
    public void test1() throws Exception {
        fetchBrowserStackSessionDetails("1b6dba7114830a03209696f9620e9239cea55432");
    }

    public void fetchBrowserStackSessionDetails(String SESSION_ID) throws Exception {
        String apiUrl = "https://api.browserstack.com/app-automate/sessions/" + SESSION_ID + ".json";

        if(USERNAME == null) {
            USERNAME = (String) config.get("username");
        }
        if(ACCESS_KEY == null) {
            ACCESS_KEY = (String) config.get("access_key");
        }
        // Create Basic Authentication Header
        String auth = USERNAME + ":" + ACCESS_KEY;
        String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes(StandardCharsets.UTF_8));

        // Create HttpClient
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(apiUrl);
            request.setHeader("Authorization", "Basic " + encodedAuth);

            // Execute API request
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println("BrowserStack Session Details: \n" + responseBody);
                // Parse JSON and extract public_url
//                JSONObject jsonObject = new JSONObject(responseBody);
//                String publicUrl = jsonObject.getJSONObject("automation_session").getString("public_url");

                // Print or use the URL
//                System.out.println("BrowserStack Public URL: " + publicUrl);
            }
        }
    }
}
