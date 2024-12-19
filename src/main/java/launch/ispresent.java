package launch;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ispresent {
	
	
	
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	Boolean element=driver.findElement(By.xpath("//div[@id='SIvCob']")).isDisplayed();
	
Assertions.assertFalse(element, "element not present");
 
driver.quit();
}
}