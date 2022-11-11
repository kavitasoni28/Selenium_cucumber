package com.itview.basictestcases;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver w;
	
	@Given("Browse should be open with login page")
	public void browse_should_be_open_with_login_page() {
		
		WebDriverManager.chromedriver().setup();
		w= new ChromeDriver();
		w.get("http://altoromutual.com:8080/login.jsp");
	   
	}

	@When("User should login with valid username and password and click on login button")
	public void user_should_login_with_valid_username_and_password_and_click_on_login_button() {
		String CurrentPageTitle=w.getTitle();
		  String CurrentPageUrl=w.getCurrentUrl();
		  String LoginPageLable=w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1")).getText();
		  
		  Assert.assertEquals(CurrentPageTitle,"Altoro Mutual");
		  Assert.assertEquals(CurrentPageUrl, "http://altoromutual.com:8080/login.jsp");
		  Assert.assertTrue(LoginPageLable.contains("Login"));
		  
		  w.findElement(By.id("uid")).sendKeys("admin");
		  w.findElement(By.id("passw")).sendKeys("admin");
	    
	}

	@Then("Homepage should open and verify the title page and close the browser")
	public void homepage_should_open_and_verify_the_title_page_and_close_the_browser() {
		
		 w.findElement(By.name("btnSubmit")).click();
		 w.quit();
	    
	}



}
