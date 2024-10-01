package Stepdef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObj.homepage;
import Util.sharecodestep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {
	public sharecodestep Sharecodestep;

	public Stepdefination(sharecodestep Sharecodestep) {
		
		this.Sharecodestep=Sharecodestep;
	
	}
	
	
@Given("Open the green kart landing page")

public void open_the_green_kart_landing_page() throws IOException {
	
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//ressorces//global.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String url=prop.getProperty("url");
	
	
	Sharecodestep.driver3=new ChromeDriver();
	Sharecodestep.driver3.get(url);
	
    
}
@Given("Navi gate to search box and click")
public void navi_gate_to_search_box_and_click() {
    
	System.out.println("hi guys");
}
@When("^User searched the item by typing (.+)$")
public void user_searched_the_item_by_typing(String string) throws InterruptedException {
	homepage serc=new homepage(Sharecodestep.driver3);
	//WebElement searchbox= Sharecodestep.driver3.findElement(By.xpath("//input[@type='search']"));
	 
   
	serc.searchmeth(string);
	 Thread.sleep(5000);
	

}

@Then("User able to see only item starts with tom")
public void user_able_to_see_only_item_starts_with_tom() {
   
	WebElement verif=Sharecodestep.driver3.findElement(By.xpath("//h4[@class='product-name']"));
	String text=verif.getText().trim();
	String[] str=text.split(" ");
	Assert.assertEquals("Tomato", str[0]);
	
	System.out.println(str[0]);
}

}
