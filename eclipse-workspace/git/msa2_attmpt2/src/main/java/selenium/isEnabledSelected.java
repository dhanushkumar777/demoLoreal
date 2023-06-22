package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isEnabledSelected {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://mindtree-sandbox-uatx.unqork.io/#/display/631ec80b6e7aebd4423a412d");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@aria-label,'All above details are valid based on my knowledge.')]")).click();
		
		Thread.sleep(3000);
		
		
		WebElement btn = driver.findElement(By.xpath("//input[contains(@aria-label,'All above details are valid based on my knowledge.')]"));
	if(btn.isSelected()) {
		System.out.println("pass:element is enabled");
		btn.click();
		Thread.sleep(3000);
	}
	else
	{
		System.out.println("fail:element is not enebaled");
	}
	
	driver.close();
	}

}