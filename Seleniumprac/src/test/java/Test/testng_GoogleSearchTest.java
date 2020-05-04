//This foe GoogleSearchPage
package Test;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Pages.GoogleSearchPage;

public class testng_GoogleSearchTest {
	private static WebDriver driver =null;
	
	
	@BeforeTest
	public void setuptestng()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
		
	}
	
	@Test
	public  void googlesearch(){
		   
	        driver.get("https://google.com");
	        GoogleSearchPage.textboxsearch(driver).sendKeys("hello");
			//List<WebElement> listofinput = driver.findElements(By.xpath("//input"));
			//System.out.print(listofinput);
	        GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	        
		
		
		
	}
	@AfterTest
    public void teardowntest()
    {
    	driver.close();
        System.out.print("test completed");
    }
	
	
	
}
