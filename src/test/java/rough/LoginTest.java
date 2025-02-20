package rough;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w2a.Base.Page;
import com.w2a.Base.Topmenu;
import com.w2a.CRMHome.CRMHomePage;
import com.w2a.accounts.Acctspage;
import com.w2a.accounts.createacct;
import com.w2a.accounts.createaccteditpage;
import com.w2a.pages.Home;
import com.w2a.pages.SignIn;
import com.w2a.pages.zohoapp;

public class LoginTest {

	public static void main(String[] args) {
		//testing again
	
	/*	Home obj=new Home();
		obj.goToLogin();
		//obj.goToSignUp();
		SignIn obj1= new SignIn();
		obj1.GotoSignIn("rashui2all@gmail.com","Dwithi2021**");
		zohoapp zoho= new zohoapp();
		zoho.goToCRM();
		//Page.menu.Accounts();
		Acctspage acct=new Acctspage();
		acct.gotoCreateAcct();
		createacct createacc= new createacct();
		createacc.createacct("Adithri");  */
		
		
		
		Home obj=new Home();
		SignIn sign=obj.goToLogin();
		//obj.goToSignUp();
		
		zohoapp zoho=sign.GotoSignIn("rashui2all@gmail.com","Dwithi2021**");
		
	zoho.goToCRM();
	Acctspage acct=	Page.menu.Accounts();
		
	createacct createacc=acct.gotoCreateAcct();
	
		createacct edit=new createacct();
		edit.createacct("Adi");

	}

}
