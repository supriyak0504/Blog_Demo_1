package tutorialsninja;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import org.testng.Assert;
//import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class tutorialNinja {

	public void tutorialapp() throws InterruptedException {

		
		System.setProperty("webDriver.chrome.driver",
				"S:\\Education-Selenium SDET\\Programs\\Maven_HelloWorld\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		ChromeOptions chromeoption = new ChromeOptions();
		//to load page normally by taking al time to load. Even if its taking time.
		
		chromeoption.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("http://tutorialsninja.com/demo/index.php");
		
		chromedriver.manage().window().maximize();
	
		chromedriver.findElement(By.className("pull-left")).click();
		chromedriver.findElement(By.xpath("//button[text() = '€Euro']")).click();
		chromedriver.findElement(By.xpath("//a[text() = 'Canon EOS 5D']")).click();

		chromedriver.findElement(By.xpath("//button[text() = 'Add to Cart']")).click();
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String m = chromedriver.findElement(By.xpath("//div[@class = 'text-danger']")).getText();
		System.out.println("M is:" + m);
		chromedriver.findElement(By.xpath("//a[text()='Qafox.com']")).click();
		chromedriver.findElement(By.xpath("//a[text()='iPhone']")).click();
		String val = chromedriver.findElement(By.id("input-quantity")).getAttribute("value");
		System.out.println("Quantity is " + val);
		chromedriver.findElement(By.id("input-quantity")).clear();
		chromedriver.findElement(By.xpath("//input[@id='input-quantity']")).sendKeys("2");
		chromedriver.findElement(By.xpath("//button[text() = 'Add to Cart']")).click();
		String alert = chromedriver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"))
				.getText();
		System.out.println("Success message is " + alert);
		chromedriver.findElement(By.xpath("//span[@id='cart-total']")).click();
		chromedriver.findElement(By.xpath("//i[@class= 'fa fa-shopping-cart']")).click();
		chromedriver.findElement(By.xpath("//div[@class='input-group btn-block']//input[@type='text']")).click();
		chromedriver.findElement(By.xpath("//div[@class='input-group btn-block']//input[@type='text']")).clear();
		chromedriver.findElement(By.xpath("//div[@class='input-group btn-block']//input[@type='text']")).sendKeys("1");
		chromedriver.findElement(By.xpath("//button[@data-original-title='Update']")).click();
		System.out.println(chromedriver
				.findElement(By.xpath("//div [contains(@class,'col-sm-4 col-sm-offset-8')]/table/tbody/tr[2]/td[2]"))
				.getText());
		System.out.println(chromedriver
				.findElement(By.xpath("//div [contains(@class,'col-sm-4 col-sm-offset-8')]/table/tbody/tr[3]"))
				.getText());
		chromedriver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		System.out.println(
				chromedriver.findElement(By.xpath("//div[@class = 'alert alert-danger alert-dismissible']")).getText());
		chromedriver.findElement(By.xpath("//div[contains(@class,'input-group btn-block')]/span/button[2]")).click();
		chromedriver.findElement(By.xpath("//a[text()='Continue']")).click();
		chromedriver.findElement(By.xpath("//a[text()='MacBook']")).click();
		System.out.println("Default quantity of mackbook is "
				+ chromedriver.findElement(By.xpath("//input[@name='quantity']")).getAttribute("value"));
		chromedriver.findElement(By.xpath("//button[@id='button-cart']")).click();
		System.out.println(
				chromedriver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		chromedriver.findElement(By.id("cart-total")).click();
		chromedriver.findElement(By.xpath("//strong[text()='View Cart']")).click();
		chromedriver.findElement(By.xpath("//a[@class='accordion-toggle']")).click();
		WebElement couponcode = chromedriver.findElement(By.xpath("//input[@id='input-coupon']"));
		couponcode.sendKeys("ABCD123");
		chromedriver.findElement(By.xpath("//input[@id='button-coupon']")).click();

		System.out.println(
				chromedriver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText());
		Thread.sleep(2000);

		chromedriver.findElement(By.xpath("//a[text()='Use Gift Certificate ']")).click();

		chromedriver.findElement(By.id("input-voucher")).sendKeys("AXDFGH123");
		chromedriver.findElement(By.id("button-voucher")).click();
		System.out.println(chromedriver.findElement(By
				.xpath("//div[text()=' Warning: Gift Certificate is either invalid or the balance has been used up!']"))
				.getText());

		chromedriver.findElement(By.id("input-voucher")).clear();
		Thread.sleep(3000);
		chromedriver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		chromedriver.findElement(By.xpath("//input[@id='button-account']")).click();
		chromedriver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys("Supriya");
		chromedriver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys("k");
		chromedriver.findElement(By.xpath("//input[@id='input-payment-email']")).sendKeys("k.supri1234@gmail.com");
		chromedriver.findElement(By.xpath("//input[@id='input-payment-telephone']")).sendKeys("122334989");
		chromedriver.findElement(By.xpath("//input[@id='input-payment-password']")).sendKeys("Abcdef123");
		chromedriver.findElement(By.xpath("//input[@id='input-payment-confirm']")).sendKeys("Abcdef123");
		chromedriver.findElement(By.xpath("//input[@id='input-payment-address-1']")).sendKeys("128 bbell blvd");
		// chromedriver.findElement(By.xpath("//input[@id='input-payment-address-2']")).sendKeys("123");
		chromedriver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys("wentzville");
		chromedriver.findElement(By.xpath("//input[@id='input-payment-postcode']")).sendKeys("63385");
		WebElement countrySel = chromedriver.findElement(By.id("input-payment-country"));
		Select country = new Select(countrySel);
		country.selectByVisibleText("United States");
		WebElement zoneselcnty = chromedriver.findElement(By.id("input-payment-zone"));
		Select region = new Select(zoneselcnty);
		region.selectByVisibleText("Missouri");
		chromedriver.findElement(By.xpath("//input[@name='agree']")).click();
		chromedriver.findElement(By.xpath("//input[@id='button-register']")).click();
		chromedriver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("i need the order processed");
		chromedriver.findElement(By.xpath("//input[@name='agree']")).click();
		chromedriver.findElement(By.xpath("//input[@id='button-payment-method']")).click();
		System.out.println(
				chromedriver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText());
		Thread.sleep(2000);
		chromedriver.findElement(By.linkText("Contact Us")).click();
		chromedriver.findElement(By.id("input-enquiry")).sendKeys("I dont have credit card,please contact me");
		chromedriver.findElement(By.xpath("//input[@value='Submit']")).click();
		chromedriver.findElement(By.xpath("//a[@class ='btn btn-primary']")).click();
		chromedriver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		tutorialNinja obj = new tutorialNinja();
		obj.tutorialapp();

	}
}
