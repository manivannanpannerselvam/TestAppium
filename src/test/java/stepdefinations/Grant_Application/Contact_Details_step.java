package com.cucumber.framework.stepdefinition.Grant_Application;

import org.testng.Assert;

import com.cucumber.framework.Grant_Application_page.Contact_details_page;
import com.cucumber.framework.Grant_Application_page.Eligibility_page;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class Contact_Details_step {
	
	
	Contact_Details_step Contact_page;
	
	@Then("^click the contact Details$")
	public void click_the_contact_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Contact_page= new Contact_details_page(TestBase.driver);
		
		Contact_page.Contact_Details();
	}
	
	@Then("^Emter the contact Name \"([^\"]*)\"$")
	public void emter_the_contact_Name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Contact_page= new Contact_details_page(TestBase.driver);
		
		Contact_page.Name_field(arg1);
	}

	@Then("^Enter the Job title \"([^\"]*)\"$")
	public void enter_the_Job_title(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Contact_page= new Contact_details_page(TestBase.driver);
		
		Contact_page.Job_Title(arg1);
	}

	@Then("^Enter the Contact No \"([^\"]*)\"$")
	public void enter_the_Contact_No(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Contact_page= new Contact_details_page(TestBase.driver);
		
		Contact_page.Job_phone(arg1);
	}

	@Then("^Enter the Email id   \"([^\"]*)\"$")
	public void enter_the_Email_id(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Contact_page= new Contact_details_page(TestBase.driver);
		
		Contact_page.Job_Email(arg1);
		}

	@Then("^click the Mailing Address$")
	public void click_the_Mailing_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Contact_page= new Contact_details_page(TestBase.driver);
		
		Contact_page.Mailing_Address();
	}


@Then("^click the offer address$")
public void click_the_offer_address() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Contact_page= new Contact_details_page(TestBase.driver);
	
	Contact_page.offer_address();
}

@Then("^Verify all field should be entered \"([^\"]*)\"$")
public void verify_all_field_should_be_entered(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
Contact_page= new Contact_details_page(TestBase.driver);
	
	if(Contact_page.Names_fields().contains(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" Fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
	}Contact_page= new Contact_details_page(TestBase.driver);
	
	if(Contact_page.Names_fields().contains(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" Fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
	}
}
private void assertTrue(boolean validate) {
	// TODO Auto-generated method stub
	
}

@Then("^Verify the Valid Auto postal should be dsplayed$")
public void verify_the_Valid_Auto_postal_should_be_dsplayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Contact_page= new Contact_details_page(TestBase.driver);
	
	
	
	 System.out.println("Zip Code 12345-6789 "+ Contact_page.validate("12345-6789"));
	  assertTrue(Contact_page.validate("12345-6789"));
	  
	  String hh=Contact_page.verify_postalcode_results();
	  
	  System.out.println("Postal code is   "+hh);
	  
	  String s="200";  
	//Converting String into int using Integer.parseInt()  
	int postacodeActaul=Integer.parseInt(hh);  
	//Printing value of i  
	System.out.println(postacodeActaul);
	  
	assertTrue(Contact_page.validate(hh));
}

@Then("^Verify the Letter Of Offer Addressee field should be displayed$")
public void verify_the_Letter_Of_Offer_Addressee_field_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Contact_page= new Contact_details_page(TestBase.driver);
	
	if(Contact_page.Letter_offer_Name_field())
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" Fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
	}
}
@Then("^Verify the Applicant should be taken to a read-only summary page$")
public void verify_the_Applicant_should_be_taken_to_a_read_only_summary_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Contact_page= new Contact_details_page(TestBase.driver);
	if(Contact_page.Letter_offer_Name_field())
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" Fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
	}
}


@Then("^Verify the Same as main contact person should be displayed in displayed \"([^\"]*)\"$")
public void verify_the_Same_as_main_contact_person_should_be_displayed_in_displayed(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Contact_page= new Contact_details_page(TestBase.driver);
	
	if(Contact_page.Same_as_main_contact_person().contains(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" Fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
	}
}

}
