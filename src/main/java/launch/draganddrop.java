package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source =driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));

		WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action= new Actions(driver);
		action.contextClick(source).build().perform();   //for clicking right
		action.clickAndHold(source).moveToElement(target).release().build().perform();
		

	}

}
