package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage {
	public WebDriver driver;

	public homepage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	By searchbox=By.xpath("//input[@type='search']");
	
	public void searchmeth(String string) {
	driver.findElement(searchbox).sendKeys(string);;
	}

}
