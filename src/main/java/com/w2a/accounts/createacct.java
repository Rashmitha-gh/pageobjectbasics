package com.w2a.accounts;

import org.openqa.selenium.By;

import com.w2a.Base.Page;

public class createacct extends Page {
	
	
	public void createacct(String name)
	{
		//driver.findElement(By.xpath("//*[@id=\"table_row_1\"]/lyte-td[3]/span[1]/span/link-to/button")).click();
	
		driver.findElement(By.xpath("//*[@id=\"table_row_1\"]/lyte-td[3]/span[1]/span/link-to/button")).click();
		driver.findElement(By.id("Crm_Accounts_ACCOUNTNAME_LInput")).sendKeys(name);
	}

}
