package logger;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.logging.FileHandler;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class HelloExample{
	
	final static Logger logger = Logger.getLogger(HelloExample.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.warn("This is warn : " );
		logger.info("hai");
		logger.error("This is error : " );
		logger.fatal("This is fatal : " );
		try{
			//int a = 1/0;
			String filename = "";
			LineNumberReader reader  = new LineNumberReader(new FileReader(filename));
		    int cnt = 0;
		    String lineRead = "";
		    while ((lineRead = reader.readLine()) != null) {}
		    cnt = reader.getLineNumber();
		    reader.close();
			
		}catch(IOException e){
			logger.error("sdsd",e);
		}
		catch(Exception e){
			if(e.getStackTrace().length>0)
			System.out.println(e.getStackTrace()[0].getLineNumber());
		}
		
	}
	
	
}