package org;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test
	public void createOrgTest() {
		
		System.out.println("Execute Create org Test");
	}
	
	@Test(groups = "Smoke")
	public void modifyOrgTest() {
		
		System.out.println("Execute ModifyOrgTest");
	}
	

}
