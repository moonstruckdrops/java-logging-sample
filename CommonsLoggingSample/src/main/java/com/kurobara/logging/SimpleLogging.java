package com.kurobara.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SimpleLogging {

	public static void main(String[] args) {
		Log logger = LogFactory.getLog(SimpleLogging.class);
		logger.debug("This is debug log.");
		logger.info("This is info log.");
		logger.warn("This is warn log.");
		logger.error("This is error log.");
		logger.fatal("This is fatal log.");
	}

}
