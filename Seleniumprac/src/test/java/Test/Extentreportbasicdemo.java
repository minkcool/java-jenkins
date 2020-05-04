package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreportbasicdemo {
	
	private static WebDriver driver =null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ExtentHtmlReporter hrepo= new ExtentHtmlReporter("extent.html");
     ExtentReports extent =new ExtentReports();
     extent.attachReporter(hrepo);
     ExtentTest test2=extent.createTest("GoogleSearch one","test to validate google search");
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\selenium\\chromedriver.exe");
     driver = new ChromeDriver();
     
     test2.log(Status.INFO,"starting test case");
     driver.get("https://www.google.com");
     test2.pass("navigated to google");
     
     driver.findElement(By.name("q")).sendKeys("helo");
     test2.pass("Entered text in search box");
     
     driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);;
     test2.fail("buton clicked");
     
     driver.close();
     driver.quit();
	 test2.pass("Closed the browser");
	 
	 test2.info("Test completed");
	 
	 extent.flush();//to write everything to report
	}

}
