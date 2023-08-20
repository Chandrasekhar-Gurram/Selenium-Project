package Bookings.ApplicationResources;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodsUsedForEntireApplication {
	public WebDriver driver;

	public MethodsUsedForEntireApplication(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void waitForElementToAppear(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
