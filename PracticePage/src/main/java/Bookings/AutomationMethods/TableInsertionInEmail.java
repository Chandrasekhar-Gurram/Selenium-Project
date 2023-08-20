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

public class TableInsertionInEmail extends MethodsUsedForEntireApplication {

	String subject = "Learning: Email Sending with Automation";
	String body = "Hi There,\r\n" + "This email is sent through selenium automation.\r\n" + "\r\n" + "Thanks,\r\n"
			+ "Chandrasekhar Gurram";

	public TableInsertionInEmail(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='More formatting options']")
	WebElement moreOptions;

	@FindBy(xpath = "//*[@aria-label='Insert table']")
	WebElement insertTable;

	@FindBy(xpath = "//*[@aria-label='2 by 3 table']")
	WebElement tableSize;

	@FindBy(xpath = "//*[@id=\"editorParent_6\"]/div/div/span/table/tbody/tr[1]/td[1]")
	WebElement firstRowData;

	public void SendEmailUsingOutlook(String toEmailAddress) throws InterruptedException, IOException {

	}

}
