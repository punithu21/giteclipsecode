package Util;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class genericode {
	
	public WebDriver driver;

	public genericode(WebDriver driver) {
		this.driver=driver;
	}
	
	public void handler() {
		
		Set<String> handles=driver.getWindowHandles();
		Iterator iter=handles.iterator();
		String win1=(String) iter.next();
		String win2=(String) iter.next();
		driver.switchTo().window(win2);
			}
	

}
