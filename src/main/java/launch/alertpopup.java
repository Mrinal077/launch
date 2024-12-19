package launch;

import org.openqa.selenium.Alert;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@value='ClickToGetAlert']")).click();
		Alert alert =driver.switchTo().alert();
		Thread.sleep(4000);
		
		String text=alert.getText();
		
		if (text.equals("Hello")) {
			
			System.out.println("Done");
			alert.accept();
		}
		else {
			System.out.println("Wrong text");
			alert.dismiss();
		}}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//WebDriver driver= new ChromeDriver();
//driver.manage().window().maximize();
//driver.get("https://omayo.blogspot.com/");
//Thread.sleep(5000);
//
//driver.findElement(By.xpath("//input[@value='ClickToGetAlert']")).click();
//Thread.sleep(5000);
//
//
//Alert alert=driver.switchTo().alert();
//
//String text =alert.getText();
//
//if (text.equals("Hello")) {
//	
//alert.accept();
//System.out.println("done");
//	
//}
//else 
//{
//	System.out.println(" not done");
//
//	
//	alert.dismiss();
//}
//
//	}
//	
//
//}
