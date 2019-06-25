package com.mdfw;

import org.testng.annotations.Test;

public class TestCaseExecution extends Repository{

	@Test
	public void verifyLogin() {
		setUp();
		login();
		/*Repository.setUp();
		Repository.login();*/
	}

}