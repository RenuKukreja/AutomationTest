package com.org.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.org.pageObject.pages.Lightning.myStore.*;


public class pageFactoryMyStore{
	myStoreLoginPage myStoreLoginPage;
	  private WebDriver driver;
	  private String url;
	
	 public myStoreLoginPage getLoginPage() {
	        if (myStoreLoginPage == null) {
	        	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
				driver = new ChromeDriver();
	        	myStoreLoginPage = new myStoreLoginPage();
	        }
	        return myStoreLoginPage;
	    }

	
}