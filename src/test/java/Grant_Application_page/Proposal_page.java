package Grant_Application_page;

import helper.Wait.WaitHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configreader.ObjectRepo;



public class Proposal_page {

	
	WebDriver driver;
	//private final Logger log = LoggerHelper.getLogger(Create_new_account_page.class);
	WaitHelper waitHelper;
	Actions actions;
	
	@FindBy(xpath=".//span[text()='Proposal']")
	WebElement Proposal;
	
	@FindBy(xpath=".//input[@id='react-project-title']")
	WebElement Project_title;
	
	@FindBy(xpath=".//input[@id='react-project-start_date']")
	WebElement Project_start_Date;
	
	@FindBy(xpath=".//input[@id='react-project-end_date']")
	WebElement Project_end_Date;
	
	@FindBy(xpath=".//textarea[@id='react-project-description']")
	WebElement Project_Description;
	
	@FindBy(xpath=".//span[text()='Proposal']")
	WebElement Proceed_button;
	
	@FindBy(xpath=".//span[@id='react-select-project-activity--value']")
	WebElement Activity_Drop_down;
	
	
	@FindBy(xpath=".//span[text()='Market Entry']")
	WebElement Activity_select_Drop_down;
	
	
	public Proposal_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//
	}
	public void Activity_Value() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Activity_Drop_down,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Activity_Drop_down,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Activity_Drop_down);
		
		actions.click().build().perform();
	}
	
	
	public void Activity_Drop_down(String Activity_Drop_down) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.Activity_Drop_down.sendKeys(Activity_Drop_down);
	}
	
	public void Project_Description(String Project_Description) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.Project_Description.clear();
		this.Project_Description.sendKeys(Project_Description);
	}
	
	
	public void Project_end_Date(String Project_end_Date) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.Project_end_Date.clear();
		this.Project_end_Date.sendKeys(Project_end_Date);
	}
	public void Project_start_Date(String Project_start_Date) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.Project_start_Date.clear();
		this.Project_start_Date.sendKeys(Project_start_Date);
	}
	public void offer_address() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Proposal,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Proposal,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Proposal);
		
		actions.click().build().perform();
	}
	public void Project_title(String Project_title) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.Project_title.clear();
		this.Project_title.sendKeys(Project_title);
	}
	public void Proceed_button() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Proceed_button,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Proceed_button,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Proceed_button);
		
		actions.click().build().perform();
	}
	
	public void Activity_Drop_down() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Activity_Drop_down,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Activity_Drop_down,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Activity_Drop_down);
		
		actions.click().build().perform();
	}
}
