package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_fblogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bubu\\OneDrive\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("me.gupta511@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Mottu0617");
		//Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
