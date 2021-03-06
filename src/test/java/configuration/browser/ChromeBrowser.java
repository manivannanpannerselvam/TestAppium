
package configuration.browser;

import java.util.HashMap;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeBrowser {

	public Capabilities getChromeCapabilities() {
		
		 String downloadFilepath = "C:\\Users\\Mani\\git\\tests\\Cucumber\\src\\test\\resources\\testData";
		 
	       HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	       chromePrefs.put("profile.default_content_settings.popups", 0);
	       chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", chromePrefs);
	       option.addArguments("--test-type");
	       option.addArguments("--disable-extensions"); //to disable browser extension popup
	      // option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		option.addArguments("start-maximized");
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setJavascriptEnabled(true);
		chrome.setCapability(ChromeOptions.CAPABILITY, option);
		return chrome;
	}


}
