package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	
	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver","S:\\Education-Selenium SDET\\Programs\\Maven_HelloWorld\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://www.numpyninja.com/contact");
		
		WebElement frstnme = chromedriver.findElement(By.name("first-name"));
	//	chromedriver.findElement(By.)
		frstnme.sendKeys("Supriya");
		
		WebElement lastName = chromedriver.findElement(By.id("input_comp-l1c0ku01"));
		lastName.sendKeys("K");	
		
		WebElement email = chromedriver.findElement(By.name("email"));
		email.sendKeys("mistimeetu@gmail.com");
			
		WebElement phone = chromedriver.findElement(By.name("phone"));
		phone.sendKeys("9736413862");
		
		WebElement query = chromedriver.findElement(By.id("textarea_comp-l1c0ku07"));
		query.sendKeys("when next SDET batch will start ?");
		
		//WebElement sendBtn = chromedriver.findElement(By.id("comp-l1c0ku0e3"));
		//sendBtn.click();
		
		
		//to close the driver/
	//chromedriver.close();
	
	}
}
