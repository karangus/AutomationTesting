package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	public WebDriver driver;
	private By search= By.xpath("//input[@type='search']");
	private By productname =By.xpath("//td[contains(text(),'Tomato')]");
	
	public OfferPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);			
	}
	public void Itemtext()
	{
		driver.findElement(search).getText();
	}
  public String getproductname()
 {
	return driver.findElement(productname).getText() ;
  }
}
