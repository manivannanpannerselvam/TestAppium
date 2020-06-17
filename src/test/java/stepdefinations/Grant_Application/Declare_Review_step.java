package com.cucumber.framework.stepdefinition.Grant_Application;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cucumber.framework.Grant_Application_page.Contact_details_page;
import com.cucumber.framework.Grant_Application_page.Declare_Review_page;
import com.cucumber.framework.Grant_Application_page.Eligibility_page;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class Declare_Review_step {
	
	
	Declare_Review_page Declare_page;
	Contact_details_page Contact_page;
	
	Eligibility_page Eligibility_step;
	
	@Then("^click the Declare and Review$")
	public void click_the_Declare_and_Review() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Declare_page= new Declare_Review_page(TestBase.driver);
		
		Declare_page.Declare_Review();
	}
@Then("^click the Third party Vendor$")
public void click_the_Third_party_Vendor() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Declare_page= new Declare_Review_page(TestBase.driver);
	
	Declare_page.Third_party_Vendor();
}

@Then("^click the No icon in First Question$")
public void click_the_No_icon_in_First_Question() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Declare_page= new Declare_Review_page(TestBase.driver);
	
	Declare_page.Applicant();
}

@Then("^click the No icon in second Question$")
public void click_the_No_icon_in_second_Question() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
Declare_page= new Declare_Review_page(TestBase.driver);
	
	Declare_page.second_Question();
}

@Then("^click the No icon in Third Question$")
public void click_the_No_icon_in_Third_Question() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Declare_page= new Declare_Review_page(TestBase.driver);
	
	Declare_page.Third_Question();
}

@Then("^click the No icon in fourth Question$")
public void click_the_No_icon_in_fourth_Question() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Declare_page= new Declare_Review_page(TestBase.driver);
	
	Declare_page.fourth_Question();
	
}

@Then("^click the No icon in fifth Question$")
public void click_the_No_icon_in_fifth_Question() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
Declare_page= new Declare_Review_page(TestBase.driver);
	
	Declare_page.fifth_Question();
}

@Then("^click the No icon in sex Question$")
public void click_the_No_icon_in_sex_Question() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
Declare_page= new Declare_Review_page(TestBase.driver);
	
	Declare_page.sixth_Question();
}

@Then("^click the No icon in seventh Question$")
public void click_the_No_icon_in_seventh_Question() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
Declare_page= new Declare_Review_page(TestBase.driver);
	
	Declare_page.seventh_Question();
}

@Then("^click the No icon in nine Question$")
public void click_the_No_icon_in_nine_Question() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Declare_page= new Declare_Review_page(TestBase.driver);
	
	Declare_page.nine_Question();
}



@Then("^click the acknowlege icon$")
public void click_the_acknowlege_icon() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
Declare_page= new Declare_Review_page(TestBase.driver);
	
	Declare_page.nine_Question();
}

@Then("^click the Review Button$")
public void click_the_Review_Button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Declare_page= new Declare_Review_page(TestBase.driver);
	
	Declare_page.Declare_Review();
	
}
@Then("^Verify the error number should also be displayed$")
public void verify_the_error_number_should_also_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    List<WebElement> ErrorNumber=TestBase.driver.findElements(By.xpath(".//span[@class='label label-error']"));
    
    System.out.println("Error Number is   "+ErrorNumber.size());
    int count =0;
    for(int i=0;i<ErrorNumber.size();i++)
    {
    	if(i==1)
    	{
    	   count++;	
    	   break;
    	}
    }
    if(count==1)
    {
    	
    	System.out.println("Pass");	 
    	
    }
    else
    {
    	System.out.println("Fail");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
    }
}

@Then("^Verify the All field should be displayed$")
public void verify_the_All_field_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
Contact_page= new Contact_details_page(TestBase.driver);
	
	if(Contact_page.Names_fields().contains("Testnuu"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" Fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
	}Contact_page= new Contact_details_page(TestBase.driver);
	
	if(Contact_page.Names_fields().contains(""))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" Fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
	}
	
	
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
	Eligibility_step= new Eligibility_page(TestBase.driver);
	
	if(Eligibility_step.Alertmessage().contentEquals("Visit Smart Advisor on the SME Portal for more information on other government assistance."))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" Fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
	}
}

public void verify_the_Enterprise_singapore_alert_message_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Declare_page= new Declare_Review_page(TestBase.driver);
	
	if(Declare_page.Entrprise_sing())
	{
		System.out.println(" Pass ");
	}
	else
	{
		System.out.println(" Fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
		
	}
}
@Then("^click the Grant submission in the application$")
public void click_the_Grant_submission_in_the_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
Declare_page= new Declare_Review_page(TestBase.driver);
	
	if(Declare_page.MY_grants())
	{
		System.out.println(" Pass ");
	}
	else
	{
		System.out.println(" Fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
		
	}
}

}