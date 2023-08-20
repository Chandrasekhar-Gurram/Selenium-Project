package EndToEnd.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Bookings.AutomationMethods.OutlookSignIn;
import Bookings.AutomationMethods.SendEmail;
import EndToEnd.TestComponents.BaseComponentForTestCases;

public class TestCasesToSignUp extends BaseComponentForTestCases {
	@Test
	public void SignUp() throws IOException, InterruptedException {
		driver = LaunchingTheApplication();
		OutlookSignIn outlookSignIn = new OutlookSignIn(driver);
		SendEmail sendEmailObj = outlookSignIn.SignIntoOutlook();
		sendEmailObj.SendEmailUsingOutlook(ToEmail);
	}
}
