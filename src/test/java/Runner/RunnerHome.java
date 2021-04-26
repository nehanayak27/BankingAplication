package Runner;


import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.BankDetail;
import Pages.CustDetailPage;
import Pages.HomePage;
import Utitlities.ExcelUtitlity;
import Utitlities.TestUtil;

public class RunnerHome {
 
	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
	
		
		TestUtil tu=new TestUtil();
		
		RemoteWebDriver driver=tu.openBrowser("chrome");
		WebDriverWait wait=tu.defineWait(driver);
		String pageurl=tu.getValueInPropertiesFile("url");
		tu.launchSite(pageurl);
		
		
		HomePage hp=new HomePage(driver, wait);
		hp.clickcuslogin();
		
		BankDetail bb=new BankDetail(driver, wait);
				bb.select();
				bb.clickvalues();
				bb.clicklogin();
	
		CustDetailPage cv=new CustDetailPage(driver, wait);
		cv.transd();

	}

}
