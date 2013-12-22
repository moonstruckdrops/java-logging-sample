package com.kurobara.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackLogging {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(LogbackLogging.class);
		logger.debug("This is debug log.");
		logger.info("This is info log.");
		logger.warn("This is warn log.");
		logger.error("This is error log.");
		logger.trace("This is trace log.");
	}

}
