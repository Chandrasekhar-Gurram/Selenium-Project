package EndToEnd.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Bookings.AutomationMethods.DataReadingFromExcel;
import Bookings.AutomationMethods.OutlookSignIn;
import Bookings.AutomationMethods.SendEmail;
import EndToEnd.TestComponents.BaseComponentForTestCases;

public class DataReading extends BaseComponentForTestCases {
	@Test
	public void SignUp() throws IOException, InterruptedException {
		DataReadingFromExcel obj = new DataReadingFromExcel(driver);
		obj.ReadingData();
	}
}
