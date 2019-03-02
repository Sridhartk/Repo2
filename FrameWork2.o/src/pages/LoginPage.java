package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="usr")
	private WebElement unTB;
	
	@FindBy(id="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//input[3]")
	public WebElement loginBTN;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUN(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPW(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void Clickon()
	{
		loginBTN.click();
	}
}
