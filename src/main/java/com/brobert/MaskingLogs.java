package com.brobert;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 */

/**
 * @author Brendan
 *
 */

public class MaskingLogs {
	private static final Logger logger = LogManager.getLogger(MaskingLogs.class);



	public static void main(String[] args) {
		logger.info("printing left mask - maskedID: {}", "1234");
		logger.info("printing left mask - maskedID: {}", "12345");
		logger.info("printing left mask - maskedID: {}", "123");
		logger.info("printing some stuff {}", "A234");
		logger.info("printing some stuff {}", "ABCD");
		logger.info("printing left mask - maskedID: {}", "ABC1234");
		logger.info("Id that should be masked: 1234");
	}
}
