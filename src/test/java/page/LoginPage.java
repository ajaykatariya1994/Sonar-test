package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name="txtUsername")
	WebElement Username;
	
	@FindBy(name="txtPassword")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement LoginBtnCheck;
	
	public WebElement getLoginBtnCheck() {
		return LoginBtnCheck;
	}

	public void setLoginBtnCheck(WebElement loginBtnCheck) {
		this.LoginBtnCheck = loginBtnCheck;
	}
	
	public boolean checkLogin() {
		boolean checklog=LoginBtnCheck.isDisplayed();
		return checklog;
	}

	@FindBy(linkText="Forgot your password?")
	WebElement Forgetpwd;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement Admin;
	
	@FindBy(xpath="//span[contains(text(),'Invalid')]")
	WebElement Invalid;
	
	@FindBy(xpath="//span[contains(text(),'Password cannot be empty')]")
	WebElement Emptypwd;
	
	@FindBy(xpath="//span[contains(text(),'Username cannot be empty')]")
	WebElement Emptyuser;
	
	@FindBy(xpath="//input[@id='securityAuthentication_userName']")
	WebElement Forgetuser;
	
	@FindBy(xpath="//input[@value='Reset Password']")
	WebElement Reset;
	
	@FindBy(xpath="//input[@value='Cancel']")
	WebElement Cancel;
	
	
	public WebElement getForgetuser() {
		return Forgetuser;
	}

	public void setForgetuser(String forgetuser) {
		Forgetuser.sendKeys(forgetuser);
	}

	public WebElement getReset() {
		return Reset;
	}

	public void setReset() {
		Reset.click();
	}

	public WebElement getCancel() {
		return Cancel;
	}

	public void setCancel() {
		Cancel.click();
	}

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username.sendKeys(username);
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password.sendKeys(password);
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public void setLoginBtn() {
		LoginBtn.click();
	}

	public WebElement getForgetpwd() {
		return Forgetpwd;
	}

	public void setForgetpwd() {
		Forgetpwd.click();
	}

	public WebElement getAdmin() {
		return Admin;
	}

	public void setAdmin(WebElement admin) {
		this.Admin=admin;
	}
	
	public boolean displayAdmin() {
		boolean adm=Admin.isDisplayed();
		return adm;
	}

	public WebElement getInvalid() {
		return Invalid;
	}

	public void setInvalid(WebElement invalid) {
		this.Invalid=invalid;
	}
	public boolean invcred() {
		boolean incred=Invalid.isDisplayed();
		return incred;
	}

	public WebElement getEmptypwd() {
		return Emptypwd;
	}

	public void setEmptypwd(WebElement emptypwd) {
		this.Emptypwd=emptypwd;
	}
	
	public boolean emppwd() {
		boolean empwd=Emptypwd.isDisplayed();
		return empwd;
	}
	

	public WebElement getEmptyuser() {
		return Emptyuser;
	}

	public void setEmptyuser(WebElement emptyuser) {
		this.Emptyuser=emptyuser;
	}
	public boolean empuser() {
		boolean emuser=Emptyuser.isDisplayed();
		return emuser;
	}
	
	public boolean resBtn()
	{
		boolean resbtn=Reset.isDisplayed();
		return resbtn;
	}

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	
}
