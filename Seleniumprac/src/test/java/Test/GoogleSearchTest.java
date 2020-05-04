//This foe GoogleSearchPage
package Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver =null;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	googlesearch();
	}
	
	public static void googlesearch(){
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\selenium\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://google.com");
	        GoogleSearchPage.textboxsearch(driver).sendKeys("hello");
			//List<WebElement> listofinput = driver.findElements(By.xpath("//input"));
			//System.out.print(listofinput);
	        GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	        driver.close();
		
		
		
	}

}
