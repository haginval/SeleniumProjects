package log4jJava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demoLog4j {

	private static Logger logger = LogManager.getLogger(demoLog4j.class.getName());
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		logger.info("logging info");
		logger.fatal("Fatal logs");
		logger.error("error log");
		logger.warn(" warning message");
		logger.trace("trace level message");
	}

}
