package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankDetail {

	private RemoteWebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(how=How.ID, using="userSelect")
	private WebElement dropdownclick;
	
	
	@FindBy(how=How.XPATH, using="//*[@id='userSelect']/option[3]")
	private WebElement valuesclick;
	
	@FindBy(how=How.XPATH, using="//button[text()='Login']")
	private WebElement clicklogin;
	

	public BankDetail(RemoteWebDriver driver, WebDriverWait wait)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		this.wait=wait;
	}
	
	public void select() throws Exception
	{
		Thread.sleep(1000);
		dropdownclick.click();
	}
	//*[@id='userSelect']/option[4]
	public void clickvalues() throws Exception
	{
		for(int i=1;i<6;i++)
		{
			
			driver.findElement(By.xpath("//*[@id='userSelect']/option["+i+"]")).click();
			Thread.sleep(10000);
		}
	}
	
	public void clicklogin()
	{
		clicklogin.click();
	}
}
