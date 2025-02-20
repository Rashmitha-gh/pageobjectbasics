package com.w2a.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.accounts.Acctspage;

public class Topmenu {
	WebDriver driver;

	public Topmenu(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void Leads() {

	}

	public Acctspage Accounts() {

		driver.findElement(By.id("Visible_Accounts")).click();
		return new Acctspage();
		
	}

	public void Contacts() {

	}

	public void Deals() {

	}

	public void Tasks() {

	}
}
