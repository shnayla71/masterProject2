package Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

	public class Driver {

		private Driver() {
		}
		private static WebDriver driver;
		public static WebDriver getDriver() {
			if (driver == null) {
				String browser = ConfigurationReader.getProperty("browser");
				switch (browser) {
					case "chrome":
						WebDriverManager.chromedriver().setup();
						driver = new ChromeDriver();
						break;
					case "safari":
						driver = new SafariDriver();
						driver.manage().window().maximize();
						break;
					case "firefox":
						WebDriverManager.firefoxdriver().setup();
						driver = new FirefoxDriver();
						break;
					case "chrome-headless":
						WebDriverManager.chromedriver().setup();
						driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
						break;
					case "firefox-headless":
						WebDriverManager.firefoxdriver().setup();
						driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
						break;

					case "firefox-remote":
						try {
							//to request grid to run tests on firefox
							FirefoxOptions firefoxOptions = new FirefoxOptions();
							URL url = new URL("http://54.175.164.199:4444/wd/hub");
							driver = new RemoteWebDriver(url, firefoxOptions);
						} catch (MalformedURLException e) {
							e.printStackTrace();
						}
					default:
						throw new RuntimeException("Wrong browser name: "+browser);
				}
			}
			return driver;
		}
		public static void closeDriver() {
			if (driver != null) {
				driver.quit();
				driver = null;
			}
		}

	}

