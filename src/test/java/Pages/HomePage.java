package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	//Properties for locating elements
		private RemoteWebDriver driver;
		private WebDriverWait wait;
	
	@FindBy(how=How.XPATH, using="//button[normalize-space()='Home']")
	private WebElement homebutton;
	
	@FindBy(how=How.XPATH, using="//button[normalize-space()='Customer Login']")
	private WebElement cuslogin;
	
	@FindBy(how=How.XPATH, using="//button[normalize-space()='Bank Manager Login']")
	private WebElement banklogin;
	
	public HomePage(RemoteWebDriver driver, WebDriverWait wait)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		this.wait=wait;
	}
	
	public void clickhome()
	{
		wait.until(ExpectedConditions.visibilityOf(homebutton)).click();
	}
	
	public void clickcuslogin()
	{
		wait.until(ExpectedConditions.visibilityOf(cuslogin)).click();
	}
	
	public void clickbankmanage()
	{
		wait.until(ExpectedConditions.visibilityOf(banklogin)).click();
	}
	
	
	
	
	
	

}
