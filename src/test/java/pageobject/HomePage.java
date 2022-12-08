package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;
	private By search= By.xpath("//input[@type='search']");
	private By productname =By.cssSelector("h4.product-name");
	private By Topdeals=By.xpath("//a[contains(text(),'Top Deals')]");
	private By increment =By.xpath("//a[@class='increment']");
	private By addtocart=By.xpath("//div[@class='product-action']/button");
	
	
	
	
	
	public HomePage(WebDriver driver)
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
  
  public void topDealsButton()
  {
	driver.findElement(Topdeals).click();
  }
  
  public String getTitleLandingPage()
  {
	  return driver.getTitle();
  }
  public void increamentvalue(int quantity)
	{
		
		int i=quantity;
		while(i>0)
		{
			driver.findElement(increment).click();
			i--;
		}
		
		
	}
  public void addToCart()
  {
	  driver.findElement(addtocart).click();
  }
}
