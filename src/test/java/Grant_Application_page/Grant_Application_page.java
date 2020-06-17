package Grant_Application_page;

import helper.Wait.WaitHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configreader.ObjectRepo;

public class Grant_Application_page {
	
	WebDriver driver;
	//private final Logger log = LoggerHelper.getLogger(Create_new_account_page.class);
	WaitHelper waitHelper;
	Actions actions;
	
	@FindBy(xpath=".//span[text()='LOG IN']")
	WebElement Login_In;
	
	@FindBy(xpath=".//input[@name='CPUID']")
	WebElement CPUID;

	@FindBy(xpath=".//input[@name='CPUID_FullName']")
	WebElement CPU_fullname;
	
	@FindBy(xpath=".//input[@name='CPEntID']")
	WebElement CPU_EntId;
	
	@FindBy(xpath=".//input[@name='CPEntID']//following::button")
	WebElement Cpu_button;
	
	@FindBy(xpath=".//p[text()='Apply for a grant to support your project']")
	WebElement Get_new_grant;

	@FindBy(xpath=".//div[text()='IT']")
	WebElement IT_button;
	
	@FindBy(xpath=".//div[text()='Bring my business overseas or establish a stronger international presence']")
	WebElement Bring_my_Business;
	
	@FindBy(xpath=".//div[text()='Market Readiness Assistance']")
	WebElement Market_Readiness;
	
	@FindBy(xpath=".//button[text()='Apply']")
	WebElement Apply_button;
	
	@FindBy(xpath=".//button[text()='Proceed']")
	WebElement Proceed_button;
	
	@FindBy(xpath=".//label[text()='Is the applicant registered in Singapore?']//following::span[text()='Yes'][1]")
	WebElement Applicant_yes_button;

	
public Grant_Application_page(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	waitHelper = new WaitHelper(driver);
	//
}

public void Applicant_yes_button() throws InterruptedException
{
	waitHelper.waitForElement(driver, Applicant_yes_button,ObjectRepo.reader.getPageLoadTimeOut());
	waitHelper.waitForElement(driver, Applicant_yes_button,ObjectRepo.reader.getExplicitWait());
	
	actions = new Actions(driver);
	actions.moveToElement(Applicant_yes_button);
	
	actions.click().build().perform();
}
public void Proceed_button() throws InterruptedException
{
	waitHelper.waitForElement(driver, Proceed_button,ObjectRepo.reader.getPageLoadTimeOut());
	waitHelper.waitForElement(driver, Proceed_button,ObjectRepo.reader.getExplicitWait());
	
	actions = new Actions(driver);
	actions.moveToElement(Proceed_button);
	
	actions.click().build().perform();
}

public void Apply_button() throws InterruptedException
{
	waitHelper.waitForElement(driver, Apply_button,ObjectRepo.reader.getPageLoadTimeOut());
	waitHelper.waitForElement(driver, Apply_button,ObjectRepo.reader.getExplicitWait());
	
	actions = new Actions(driver);
	actions.moveToElement(Apply_button);
	
	actions.click().build().perform();
}

public void Market_Readiness() throws InterruptedException
{
	waitHelper.waitForElement(driver, Market_Readiness,ObjectRepo.reader.getPageLoadTimeOut());
	waitHelper.waitForElement(driver, Market_Readiness,ObjectRepo.reader.getExplicitWait());
	
	actions = new Actions(driver);
	actions.moveToElement(Market_Readiness);
	
	actions.click().build().perform();
}
public void Bring_my_Business() throws InterruptedException
{
	waitHelper.waitForElement(driver, Bring_my_Business,ObjectRepo.reader.getPageLoadTimeOut());
	waitHelper.waitForElement(driver, Bring_my_Business,ObjectRepo.reader.getExplicitWait());
	
	actions = new Actions(driver);
	actions.moveToElement(Bring_my_Business);
	
	actions.click().build().perform();
}
public void IT_button() throws InterruptedException
{
	waitHelper.waitForElement(driver, IT_button,ObjectRepo.reader.getPageLoadTimeOut());
	waitHelper.waitForElement(driver, IT_button,ObjectRepo.reader.getExplicitWait());
	
	actions = new Actions(driver);
	actions.moveToElement(IT_button);
	
	actions.click().build().perform();
}
public void Get_new_grant() throws InterruptedException
{
	waitHelper.waitForElement(driver, Get_new_grant,ObjectRepo.reader.getPageLoadTimeOut());
	waitHelper.waitForElement(driver, Get_new_grant,ObjectRepo.reader.getExplicitWait());
	
	actions = new Actions(driver);
	actions.moveToElement(Get_new_grant);
	
	actions.click().build().perform();
}


public void Cpu_button() throws InterruptedException
{
	waitHelper.waitForElement(driver, Cpu_button,ObjectRepo.reader.getPageLoadTimeOut());
	waitHelper.waitForElement(driver, Cpu_button,ObjectRepo.reader.getExplicitWait());
	
	actions = new Actions(driver);
	actions.moveToElement(Cpu_button);
	
	actions.click().build().perform();
}

public void Login_In() throws InterruptedException
{
	waitHelper.waitForElement(driver, Login_In,ObjectRepo.reader.getPageLoadTimeOut());
	waitHelper.waitForElement(driver, Login_In,ObjectRepo.reader.getExplicitWait());
	
	actions = new Actions(driver);
	actions.moveToElement(Login_In);
	
	actions.click().build().perform();
}

public void CPUID(String CPUID) throws InterruptedException
{
	//log.info("entering sigin_password." + sigin_password);
	this.CPUID.clear();
	this.CPUID.sendKeys(CPUID);
}

public void CPU_fullname(String CPU_fullname) throws InterruptedException
{
	//log.info("entering sigin_password." + sigin_password);
	this.CPU_fullname.clear();
	this.CPU_fullname.sendKeys(CPU_fullname);
}
public void CPU_EntId(String CPU_EntId) throws InterruptedException
{
	//log.info("entering sigin_password." + sigin_password);
	this.CPU_EntId.clear();
	this.CPU_EntId.sendKeys(CPU_EntId);
}
}

