package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.Base.Page;

public class Home extends Page{
	
		public SignIn goToLogin() {

		driver.findElement(By.cssSelector("#header > div.zgh-utilities > div.zgh-accounts > a.zgh-login")).click();
		return new  SignIn();
		
	}

	public void goToSignUp() {
		
		driver.findElement(By.linkText("Sign Up")).click();
		
	}
	
				
	

}
