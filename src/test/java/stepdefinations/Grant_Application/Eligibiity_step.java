package com.cucumber.framework.stepdefinition.Grant_Application;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;

import com.cucumber.framework.Grant_Application_page.Eligibility_page;
import com.cucumber.framework.Grant_Application_page.Grant_Application_page;
import com.cucumber.framework.Propine_Page.Date_Page;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class Eligibiity_step {
	
	Eligibility_page Eligibility_step;
	@Then("^click the Applicant Registered icon$")
	public void click_the_Applicant_Registered_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Eligibility_step= new Eligibility_page(TestBase.driver);
		
		Eligibility_step.Applicant_yes_button();
	}
	
	@Then("^click the Applicant Group icon$")
	public void click_the_Applicant_Group_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Eligibility_step= new Eligibility_page(TestBase.driver);
		
		Eligibility_step.Applicant_Group();
	}

@Then("^click the Applicant_(\\d+)localequality$")
public void click_the_Applicant__localequality(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Eligibility_step= new Eligibility_page(TestBase.driver);
	
	Eligibility_step.Applicant_market();
}

@Then("^click the Target Market$")
public void click_the_Target_Market() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
Eligibility_step= new Eligibility_page(TestBase.driver);
	
	Eligibility_step.Applicant_Atleast();
}

@Then("^click the Following statement$")
public void click_the_Following_statement() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Eligibility_step= new Eligibility_page(TestBase.driver);
	
	Eligibility_step.Applicant_Following_statement();
}

@Then("^click the Save button$")
public void click_the_Save_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
Eligibility_step= new Eligibility_page(TestBase.driver);
	
	Eligibility_step.Save_Eligibility();
}
@Then("^Verify  Alert message is displayed or not \"([^\"]*)\"$")
public void verify_Alert_message_is_displayed_or_not(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
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

@Then("^Verify the Link URL \"([^\"]*)\"$")
public void verify_the_Link_URL(String arg1) throws Throwable 
{
    // Write code here that turns the phrase above into concrete actions
	Eligibility_step= new Eligibility_page(TestBase.driver);
	
	Eligibility_step.FAQ();

	String subWindowHandler = null;

	Set<String> handles = TestBase.driver.getWindowHandles();
	Iterator<String> iterator = handles.iterator();
	while (iterator.hasNext()) {
		subWindowHandler = iterator.next();
}
	TestBase.driver.switchTo().window(subWindowHandler);

String Tiltles=TestBase.driver.getCurrentUrl();

	System.out.println("Tiltle " +Tiltles);
	
	if(Tiltles.contains(arg1))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println(" Fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
	}
}
@Then("^Refresh the page after click the save button$")
public void refresh_the_page_after_click_the_save_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Eligibility_step= new Eligibility_page(TestBase.driver);
	
	TestBase.driver.navigate().refresh();
	
	TestBase.driver.switchTo().alert().accept();
	
	
}

@Then("^Verify the Data are save or not$")
public void verify_the_Data_are_save_or_not() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Eligibility_step= new Eligibility_page(TestBase.driver);
	
	if(Eligibility_step.verifyFAQ())
	{
		System.out.println("Pass");
		
	}
	else
	{
		System.out.println("Fail");
	}
}




}

