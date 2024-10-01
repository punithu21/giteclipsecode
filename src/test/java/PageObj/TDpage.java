package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TDpage {
	public WebDriver driver;

	public TDpage(WebDriver driver) {
		this.driver=driver;
	}
	
	By searchbox=By.xpath("//a[@href='#/offers']");
	
	public void searchbox1() {
		driver.findElement(searchbox).click();
	}
	
	

}
