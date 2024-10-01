package Stepdef;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObj.TDpage;
import Util.genericode;
import Util.sharecodestep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class secpage {
	public sharecodestep Sharecodestep;
	public WebElement serch;
	public secpage(sharecodestep Sharecodestep) {
		this.Sharecodestep=Sharecodestep;
	
	}
	
	
	@Then("User clicks on top deals link")
	public void user_clicks_on_top_deals_link() {
		TDpage ser=new TDpage(Sharecodestep.driver3);
		ser.searchbox1();
		Sharecodestep.driver3.manage().window().maximize();
	    
	}
	@Then("Lands on top deal page")
	public void lands_on_top_deal_page() {
		genericode han=new genericode(Sharecodestep.driver3);
		han.handler();
		//Sharecodestep.driver3.switchTo().window(win2);
		serch=Sharecodestep.driver3.findElement(By.xpath("//input[@id='search-field']"));
		  

		
		
	}
	
	@When("^User searched the item by typing (.+) in search box$")
	public void user_searched_the_item_by_typing_in_search_box(String string) {
		
		serch.clear();
		serch.sendKeys(string);
	   
	}
	
}
