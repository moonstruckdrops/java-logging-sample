package com.kurobara.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Logging {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(Log4j2Logging.class);
		logger.debug("This is debug log.");
		logger.info("This is info log.");
		logger.warn("This is warn log.");
		logger.error("This is error log.");
		logger.trace("This is trace log.");
	}

}
