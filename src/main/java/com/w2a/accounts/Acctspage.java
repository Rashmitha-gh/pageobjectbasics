package com.w2a.accounts;

import org.openqa.selenium.By;

import com.w2a.Base.Page;

public class Acctspage extends Page{

	
	
	public createacct gotoCreateAcct()
	{
		
driver.findElement(By.xpath("//*[@id=\"Visible_Accounts\"]/span")).click();
return new createacct();
	}
	
	public void gotoImportAcct()
	{
		
		
	}
}
