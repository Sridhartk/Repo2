package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//div[text()='Use another account']")
	private WebElement click1;
	
	@FindBy(id="identifierId")
	private WebElement unTB;
	
	@FindBy(id="identifierNext")
	private WebElement next;
	
	
	
	@FindBy(name="password")
	private WebElement pwTB;
	
	@FindBy(id="passwordNext")
	public WebElement loginBTN;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicke()
	{
		click1.click();
	}
	public void next11()
	{
		next.click();
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
