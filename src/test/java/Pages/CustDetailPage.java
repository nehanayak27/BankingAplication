package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustDetailPage {
	
	

	private RemoteWebDriver driver;
	private WebDriverWait wait;
	BankDetail bb=new BankDetail(driver, wait);

	@FindBy(how=How.XPATH, using="//button[normalize-space()='Transactions']")
	private WebElement trans;
	
	
	@FindBy(how=How.XPATH, using="//button[@class='btn btn-lg tab btn-primary']")
	private WebElement clickdeposit;
	
	
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='amount' and @type='number']")
	private WebElement selectDeposit;
	
	
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='amount']")
	private WebElement sendKeyyysDepo;
	
	
	@FindBy(how=How.XPATH, using="//button[@type='submit']")
	private WebElement clickdep;
	
	//span[@class='error ng-binding']
	
	@FindBy(how=How.XPATH, using="//span[@class='error ng-binding']")
	private WebElement booleanval;
	
	public CustDetailPage(RemoteWebDriver driver, WebDriverWait wait)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		this.wait=wait;
	}
	
	public void transd() throws Exception
	{
		
		Thread.sleep(1000);
		trans.click();
	}
	
	public void slectwidrawl() throws Exception
	{
		
		Thread.sleep(1000);
		clickdeposit.click();
	}
	
	
	
	public void amount(String s)
	{
		sendKeyyysDepo.sendKeys(s);
	}
	
	public void clickdeposi()
	{
		clickdep.click();
	}
	
	public boolean succsmess()
	{
		if(booleanval.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
