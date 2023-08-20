package Bookings.AutomationMethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Bookings.ApplicationResources.MethodsUsedForEntireApplication;

public class OutlookSignIn extends MethodsUsedForEntireApplication {

	String emailValue = "chandrasekhar.gurram@cognine.com";
	String passwordValue = "Naveenbabu@45";

	public OutlookSignIn(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-task='signin']")
	WebElement signInButton;

	@FindBy(xpath = "//*[@id='i0116']")
	WebElement email_SignIn;

	@FindBy(css = "#idSIButton9")
	WebElement nextButton;

	@FindBy(css = "#aadTile")
	WebElement accounType_SignIn;

	@FindBy(css = "#i0118")
	WebElement password;

	@FindBy(css = "#i0118")
	WebElement password_SignIn;

	@FindBy(xpath = "//*[@id='KmsiCheckboxField']")
	WebElement dontShowThisAgainCheckbox;

	public SendEmail SignIntoOutlook() throws InterruptedException {
		signInButton.click();
		waitForElementToAppear(email_SignIn);
		email_SignIn.sendKeys(emailValue);
		nextButton.click();
		waitForElementToAppear(accounType_SignIn);
		accounType_SignIn.click();
		Thread.sleep(2000);
		boolean typeFlag = accounType_SignIn.isDisplayed();
		if (typeFlag) {
			accounType_SignIn.click();
		}
		waitForElementToAppear(password_SignIn);
		password_SignIn.sendKeys(passwordValue);
		nextButton.click();
		waitForElementToAppear(dontShowThisAgainCheckbox);
		dontShowThisAgainCheckbox.click();
		nextButton.click();
		SendEmail sendemail=new SendEmail(driver); 
		return sendemail;
	}

}
