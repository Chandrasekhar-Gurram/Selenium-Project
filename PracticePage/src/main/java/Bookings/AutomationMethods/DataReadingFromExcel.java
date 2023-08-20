package Bookings.AutomationMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Bookings.ApplicationResources.MethodsUsedForEntireApplication;

public class DataReadingFromExcel extends MethodsUsedForEntireApplication {

	public DataReadingFromExcel(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ReadingData() throws InterruptedException, IOException {
		FileInputStream fileStream = new FileInputStream(
				"C:\\Users\\Chandrasekhar Gurram\\Downloads\\Email Address Data To Send Mails.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fileStream);
		XSSFSheet sheet = workbook.getSheet("Emails");
		Iterator<Row> rIterator = sheet.iterator();
		List<String> excelData = new ArrayList<String>();
		while (rIterator.hasNext()) {
			Row row = rIterator.next();
			Iterator<Cell> CIterator = row.cellIterator();
			while (CIterator.hasNext()) {
				Cell cell = CIterator.next();
				excelData.add(cell.getStringCellValue());
			}
		}

		for (String value : excelData) {
			System.out.println(value + " ");
		}

	}
}
