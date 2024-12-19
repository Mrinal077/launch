package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ff {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		Thread.sleep(20000);
Actions action= new Actions(driver);
WebElement ele1=driver.findElement(By.xpath("//a[@href='https://www.globalsqa.com/free-ebooks/' and @class='no_border']"));
action.moveToElement(ele1).build().perform();
driver.findElement(By.xpath("//span[@xpath='1']")).click();
} 
	
	
	
}
