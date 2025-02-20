package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.Base.Page;

public class SignIn extends Page {

	public zohoapp GotoSignIn(String username,String password)
	{
		driver.findElement(By.id("login_id")).sendKeys(username);
		driver.findElement(By.id("nextbtn")).click();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("nextbtn")).click();
		return new zohoapp();
		
		
	
	}
}
