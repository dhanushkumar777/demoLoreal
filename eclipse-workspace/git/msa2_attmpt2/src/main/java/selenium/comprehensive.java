package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class comprehensive {
	public static void main(String[] args) throws InterruptedException {

	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

        

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	driver.get("https://tide.com/en-us");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	//wait.until(ExpectedConditions.(By.xpath("//iframe[@class='lilo3746-iframe']")));
			
   
    driver.findElement(By.xpath("//iframe[@class='lilo3746-iframe']//following-sibling::a")).click();
	Thread.sleep(1000);
	
	/* driver.findElement(By.xpath("//a[@href='/en-us/sign-in']")).click();
	 driver.findElement(By.xpath("//a[@class='event_internal_link']")).click();
	 //Thread.sleep(3000);
	 //driver.findElement(By.id("name")).sendKeys("Dhanush");
	 //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hdhd");
	 driver.findElement(By.id("email")).sendKeys("dhanu1999kumar@gmail.com");
	 driver.findElement(By.id("password")).sendKeys("123466");
	 driver.findElement(By.id("submit")).click();*/
	
	//"p&G" click and mouse over and verify text
/*	driver.findElement(By.cssSelector("img[src='/images/header_logo_png.png']")).click();
	WebElement ele = driver.findElement(By.xpath("//div[@class='navigation']//li//span[contains(text(),'Our Company')]"));
	Actions a = new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.linkText("Leadership")).click();
	driver.findElement(By.xpath("//span[contains(text(),'A team with the future in mind')]")).isDisplayed();
	driver.close();
*/
	
	//mouse over "shop products" and click "packs" and verify text
	/*WebElement ele = driver.findElement(By.linkText("Shop Products"));
	Actions a = new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.xpath("//div[@class='submenu-child']//span[contains(text(),'Pacs')]")).click();
	Thread.sleep(3000);
	String s=driver.findElement(By.xpath("//strong[contains(text(),'Tide Laundry Pacs')]")).getText();
	System.out.println(s);*/
	
	
	//contact
	driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
	 WebDriverWait wait1=new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Live Chat')]")));
		String s=driver.findElement(By.xpath("//p[contains(text(),'From Tide’s expert clean team')][1]")).getText();
		System.out.println(s);
		//send keys after ccontact click
		//driver.switchTo().frame(1);
	// driver.findElement(By.id("j_id0:j_id1:j_id2:idForm:j_id592:j_id593:theSearchstring")).sendKeys("buy");
		//driver.switchTo().frame(1);
		//driver.findElement(By.xpath("//input[@class='searchInput']/parent::*/child::*[2]")).sendKeys("buy");
	 
	 //FAQ
//	 driver.switchTo().frame(0);
//	 driver.findElement(By.xpath("//img[@class='HalfOpacity']")).click();
//	 Thread.sleep(3000);
		
		
		
	 
	 
	

}
}
