package com.org.pageObject.pages.Lightning.myStore;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.junit.Test;


public class myStoreLoginPage{
	private WebDriver driver;
	private WebElement signinbutton;
	private WebElement emailTextBox;
	private WebElement createAcctButton;
	private WebElement dressbutton;
	private WebElement summerdressbutton;
	private WebElement addtocartbutton;
	private WebElement dresstitle;
	private WebElement dresscolor;
	private WebElement dressquantity;
	
	 public myStoreLoginPage() {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		 driver = new ChromeDriver();
	    }
	
	
	
	 public void open(String url) {
	        try {
				System.out.println("Navigate to URL: " + url);
				
				driver.get(url);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Issue in Navigating to myStore URL :"+e);
			}
	 }
	 
	 public void signin() {
	        try {
				
	        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	        	signinbutton = driver.findElement(By.xpath("//a[@class='login']"));
	           	signinbutton.click();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Issue in Navigating to myStore URL :"+e);
			}
	 }
	 
	 
	 
	
	 public void createAcct(String emailid) {
	        try {
				
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
	        	emailTextBox = driver.findElement(By.xpath("//input[@id='email_create']"));
	        	if (isValid(emailid))
	        	{
	        		emailTextBox.sendKeys(emailid);
	        		createAcctButton = driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]"));
	        		createAcctButton.click();
	        	}
	        	else 
	        	{
	        		System.out.println("Invalid Email id");
	        		throw new Exception("Invalid Email id");
	        	}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Issue in Email id :"+e);
			}
	 }
	 public void searchForSummerDress() {
	        try {
				
	        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        	Actions actions = new Actions(driver);
	        	
	        	dressbutton = driver.findElement(By.linkText("DRESSES"));
	        	actions.moveToElement(dressbutton).perform();
	        	System.out.println("moved to Dresses");
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	summerdressbutton = driver.findElement(By.xpath("//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]"));
	        	summerdressbutton.click();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Issue in Navigating to myStore URL :"+e);
			}
	 }
	 
	  
	 public void addToCart() {
	        try {
				
	        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        	Actions actions = new Actions(driver);
	        	
	        	dressbutton = driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//img[@class='replace-2x img-responsive']"));
	        	actions.moveToElement(dressbutton).perform();
	        	System.out.println("moved to Dresses");
	        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        	addtocartbutton = driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//span[contains(text(),'Add to cart')]"));
	        	addtocartbutton.click();
	        	if(driver.findElement(By.partialLinkText("Printed")).isDisplayed())
	        		System.out.println("DressTitle Printd Yellow Dress is selected");
	        
	        	
	        	if (driver.findElement(By.partialLinkText("Yellow")).isDisplayed())
	        		System.out.println("Dresscolor yellow is selected");
	        	
	        	if (driver.findElement(By.partialLinkText("1")).isDisplayed())
	        		System.out.println("Quantity 1 is selected");       
	        	
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Issue in Navigating to myStore URL :"+e);
			}
	 }
	 
	 public boolean isValid(String emailid) {
	        try {
				
	        	String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                        "[a-zA-Z0-9_+&*-]+)*@" + 
                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                        "A-Z]{2,7}$"; 
                          
    Pattern pat = Pattern.compile(emailRegex); 
    if (emailid == null) 
        return false; 
    return pat.matcher(emailid).matches(); 
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Issue in Navigating to myStore URL :"+e);
				return false; 
			}
	 }
	 
	 
	
}