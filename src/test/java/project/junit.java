package project;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class junit 
{
		   WebDriver driver= null;
			ExtentReports extentReport;
			ExtentHtmlReporter htmlReporter;
			ExtentTest testCase;
		 @BeforeSuite
			public void openbrowser()
			{
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				
				  extentReport = new ExtentReports();
				  htmlReporter = new ExtentHtmlReporter("Dhilipreportjunit.html");
				  extentReport.attachReporter(htmlReporter);
			}
		  @Test
			public void main()
			{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			this.driver = new ChromeDriver();
			//WebDriver d=new ChromeDriver();
			testCase = extentReport.createTest("Loginbutton");
			driver.get("https://www.youtube.com/");
			System.out.println(driver.getTitle ());
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getPageSource());
			}
			@AfterSuite
			public void closebrowser()
			{
			driver.close();
			extentReport.flush();
			}
		

	   
	}

