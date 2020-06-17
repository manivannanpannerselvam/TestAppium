package Grant_Application_page;

import helper.Wait.WaitHelper;
import helper.genericHelper.GenericHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configreader.ObjectRepo;

public class Declare_Review_page {

	WebDriver driver;
	//private final Logger log = LoggerHelper.getLogger(Create_new_account_page.class);
	helper.Wait.WaitHelper waitHelper;
	Actions actions;
	
	@FindBy(xpath=".//span[text()='Declare & Review']")
	WebElement Declare_Review;
	
	@FindBy(xpath=".//div[text()='Third Party Vendors']")
	WebElement Third_party_Vendor;
	
	@FindBy(xpath=".//label[text()='Has the applicant been or is currently being: ']//following::span[text()='No'][1]")
	WebElement Applicant;
	
	@FindBy(xpath=".//label[text()='Has the applicant been or is currently being: ']//following::span[text()='No'][2]")
	WebElement second_Question;
	
	@FindBy(xpath=".//label[text()='Has the applicant been or is currently being: ']//following::span[text()='No'][3]")
	WebElement Third_Question;
	
	@FindBy(xpath=".//label[text()='Has the applicant been or is currently being: ']//following::span[text()='No'][4]")
	WebElement fourth_Question;
	
	@FindBy(xpath=".//label[text()='Has the applicant been or is currently being: ']//following::span[text()='No'][5]")
	WebElement fifth_Question;
	
	@FindBy(xpath=".//label[text()='Has the applicant been or is currently being: ']//following::span[text()='No'][6]")
	WebElement sixth_Question;

	@FindBy(xpath=".//label[text()='Has the applicant been or is currently being: ']//following::span[text()='No'][7]")
	WebElement seventh_Question;
	
	@FindBy(xpath=".//label[text()='Has the applicant been or is currently being: ']//following::span[text()='No'][7]")
	WebElement nine_Question;
	
	@FindBy(xpath=".//label[text()='Enterprise Singapore'")
	WebElement Entrprise_sing;
	
	@FindBy(xpath=".//label[text()='MY GRANTS'")
	WebElement MY_grants;
	
	public Declare_Review_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//
	}
	public boolean MY_grants()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		return new GenericHelper().isDisplayed(MY_grants);
	}
	
	
	public boolean Entrprise_sing()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		return new GenericHelper().isDisplayed(Entrprise_sing);
	}
	
	public void Declare_Review() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Declare_Review,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Declare_Review,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Declare_Review);
		
		actions.click().build().perform();
	}
	public void Third_party_Vendor() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Third_party_Vendor,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Third_party_Vendor,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Third_party_Vendor);
		
		actions.click().build().perform();
	}
	public void Applicant() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Applicant,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Applicant,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Applicant);
		
		actions.click().build().perform();
	}
	public void second_Question() throws InterruptedException
	{
		waitHelper.waitForElement(driver, second_Question,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, second_Question,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(second_Question);
		
		actions.click().build().perform();
	}
	public void Third_Question() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Third_Question,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Third_Question,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Third_Question);
		
		actions.click().build().perform();
	}
	public void fourth_Question() throws InterruptedException
	{
		waitHelper.waitForElement(driver, fourth_Question,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, fourth_Question,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(fourth_Question);
		
		actions.click().build().perform();
	}
	
	public void fifth_Question() throws InterruptedException
	{
		waitHelper.waitForElement(driver, fifth_Question,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, fifth_Question,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(fifth_Question);
		
		actions.click().build().perform();
	}
	public void sixth_Question() throws InterruptedException
	{
		waitHelper.waitForElement(driver, sixth_Question,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, sixth_Question,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(sixth_Question);
		
		actions.click().build().perform();
	}
	public void seventh_Question() throws InterruptedException
	{
		waitHelper.waitForElement(driver, seventh_Question,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, seventh_Question,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(seventh_Question);
		
		actions.click().build().perform();
	}
	
	public void nine_Question() throws InterruptedException
	{
		waitHelper.waitForElement(driver, nine_Question,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, nine_Question,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(nine_Question);
		
		actions.click().build().perform();
	}
	
	
}
