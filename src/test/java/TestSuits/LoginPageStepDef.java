package TestSuits;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {

	@Given ("admin is on login page")
	public void admin_is_on_login_page () {
		Config.ConfChrome();
		Config.driver=new ChromeDriver ();
		Config.maximizeWindow();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
	}
	
	
	@When ("admin enter correct username {string} and correct password {string}")
    public void admin_enter_correct_username_and_correct_password (String username, String pwd){
    	LoginPage page = new LoginPage ();
    	page.connect(username, pwd);
    	
    }
	
	@Then ("admin is directed to the DashboardPage ")
	public void admin_is_directed_to_the_DashboardPage (String ExpectedText) {
	
		 LoginPage page = new LoginPage ();
		 String actualText = page.verifmsgafterlogin();
		 Assert.assertEquals(ExpectedText, actualText);
	
	}
}




