import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("hello");;
		//List<WebElement> listofinput = driver.findElements(By.xpath("//input"));
		//System.out.print(listofinput);
        driver.findElement(By.name("btnK")).click();
        driver.close();
		
	}

}
