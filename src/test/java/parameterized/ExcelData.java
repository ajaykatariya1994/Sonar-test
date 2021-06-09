package parameterized;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(readExcel("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(readExcel("password"));
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

	}

	public static String readExcel(String colName) throws IOException {
		String colValue = "";
		String path = System.getProperty("user.dir") + "//src//test//resources//DataRepository//exceldata.xlsx";
		FileInputStream fin = new FileInputStream(path);
		// for .xls use HSSF classes
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet loginSheet = workbook.getSheetAt(0);

		for (int i = 1; i <= loginSheet.getLastRowNum(); i++) {
			XSSFRow row = loginSheet.getRow(i);
			if (row.getCell(0).getStringCellValue().equalsIgnoreCase((colName))) {
				colValue = row.getCell(1).getStringCellValue();
			}
		}
		workbook.close();
		return colValue;

	}

	}


