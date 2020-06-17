package com.cucumber.framework.stepdefinition.Grant_Application;

import com.cucumber.framework.Grant_Application_page.Grant_Application_page;
import com.cucumber.framework.Propine_Page.Date_Page;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Grant_Application_step {
	
	Grant_Application_page Grant_app;
	
	@Given("^open the valid url in Propine application$")
	public void open_the_valid_url_in_Propine_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		TestBase.driver.get(ObjectRepo.reader.getWebsite());
	
	}
	
	@Then("^click the login button$")
	public void click_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Grant_app= new Grant_Application_page(TestBase.driver);
		
		Grant_app.Login_In();
	}

	@Then("^Enter the User id  \"([^\"]*)\"$")
	public void enter_the_User_id(String arg1) throws Throwable {
	    
		Grant_app= new Grant_Application_page(TestBase.driver);
		
		Grant_app.CPUID(arg1);
		
	}

	@Then("^Enter the User name \"([^\"]*)\"$")
	public void enter_the_User_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Grant_app= new Grant_Application_page(TestBase.driver);
		
		Grant_app.CPU_fullname(arg1);
	}

	@Then("^Enter the UAN Number \"([^\"]*)\"$")
	public void enter_the_UAN_Number(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Grant_app= new Grant_Application_page(TestBase.driver);
		
		Grant_app.CPU_EntId(arg1);
	}
	@Then("^click the logins button$")
	public void click_the_logins_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Grant_app= new Grant_Application_page(TestBase.driver);
		
		Grant_app.Cpu_button();
	}
	@Then("^click the Get New grant icon$")
	public void click_the_Get_New_grant_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Grant_app= new Grant_Application_page(TestBase.driver);
		
		Grant_app.Get_new_grant();
	}
	@Then("^click the IT icon$")
	public void click_the_IT_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Grant_app= new Grant_Application_page(TestBase.driver);
		
		Grant_app.IT_button();
	}

	@Then("^click the Bring My Business button$")
	public void click_the_Bring_My_Business_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Grant_app= new Grant_Application_page(TestBase.driver);
		
		Grant_app.Bring_my_Business();
	}
	@Then("^click the Market Readiness Assistance$")
	public void click_the_Market_Readiness_Assistance() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Grant_app= new Grant_Application_page(TestBase.driver);
		
		Grant_app.Market_Readiness();
	}

	@Then("^click the Apply button$")
	public void click_the_Apply_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	Grant_app= new Grant_Application_page(TestBase.driver);
		
		Grant_app.Apply_button();
	}
	
	@Then("^click the Proceed button$")
	public void click_the_Proceed_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Grant_app= new Grant_Application_page(TestBase.driver);
		
		Grant_app.Proceed_button();
	}
	
	
	
	
	
}
