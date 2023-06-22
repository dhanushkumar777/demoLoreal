//package selenium;
//
//
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class popups {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver= new EdgeDriver();
//
//		//WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
//		driver.ge
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
//		
//		Thread.sleep(2000);
//		
//		Alert a = driver.switchTo().alert();
//		//System.out.println(a.getText());
//		a.accept();
//		//a.dismiss();
//		
//
//	}
//
//}
