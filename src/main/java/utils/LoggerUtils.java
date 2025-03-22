//package utils;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//public class LoggerUtils {
//
//    static {
//        System.setProperty("log4j.configurationFile", System.getProperty("user.dir") + "/../log4j2.xml");
//    }
//
//    private LoggerUtils(){}
//
//    public static <T> Logger getInstance(Class<T> clazz){
//        return LogManager.getLogger(clazz);
//    }
//
//    public static void info(Logger logger, String message){logger.info(message);}
//    public static void debug(Logger logger, String message){logger.debug(message);}
//    public static void error(Logger logger, String message){logger.error(message);}
//    public static void error(Logger logger, String message, Exception e){logger.error(message, e);}
//    public static void fatal(Logger logger, String message){logger.fatal(message);}
//    public static void fatal(Logger logger, String message, Exception e){logger.fatal(message, e);}
//    public static void trace(Logger logger, String message){logger.trace(message);}
//    public static void trace(Logger logger, String message, Exception e){logger.trace(message, e);}
//
//}
