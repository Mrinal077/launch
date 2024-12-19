package launch;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class isalertpresent {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

         driver.findElement(By.xpath("//input[@value='ClickToGetAlert']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.alertIsPresent());
		Alert alert =driver.switchTo().alert();
		alert.accept();
		if(i/4)
		{
			
		}

	}

	}


