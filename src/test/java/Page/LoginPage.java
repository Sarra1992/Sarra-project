package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {

	@FindBy (name="username")
	WebElement ChampsUsername;
	
	@FindBy (name="password")
	WebElement ChampsPassword;
	
	@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement BtnLogin;
	
	@FindBy (xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement DashboardPage;
	
	public LoginPage () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void connect (String username, String pwd) {
		Config.attente(10);
		ChampsUsername.sendKeys(username);
		ChampsPassword.sendKeys(pwd);
		BtnLogin.click();
	}
	
	public  String verifmsgafterlogin () {
		
		String actualText = DashboardPage.getText();
		return actualText;
		
	}
 
 }
