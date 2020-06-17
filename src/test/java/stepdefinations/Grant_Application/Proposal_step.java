package com.cucumber.framework.stepdefinition.Grant_Application;

import com.cucumber.framework.Grant_Application_page.Contact_details_page;
import com.cucumber.framework.Grant_Application_page.Grant_Application_page;
import com.cucumber.framework.Grant_Application_page.Proposal_page;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class Proposal_step {
	
	Proposal_page Proposal_app;
	
	@Then("^click the Proposal icon$")
	public void click_the_Proposal_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Proposal_app= new Proposal_page(TestBase.driver);
		
		Proposal_app.Proceed_button();
	}

	@Then("^click the Project Title$")
	public void click_the_Project_Title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Proposal_app= new Proposal_page(TestBase.driver);
		
		Proposal_app.Project_title("Test");
	}

	@Then("^Enter the start Date  \"([^\"]*)\"$")
	public void enter_the_start_Date(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Proposal_app= new Proposal_page(TestBase.driver);
		
		Proposal_app.Project_start_Date(arg1);
	}

	@Then("^Enter the End Date  \"([^\"]*)\"$")
	public void enter_the_End_Date(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Proposal_app= new Proposal_page(TestBase.driver);
		
		Proposal_app.Project_end_Date(arg1);
	}

	@Then("^Enter the project Description \"([^\"]*)\"$")
	public void enter_the_project_Description(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        Proposal_app= new Proposal_page(TestBase.driver);
		
		Proposal_app.Project_Description(arg1);
	}
	@Then("^click the Activity icon \"([^\"]*)\"$")
	public void click_the_Activity_icon(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Proposal_app= new Proposal_page(TestBase.driver);
		 
		 Proposal_app.Activity_Drop_down(arg1);
	}
	@Then("^choose the Market Entry in Activity icon$")
	public void choose_the_Market_Entry_in_Activity_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Proposal_app= new Proposal_page(TestBase.driver);
		
		Proposal_app.Activity_Value();
	}

	
}
