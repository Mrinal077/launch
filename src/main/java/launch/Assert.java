package launch;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.bidi.script.Message;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();

//	      driver.get("https://www.facebook.com/");
//	      Thread.sleep(5000);
//	      driver.manage().window().maximize();
//	   boolean valid = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).isDisplayed();
//	   Assertions.assertFalse(valid);
	   
	   
	   driver.get("https://jqueryui.com/checkboxradio/");
	   Thread.sleep(3000);
       driver.manage().window().maximize();
       driver.switchTo().frame(0);
       
       
	  Boolean rb =driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]")).isEnabled();
	   Assertions.assertFalse(rb, "Not validated"); // (rb,"wht is validated");
	   
	   
	   
	}

}
