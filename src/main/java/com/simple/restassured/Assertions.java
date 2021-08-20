package com.simple.restassured;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import com.utilities.TestUtils;

import io.restassured.response.Response;

public class Assertions {

	public static Logger log = LogManager.getLogger(Assertions.class.getName());

	public static void VerifyTrue(boolean flag) {
		// Assertions.Assertion assertion = new Assertion(); or
		Assert.assertTrue(flag);
	}

	public static void VerifyFalse(boolean flag) {
		Assert.assertFalse(flag);
	}

	public static void VerifyStatusCode(Response response, int status) {
		int statusCodefind = TestUtils.getStatusCode(response);
		Assert.assertEquals(statusCodefind, status);
	}

	public static void VerifyStatusCodeMessage(Response response, String statusMessage) {
		log.debug("************My response Start*************");
		String getstausMessage = TestUtils.getStatusMessage(response);
		Assert.assertEquals(getstausMessage, statusMessage);
		log.info(response);
		log.info(statusMessage);
		log.debug("************My response End*************");
	}
}
