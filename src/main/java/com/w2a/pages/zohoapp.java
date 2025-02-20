package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.Base.Page;
import com.w2a.CRMHome.CRMHomePage;

public class zohoapp extends Page {
	
		
	
	public CRMHomePage goToCRM()
	{
		driver.findElement(By.cssSelector("#zl-myapps > div.ea-app-container > div:nth-child(3) > div > a > span")).click();
		return new CRMHomePage();
	}
	
	public void goToMail()
	{
		
		driver.findElement(By.cssSelector("#zl-myapps > div.ea-app-container > div:nth-child(5) > div > a > span")).click();
	}

}
