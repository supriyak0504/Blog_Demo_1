package mouseactions;

import java.sql.Driver;
import java.time.Duration;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	
	public static void covidhospital() throws InterruptedException{
		
		System.setProperty("webDriver.chrome.driver",
				"S:\\Education-Selenium SDET\\Programs\\Maven_HelloWorld\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		ChromeOptions chromeoption = new ChromeOptions();
		
		chromeoption.setAcceptInsecureCerts(true);
		
		
		//to load page normally by taking al time to load. Even if its taking time.
		chromeoption.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		WebDriver chromedriver = new ChromeDriver(chromeoption);
		chromedriver.get("https://westbengal.covidsafe.in/");
		chromedriver.manage().window().maximize();
//		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		int noOfhosp = chromedriver.findElements(By.tagName("tr")).size();
		
		
		for (int i =1 ; i<noOfhosp; i++) {
			
			WebElement hospLink = chromedriver.findElement(By.xpath("//tbody/tr["+i+"]//strong"));
			String hospName = hospLink.getText();
			System.out.println("Name of the hospital is :"+hospName);
			
	
	}
}


	
	public static void main(String[] args) {
		try {
			covidhospital();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}