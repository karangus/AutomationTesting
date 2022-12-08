package pageobject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	public WebDriver driver;

	//private By checkoutproductname = By.xpath("//p[@class='product-name']");
	private By cartbutton=By.cssSelector("img[alt=Cart]");
	
	private By proceedbutton=By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	private By promecode =By.xpath("//button[text()='Apply']");
	private By placeorder =By.xpath("//button[text()='Place Order']");

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}	
	public void checkoutclick()
	{
		driver.findElement(cartbutton).click();
		driver.findElement(proceedbutton).click();
	}
	
	public boolean verifyPromobtn()
	{
		return driver.findElement(promecode).isDisplayed();
	}

	public boolean verifyPlaceorder()
	{
		return driver.findElement(placeorder).isDisplayed();
	}
	
}
