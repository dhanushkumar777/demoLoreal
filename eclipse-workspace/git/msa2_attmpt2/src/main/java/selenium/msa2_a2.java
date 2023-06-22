package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class msa2_a2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		ChromeOptions p = new ChromeOptions();
//		 p.addArguments("--disable-notifications");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earphones");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 Thread.sleep(3000);
			
		 driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 
		 //driver.findElement(By.xpath("//select[@title='Search in']"));
			
		 

//		WebElement ele = driver.findElement(By.xpath("//select[@title='Search in']"));
//		Select s=new Select(ele);
//		s.selectByIndex(2);
//		
//		 driver.findElement(By.xpath("//div[@aria-label='bluetooth earphones']")).click();
//		 
//		 Thread.sleep(3000);
		 
		 WebElement ele1=driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.'][1]"));
		Actions a=new Actions(driver);
		a.moveToElement(ele1).perform();
		
//		driver.get("https://www.facebook.com/");
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//input[@data-testid='royal_email'])")).sendKeys("dhanu");
//		
//		driver.findElement(By.xpath("(//input[@data-testid='royal_pass'])")).sendKeys("12344");
//		
//		driver.findElement(By.xpath("(//button[@data-testid='royal_login_button'])")).click();
//		
		    
		
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		driver.findElement(By.id("email")).sendKeys("dhanu");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Not you?')])")).click();
		Thread.sleep(10000);
		//driver.findElement(by.)
		driver.switchTo().parentFrame();*/
		//Thread.sleep(3000);
//		WebDriverWait d1=new WebDriverWait(driver,20);
		//d1.until(ExpectedConditions.(By.xpath("(//a[@class='login']//span)")));
//		
//		driver.findElement(By.xpath("(//input[@id='email'])")).sendKeys("oct.test@yahoo.com");
//		driver.findElement(By.xpath("(//input[@id='passwd'])")).sendKeys("test123");
//		driver.findElement(By.xpath("(//button[@id='SubmitLogin']//span)")).click();
//		WebDriverWait d2=new WebDriverWait(driver,20);
//		d2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@id='SubmitLogin']//span)")));
//		String substr;
//		substr=driver.findElement(By.xpath("(//span[contains(text(),'Testaccount T')])")).getText();
//		System.out.println(substr);
//		if(substr.contains("Testaccount T")) {
//			System.out.println("verification success");
//		Image.
//		Cordinate cordinate= Image.
//		Point point =Image.getPosition();
////		}
//		WebElement ele = driver.findElement(By.xpath("(//a[contains(text(),'Not you?')])"));
//		Actions a = new Actions(driver);
//		a.moveToElement(ele).perform();
//		driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[2]")).click();
//		Thread.sleep(4000);
//		
//		
//		 WebElement dress2 = driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-line last-item-of-tablet-line last-mobile-line']"));
//		 Actions a2 = new Actions(driver);  
//		 a2.moveToElement(dress2).perform();
//	        Thread.sleep(2000);
//	        driver.findElement(By.xpath("(//a[@class='add_to_compare'])[2]")).click();
//	        Thread.sleep(3000);
//
//	        
//	        WebElement dress3 = driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-in-line last-line first-item-of-tablet-line last-item-of-mobile-line last-mobile-line']"));
//	        Actions a3 = new Actions(driver);
//	        a3.moveToElement(dress3).perform();
//	        Thread.sleep(2000);
//	        driver.findElement(By.xpath("(//a[@class='add_to_compare'])[2]")).click();
//	        Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Compare (')][1]")).click();
//		//cart
//		String substr2=driver.findElement(By.xpath("//span[contains(text(),'$16.40')]")).getText();
//		System.out.println(substr2);
//		
//		driver.findElement(By.xpath("(//div[@class='button-container']//a[@class='button ajax_add_to_cart_button btn btn-default']//span[2]")).click();
//		
//		String substr3=driver.findElement(By.xpath("//span[@id='layer_cart_product_price']")).getText();
//		System.out.println(substr3);
//		if(substr3==substr2) {
//			System.out.println("verification success");
//		}
//		
//		
//		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
//		driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=order'])[3]")).click();
//		
//		String s4 = driver.findElement(By.xpath("(//span[@class='price'])[3]")).getText();
//		if(s4==substr3) {
//			System.out.println("Prise is same");
//		}else {
//			System.out.println("Prise is different");
//		}
		
		///driver.close();
		
		
		

}
}