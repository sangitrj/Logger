package logger;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;

public class WriteLogToFile {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(WriteLogToFile.class.getName());
        PropertyConfigurator.configure("log4j.properties");
        FileHandler fileHandler = new FileHandler("app.log", true);        
        logger.addHandler(fileHandler);

        if (logger.isLoggable(Level.INFO)) {
            logger.info("Information message");
        }

        if (logger.isLoggable(Level.WARNING)) {
            logger.warning("Warning message");
        }

    }
}