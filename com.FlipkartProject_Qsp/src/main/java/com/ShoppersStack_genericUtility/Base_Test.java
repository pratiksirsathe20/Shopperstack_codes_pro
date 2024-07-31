package com.ShoppersStack_genericUtility;




	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;

import com.ShoppersStack_pom.Home_Page;
import com.ShoppersStack_pom.Login_Page;
import com.ShoppersStack_pom.Myprofile_Page;
import com.ShoppersStack_pom.Welcome_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class Base_Test {
		
		
		public ExtentSparkReporter spark;
		public ExtentReports report;
		public File_Utility file=new File_Utility();
		public WebDriver driver;
		public Welcome_Page welcome;
		public WebDriverWait wait;
		public Login_Page login;
		public Home_Page home;
		public Myprofile_Page page;
		public static WebDriver sDriver;
		public File_Utility util=new File_Utility();
		public Java_Utility java=new Java_Utility();
		public ExtentTest test;
		public Webdriver_Utility web = new Webdriver_Utility();
		
		@BeforeSuite
		public void beforeSuite(){
			System.out.println("@BeforeSuite");
		}
		
		@BeforeTest
		public void beforeTest(){
			System.out.println("@BeforeTest");
			spark=new ExtentSparkReporter(Framework_Constant.reportPath+ java.localDateTime()+ ".html");
			report=new ExtentReports();
			report.attachReporter(spark);
			test=report.createTest("Demo");
		}
		
		@BeforeClass
		public void beforeClass() throws IOException{
			System.out.println("@BeforeClass");
			String browser = file.readPropertyData("browse");
			String url = file.readPropertyData("url");
			
//			String browser = System.getProperty("browser");
//			String url = System.getProperty("url");
			
			if(browser.contains("chrome")) {
				driver=new ChromeDriver();
			}else if (browser.contains("firefox")) {
				driver=new FirefoxDriver();
			}else if (browser.contains("edge")) {
				driver=new EdgeDriver();
			}else {
				System.out.println("Please Provide Valid Browser Thank You....");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);
			home=new Home_Page(driver);
		}
		
		@BeforeMethod
		
		public void beforeMethod() throws IOException{
			System.out.println("@BeforeMethod");
			welcome=new Welcome_Page(driver);
			WebElement ele = welcome.getloginBtn();
			
			wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
			ele.click();
			
			login=new Login_Page(driver);
			login.getEmailTF().sendKeys(file.readPropertyData("username"));
			login.getPassword().sendKeys(file.readPropertyData("pass"));
			login.getLoginBtn().click();
		}
		
		@AfterMethod
		public void afterMethod(){
			System.out.println("@AfterMethod");
			
			home.getSetting().click();
			home.getLogOut().click();
			
		}
		
		@AfterClass
		public void afterClass() throws InterruptedException{
			System.out.println("@AfterClass");
			Thread.sleep(3000);
			driver.quit();
		}
		
		@AfterTest
		public void afterTest(){
			System.out.println("@AfterTest");
			report.flush();
		}
		
		@AfterSuite
		public void afterSuite(){
			System.out.println("@AfterSuite");
		}

	}

