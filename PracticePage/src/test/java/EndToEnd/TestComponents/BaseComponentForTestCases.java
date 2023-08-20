package EndToEnd.TestComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseComponentForTestCases {
	public static Properties properties;
	public static WebDriver driver;
	public String ApplicationURL;
	public String AttachmentURL;
	public String BrowserName;
	public String ToEmail;

	public WebDriver PageInitialisation() throws IOException {
		properties = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\java\\Bookings\\ApplicationResources\\DataInputsToAutomateBookings");
		properties.load(fis);
		ApplicationURL = properties.getProperty("ApplicationURL");
		AttachmentURL = properties.getProperty("AttachmentURL");
		ToEmail = System.getProperty("ToEmail") != null ? System.getProperty("ToEmail")
				: properties.getProperty("ToEmail");
		BrowserName = System.getProperty("Browser") != null ? System.getProperty("Browser")
				: properties.getProperty("Browser");
		if (BrowserName.contains("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			if (BrowserName.contains("Headless")) {
				options.addArguments("headless");
			}
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
//			driver.manage().window().setSize(new Dimension(1490, 900));
		} else if (BrowserName.contains("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (BrowserName.contains("Firefox")) {
			// Need to write the implemention
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public WebDriver LaunchingTheApplication() throws IOException {
		driver = PageInitialisation();
		driver.get(ApplicationURL);
		return driver;
	}
}
