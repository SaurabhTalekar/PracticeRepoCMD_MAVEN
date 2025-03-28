package org;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test
	public void createOrgTest() {
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Execute Create org Test");
	}
	
	@Test(groups = "Smoke")
	public void modifyOrgTest() {
		
		System.out.println("Execute ModifyOrgTest");
	}
	

}
