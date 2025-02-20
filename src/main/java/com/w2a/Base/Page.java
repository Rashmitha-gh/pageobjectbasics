package com.w2a.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Page {

public static WebDriver driver;
public static Topmenu menu;
	public Page()
	{
		if(driver==null)
		{
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--disable-infobars");
			 driver= new ChromeDriver(options); 
		 driver= new ChromeDriver();
		 menu=new Topmenu(driver);
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	}
}
