package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
   WebDriver driver =null;
   
   By textbox_search= By.name("q");
   By button_search=By.name("btnK");
   
   
   
   public GoogleSearchPageObjects(WebDriver driver) {
	// TODO Auto-generated constructor stub
	   this.driver=driver;
}



public void settextsearchbox(String text)
   {
	   driver.findElement(textbox_search).sendKeys(text);
	   
	   
   }
   public void clicksearchbutton()
   {
	   driver.findElement(button_search).click();
   }
	
	
	
	
}
