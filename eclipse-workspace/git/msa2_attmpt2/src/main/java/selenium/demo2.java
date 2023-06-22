package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {
	public static void main(String args[]) throws InterruptedException
	{
		//WebDriverManager.edgedriver();
		//System.setProperty("webdriver.chrome.driver","./drivers/chrome.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver1= new EdgeDriver();
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeDriver driver1= new ChromeDriver();
		//WebDriver driver1= new EdgeDriver();
		driver1.manage().deleteAllCookies();
		driver1.manage().window().maximize();
		
		
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.get("https://inigoinsurance.com/");
		Thread.sleep(4000);
		driver1.findElement(By.xpath("//i[@class='open txt-white fa-regular fa-bars']")).click();
		Thread.sleep(5000);
		
		//driver1.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("Geeta");
				
		//driver1.findElement(By.xpath("(//input[@data-testid='royal_pass'])")).sendKeys("12344");
		
		driver1.findElement(By.xpath("//li[@id='menu-item-219']/child::a")).click();
		System.out.println("poooooooooooojiii");
		driver1.close();
//		driver1.findElement(By.xpath("//section[@id='section-2']/child::div[2]/child::div/child::div/child::div/child::div")).click();
//		Thread.sleep(2000);
		
		
		
		
		
		


		
	}

}
