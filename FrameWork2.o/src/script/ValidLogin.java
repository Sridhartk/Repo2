package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import pages.LoginPage;

public class ValidLogin extends BaseTest{
	@Test(priority=1)
	public void testLogin()
	{
		String un=XL.getData(XL_PATH, "ValidLogin", 3, 0);
		String pw=XL.getData(XL_PATH, "ValidLogin", 3, 1);
		
		LoginPage lp=new LoginPage(driver);
		lp.clicke();
		lp.setUN(un);
		lp.next11();
		lp.setPW(pw);
		lp.Clickon();
	}
}