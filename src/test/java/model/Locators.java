package model;

import org.openqa.selenium.By;

public class Locators {
	
	
	public static String homePageUrl = "http://automationpractice.com/index.php";
	public static String homePageTitle = "My Store";
	
	//Homepage Xpaths
	public static By signIn = By.xpath("//a[contains(text(),'Sign in')]");
	
	//Sign In page Xpaths
	public static By email_createAccount = By.xpath("//input[@id='email_create']");
	public static By button_createAccount = By.xpath("//button[@id='SubmitCreate']");
	
	//Create an account Xpaths
	public static By title = By.xpath("//input[@id='id_gender1']");
	public static By firstName = By.xpath("//input[@id='customer_firstname']");
	public static By lastName = By.xpath("//input[@id='customer_lastname']");
	public static By password = By.xpath("//input[@id='passwd']");
	public static By date = By.xpath("//select[@id='days']");
	public static By month = By.xpath("//select[@id='months']");
	public static By year = By.xpath("//select[@id='years']");
	public static By newsletter = By.xpath("//input[@id='newsletter']");
	
	public static By address_fname = By.xpath("//input[@id='firstname']");
	public static By address_lname = By.xpath("//input[@id='lastname']");
	public static By company = By.xpath("//input[@id='company']");
	public static By address = By.xpath("//input[@name='address1']");
	
	public static By address2 = By.xpath("//input[@name='address2']");
	public static By city = By.xpath("//input[@id='city']");
	public static By state = By.xpath("//select[@id='id_state']");
	public static By postalCode = By.xpath("//input[@id='postcode']");
	public static By country = By.xpath("//select[@id='id_country']");
	public static By mobile = By.xpath("//input[@id='phone_mobile']");
	public static By address_alias = By.xpath("//input[@id='alias']");
	public static By register_button = By.xpath("//button[@id='submitAccount']");
	
	//Logout
	public static By logout = By.xpath("//a[@class='logout']");
	
	//Login
	public static By login_email = By.xpath("//input[@id='email']");
	public static By login_password = By.xpath("//input[@id='passwd']");
	public static By login_submit = By.xpath("//button[@id='SubmitLogin']");
	
	//After login
	public static By home = By.xpath("//span[contains(text(),'Home')]");
	public static By  dresses = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");
	public static By  casualDresses = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");
	public static By view_dress = By.xpath("//a[contains(text(),'Printed Dress')]");
	public static By dress_cart = By.xpath("//span[contains(text(),'Add to cart')]");
	public static By continue_shopping = By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]");
	public static By tshirt = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]");
	public static By tshirt_view = By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]");
	
}
