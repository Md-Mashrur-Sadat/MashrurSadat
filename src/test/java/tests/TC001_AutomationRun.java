package tests;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

import base.Base;
import model.CommonMethods;
import model.Locators;
import pages.HomePage;

public class TC001_AutomationRun extends Base {
	
	@Test
	public static void testCase001() {
		
		driver.manage().window().maximize();
		
		HomePage.homePageUrl(Locators.homePageUrl);
		
		assertEquals(CommonMethods.getTitle(), Locators.homePageTitle);
		System.out.println("Success");
		CommonMethods.timeout(5000);
		
		CommonMethods.clickOnButton(Locators.signIn);
		CommonMethods.timeout(5000);
		
		//1st User create
		CommonMethods.sendText(Locators.email_createAccount, "sadat10@gmail.com");
		//CommonMethods.timeout();
		
		CommonMethods.clickOnButton(Locators.button_createAccount);
		CommonMethods.timeout(5000);
		
		//CommonMethods.clickOnButton(Locators.title);
		//CommonMethods.timeout();
		
		CommonMethods.sendText(Locators.firstName, "Mashrur");
		//CommonMethods.timeout();
		
		CommonMethods.sendText(Locators.lastName, "Sadat");
		//CommonMethods.timeout();
		
		CommonMethods.sendText(Locators.password, "12345");
		//CommonMethods.timeout();
		
		CommonMethods.select(Locators.date, "3");  
	    //CommonMethods.timeout();
	    
	    CommonMethods.select(Locators.month, "2");  
	    //CommonMethods.timeout();
	    
	    CommonMethods.select(Locators.year, "1998");  
	    //CommonMethods.timeout();
	    
	    CommonMethods.clickOnButton(Locators.newsletter);
	    CommonMethods.timeout(5000);
	    
	    CommonMethods.sendText(Locators.company, "Brain Station");
		//CommonMethods.timeout();
	    
	    CommonMethods.sendText(Locators.address, "Mirpur, Dhaka");
		//CommonMethods.timeout();
	    
	    CommonMethods.sendText(Locators.address2, "House-1");
		//CommonMethods.timeout();
	    
	    CommonMethods.sendText(Locators.city, "Dhaka");
		//CommonMethods.timeout();
	    
	    CommonMethods.select(Locators.state, "3");  
	    //CommonMethods.timeout();
	    
	    CommonMethods.sendText(Locators.postalCode, "12345");
		//CommonMethods.timeout();
	    
	    CommonMethods.select(Locators.country, "21");  
	    //CommonMethods.timeout();
	    
	    CommonMethods.sendText(Locators.mobile, "01832041867");
		//CommonMethods.timeout();
	    
	    CommonMethods.clearInputField(Locators.address_alias);
	    CommonMethods.timeout(5000);
	    CommonMethods.sendText(Locators.address_alias, "Muradnagar House");
		CommonMethods.timeout(5000);
	    
	    CommonMethods.clickOnButton(Locators.register_button);
		CommonMethods.timeout(5000);
		
		CommonMethods.clickOnButton(Locators.logout);
		CommonMethods.timeout(5000);
		
		//2nd user create
		CommonMethods.sendText(Locators.email_createAccount, "tahrin20@gmail.com");
		//CommonMethods.timeout();
		
		CommonMethods.clickOnButton(Locators.button_createAccount);
		CommonMethods.timeout(5000);
		
		
		
		CommonMethods.sendText(Locators.firstName, "Sabrina");
		//CommonMethods.timeout();
		
		CommonMethods.sendText(Locators.lastName, "tahrin");
		//CommonMethods.timeout();
		
		CommonMethods.sendText(Locators.password, "12345");
		//CommonMethods.timeout();
		
		CommonMethods.select(Locators.date, "3");  
	    //CommonMethods.timeout();
	    
	    CommonMethods.select(Locators.month, "2");  
	    //CommonMethods.timeout();
	    
	    CommonMethods.select(Locators.year, "1998");  
	    //CommonMethods.timeout();
	    
	    CommonMethods.clickOnButton(Locators.newsletter);
	    CommonMethods.timeout(5000);
	    
	    CommonMethods.sendText(Locators.company, "Brain Station");
		//CommonMethods.timeout();
	    
	    CommonMethods.sendText(Locators.address, "Mirpur, Dhaka");
		//CommonMethods.timeout();
	    
	    CommonMethods.sendText(Locators.address2, "House-1");
		//CommonMethods.timeout();
	    
	    CommonMethods.sendText(Locators.city, "Dhaka");
		//CommonMethods.timeout();
	    
	    CommonMethods.select(Locators.state, "3");  
	    //CommonMethods.timeout();
	    
	    CommonMethods.sendText(Locators.postalCode, "12345");
		//CommonMethods.timeout();
	    
	    CommonMethods.select(Locators.country, "21");  
	    //CommonMethods.timeout();
	    
	    CommonMethods.sendText(Locators.mobile, "01842041867");
		//CommonMethods.timeout();
	    
	    CommonMethods.clearInputField(Locators.address_alias);
	    CommonMethods.timeout(5000);
	    CommonMethods.sendText(Locators.address_alias, "Muradnagar House");
		CommonMethods.timeout(5000);
	    
	    CommonMethods.clickOnButton(Locators.register_button);
		CommonMethods.timeout(5000);
		
		CommonMethods.clickOnButton(Locators.logout);
		CommonMethods.timeout(5000);
		
		//login with 1st user
		CommonMethods.sendText(Locators.login_email, "sadat10@gmail.com");
		//CommonMethods.timeout();
		
		CommonMethods.sendText(Locators.login_password, "12345");
		//CommonMethods.timeout();
		
		CommonMethods.clickOnButton(Locators.login_submit);
		CommonMethods.timeout(9000);
		
		CommonMethods.clickOnButton(Locators.dresses);
		CommonMethods.timeout(9000);
		
		CommonMethods.clickOnButton(Locators.casualDresses);
		CommonMethods.timeout(9000);
		
		CommonMethods.clickOnButton(Locators.view_dress);
		CommonMethods.timeout(5000);
		
		CommonMethods.clickOnButton(Locators.dress_cart);
		CommonMethods.timeout(5000);
		
		CommonMethods.clickOnButton(Locators.continue_shopping);
		CommonMethods.timeout(5000);
		
		CommonMethods.clickOnButton(Locators.tshirt);
		CommonMethods.timeout(5000);
		
		CommonMethods.clickOnButton(Locators.tshirt_view);
		CommonMethods.timeout(5000);
		
		CommonMethods.clickOnButton(Locators.dress_cart);
		CommonMethods.timeout(5000);
	}

}
