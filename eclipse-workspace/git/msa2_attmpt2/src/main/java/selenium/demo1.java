//package selenium;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class demo1 {
//
//	public static void main(String[] args) 
//	
//	{
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver= new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.getClass();
//		driver.findElement(By.className("")).getLocation();
//		driver.manage().getCookieNamed("").getClass();
//		//driver.navigate().	
//		//driver.switchTo().fr
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -250)", "");
//		//Select selectElement = new Select(driver.findElement(By.id("productId")));
//       // selectElement.get
//	//	driver.get(driver.);
//		//(Keys.RETURN).build().perform();
//		//driver.navigate().("https://www.facebook.com")
//		driver.navigate().forward();
//				driver.switchTo().defaultContent();
//				String strText = driver.findElement(By.name("textboxname")).getAttribute(strText);
//				System.out.println(strText);
//				Select selectElement = new Select(driver.findElement(By.id("productId")));
//		        selectElement.getOptions();
//		       
//				
//	}
//}
