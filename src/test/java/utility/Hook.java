/**
 * 
 */
package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.jna.Platform;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author CHIRAG
 *
 */
public class Hook {

	private static WebDriver driver;
		
	@Before("@appium")
	public void setUpAppium() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.APPLICATION_NAME,"com.android.chrome");
    	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "org.chromium.chrome.browser.ChromeTabbedActivity");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		cap.setCapability(MobileCapabilityType.VERSION,"6.0.1MMB29M");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
