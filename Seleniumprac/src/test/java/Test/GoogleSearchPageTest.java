//This is for GoogleSearchPageObjects

package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import Pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	googletestsearch();	

	}

	public static void googletestsearch()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\selenium\\chromedriver.exe");
	        driver = new ChromeDriver();
	        
	        GoogleSearchPageObjects searchobj =new GoogleSearchPageObjects(driver);
	        driver.get("https://google.com");
	        searchobj.settextsearchbox("hello");
			//List<WebElement> listofinput = driver.findElements(By.xpath("//input"));
			//System.out.print(listofinput);
	        searchobj.clicksearchbutton();
	        driver.close();
	}
	
}
