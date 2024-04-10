package demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo{
	
	public static void main (String []args) throws InterruptedException {

		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver2 = new SafariDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("harsha@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("123456789");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("[class='error']")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("[placeholder='Name']")).sendKeys("harsha");
		driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("harsharow");
		driver.findElement(By.cssSelector("[placeholder='Phone Number']")).sendKeys("7736353533");
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("harsha@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.className("logout-btn")).click();
		driver.quit();
	}

}
