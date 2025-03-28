package contact;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest() {
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Execute Create Contact Test");
	}
	
	@Test (groups = "Smoke")
	public void modifyContactTest() {
		
		System.out.println("Execute Modify Contact Test");
	}
	
	@Test (groups = "Regression")
	public void deleteContactTest() {
		
		System.out.println("Execute Delete Contact Test for Regression");
	}
	
}
