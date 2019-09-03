package com.org.steps.myStore;



import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;






import com.org.pageFactory.pageFactoryMyStore;
import com.org.pageObject.pages.Lightning.myStore.myStoreLoginPage;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class loginPageSteps  {

	pageFactoryMyStore pageFactory;
	myStoreLoginPage login = new myStoreLoginPage();	 
  
    @Given("^I load myStore website (.*?)$")
    public void i_load_myStore_website(String url) {
        
    	System.out.println("loadmyStore called");
    	login.open(url);
    	
    }
    @When("^I click on SignIn$")
    public void i_clickon_signin() throws Throwable {
        System.out.println("clickonsignin called");
        login.signin();
    }
    
    @Given("^I reload myStore homepage (.*?)$")
    public void i_reload_myStore_website(String url) {
        
    	System.out.println("loadmyStore called");
    	login.open(url);
    	
    }
    
    @When("^I search for summerdress$")
    public void i_search_dresses() throws Throwable {
        System.out.println("i_search_dresses called");
        login.searchForSummerDress();
    }
   
    @Then("^I should be able to register with valid email (.*)$")
    public void i_register(String emailid) throws Throwable {
    	System.out.println("iregister called");
        login.createAcct(emailid);
    }
    @Then("^I should be able to add dress to cart$")
    public void i_addtocart() throws Throwable {
    	System.out.println("i_addtocart called");
        login.addToCart();
    }
    
    
}
    