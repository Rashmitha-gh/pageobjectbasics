package com.w2a.accounts;

import org.openqa.selenium.By;

import com.w2a.Base.Page;

public class createaccteditpage extends Page {

	
	public void createacctedit(String name)
	{
		driver.findElement(By.id("Crm_Accounts_ACCOUNTNAME_LInput")).sendKeys(name);
	}
}
