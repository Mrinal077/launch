package launch;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollscreen {

	public static void main(String[] args) throws InterruptedException {
 WebDriver driver = new ChromeDriver();
 
 driver.get("https://jqueryui.com/droppable/");
 Thread.sleep(5000);
 
 
JavascriptExecutor jse= (JavascriptExecutor)driver; // typecasting- upward typecasting

jse.executeScript("window.scrollBy(0,800)");
Thread.sleep(5000);
jse.executeScript("window.scrollBy(0,-200)");


	}

}
