package Bookings.AutomationMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Bookings.ApplicationResources.MethodsUsedForEntireApplication;

public class UploadAttachment extends MethodsUsedForEntireApplication {

	String toEmailAddress = "navaneetha.narahari@cognine.com";
	String subject = "Learning: Email Sending with Automation";
	String body = "Hi There,\r\n" + "This email is sent through selenium automation.\r\n" + "\r\n" + "Thanks,\r\n"
			+ "Chandrasekhar Gurram";

	public UploadAttachment(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".upload_txt")
	WebElement attachment;

	public void SendEmailUsingOutlook() throws InterruptedException, IOException {
		attachment.sendKeys("C:\\Users\\Chandrasekhar Gurram\\Downloads\\4503956.pdf");

		/*
		 * browseThisComputerButton.click(); Runtime.getRuntime().
		 * exec("C:\\Users\\Chandrasekhar Gurram\\Documents\\UploadFile.exe");
		 */
		/*
		 * attachFile.sendKeys(
		 * "C:\\Users\\Chandrasekhar Gurram\\Downloads\\Walmart Notifications - Sprint 10- Standup Notes.xlsx"
		 * );
		 */
		// WebElement element = driver.findElement(By.xpath("//input[@name='file_1']"));
		LocalFileDetector detector = new LocalFileDetector();

		// Now, give the file path and see the magic :)
		/*
		 * String path =
		 * "C:\\Users\\Chandrasekhar Gurram\\Downloads\\Walmart Notifications - Sprint 10- Standup Notes.xlsx"
		 * ; File f = detector.getLocalFile(path); ((RemoteWebElement)
		 * browseThisComputerButton).setFileDetector(detector);
		 * browseThisComputerButton.sendKeys(f.getAbsolutePath());
		 */

		// now click the button to finish
		// driver.findElementByXPath("//html/body/div[9]/div[1]/a/span").click();

	}

}
