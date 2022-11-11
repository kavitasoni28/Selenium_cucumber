package com.itview.basictestcases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class calculatorFunctionality {
	
	WebDriver w;
	
	@Given("Application url for testing")
	public void application_url_for_testing() {
		
		WebDriverManager.chromedriver().setup();
		w = new ChromeDriver();
		w.get("https://juliemr.github.io/protractor-demo/");
	
	   
	}

	@When("User should enter two enter and perform Addition operation")
	public void user_should_enter_two_enter_and_perform_addition_operation() {
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("4");
		
		 Select sc=new Select(w.findElement(By.xpath("/html/body/div/div/form/select")));
		 sc.selectByVisibleText("+");
		 
		 w.findElement(By.xpath("/html/body/div/div/form/input[2]")).clear();
		 w.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("5");
		 
		 w.findElement(By.id("gobutton")).click();
		 
	}
	@Then("Result should get display and verify output value for Addition.")
	public void result_should_get_display_and_verify_output_value_for_addition() throws Exception {
		
		Thread.sleep(3000);
		
		String outputValue = w.findElement(By.xpath("/html/body/div/div/form/h2")).getText();
		Assert.assertEquals("9", outputValue);
	   w.quit();
	}

	@When("User should enter two enter and perform subtraction operation")
	public void user_should_enter_two_enter_and_perform_subtraction_operation() {
		
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("9");
		
		 Select sc=new Select(w.findElement(By.xpath("/html/body/div/div/form/select")));
		 sc.selectByVisibleText("-");
		 
		 w.findElement(By.xpath("/html/body/div/div/form/input[2]")).clear();
		 w.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("5");
		 
		 w.findElement(By.id("gobutton")).click();
	   
	}

	@Then("Result should get display and verify output value for subtraction.")
	public void result_should_get_display_and_verify_output_value_for_subtraction() throws Exception {
		
     Thread.sleep(3000);
		
     String outputValue = w.findElement(By.xpath("/html/body/div/div/form/h2")).getText();
		Assert.assertEquals("4", outputValue);
	    w.quit();
	}

	@When("User should enter two enter and perform multiplication operation")
	public void user_should_enter_two_enter_and_perform_multiplication_operation() {
		
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("2");
		
		 Select sc=new Select(w.findElement(By.xpath("/html/body/div/div/form/select")));
		 sc.selectByVisibleText("/");
		 
		 w.findElement(By.xpath("/html/body/div/div/form/input[2]")).clear();
		 w.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("2");
		 
		 w.findElement(By.id("gobutton")).click();
	    
	}

	@Then("Result should get display and verify output value for multiplication.")
	public void result_should_get_display_and_verify_output_value_for_multiplication() {
		
		String outputValue = w.findElement(By.xpath("/html/body/div/div/form/h2")).getText();
		Assert.assertEquals("1", outputValue);
        
        w.quit();
	    
	}


}
