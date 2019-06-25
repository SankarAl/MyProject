package com.Pom;

import org.testng.annotations.Test;

public class TestCaseExecution extends GoogleSearch {
	@Test
	public void verifyTxttoSearch() {
		txtToSearch(driver);
	}

}