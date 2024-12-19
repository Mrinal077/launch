package pack;
import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class prime{
	
	static int n=100;
	static boolean f=false;
public static void main(String[] args) {
	if(n==0 | n==1) {
		System.out.println("not prime");
	}
	
	for (int i=2;i<n;i++)
	{
		if (n%i==0)
		{
			System.out.println(f);
			return;
		}
		else
		{
			System.out.println("it is not prime");
		}
	}
}
	
		
	}

