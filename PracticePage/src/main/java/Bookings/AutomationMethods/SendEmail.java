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

public class SendEmail extends MethodsUsedForEntireApplication {

	String subject = "Learning: Email Sending with Automation";
	String body = "Hi There,\r\n" + "This email is sent through selenium automation.\r\n" + "\r\n" + "Thanks,\r\n"
			+ "Chandrasekhar Gurram";

	public SendEmail(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@aria-label='To']")
	WebElement toAddress;

	@FindBy(xpath = "//button[@aria-label='New mail']")
	WebElement newEmail;

	@FindBy(xpath = "//input[@aria-label='Add a subject']")
	WebElement emailSubject;

	@FindBy(xpath = "//*[@id='editorParent_1']/div[1]")
	WebElement emailBody;

	@FindBy(xpath = "//*[@id='5']/span")
	WebElement fileInsertion;

	@FindBy(xpath = "//*[@id='620_21_14']/span")
	WebElement attachFile;

	@FindBy(xpath = "//*[@id='Ribbon-620_21_14Dropdown']/div/ul/li[2]/div/ul/li[2]/div/button/span")
	WebElement fileLink;

	@FindBy(xpath = "//*[@id='Ribbon-620_21_14Dropdown']/div/ul/li[1]/div/ul/li[1]/button/div")
	WebElement browseThisComputerButton;

	@FindBy(xpath = "//*[@aria-label='Send']/span[1]/button[1]")
	WebElement sendButton;

	public void SendEmailUsingOutlook(String toEmailAddress) throws InterruptedException, IOException {
		newEmail.click();
		waitForElementToAppear(toAddress);
		toAddress.sendKeys(toEmailAddress);
		emailSubject.sendKeys(subject);
		emailBody.sendKeys(body);
		sendButton.click();

		/*
		 * Initial Steps to attach the file waitForElementToAppear(fileInsertion);
		 * fileInsertion.click(); waitForElementToAppear(attachFile);
		 * attachFile.click(); // fileLink.click();
		 */
		/*
		 * Selecting file using SendKeys approach browseThisComputerButton.
		 * sendKeys("C:\\Users\\Chandrasekhar Gurram\\Downloads\\4503956.pdf");
		 */

		/*
		 * Selecting the File from FileExplorer using AutoIt
		 * browseThisComputerButton.click(); Runtime.getRuntime().
		 * exec("C:\\Users\\Chandrasekhar Gurram\\Documents\\UploadFile.exe");
		 */

		/*
		 * File Selection with different approach LocalFileDetector detector = new
		 * LocalFileDetector(); String path =
		 * "C:\\Users\\Chandrasekhar Gurram\\Downloads\\Walmart Notifications - Sprint 10- Standup Notes.xlsx"
		 * ; File f = detector.getLocalFile(path); ((RemoteWebElement)
		 * browseThisComputerButton).setFileDetector(detector);
		 * browseThisComputerButton.sendKeys(f.getAbsolutePath());
		 */

	}

}
