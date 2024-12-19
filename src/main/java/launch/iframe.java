package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
	       
	      driver.get("https://jqueryui.com/resizable/");
	      Thread.sleep(5000);
	      driver.manage().window().maximize();
	      driver.switchTo().frame(0);
	      WebElement drag =driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	      Actions action = new Actions(driver);
	     action.dragAndDropBy(drag, 10, 20);
	     action.build().perform();
	     driver.switchTo().defaultContent();
	     driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[8]/a")).click();
	      

	}

}
