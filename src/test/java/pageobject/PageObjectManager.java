package pageobject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	
	public HomePage homepage;
	public OfferPage offerPage;
	public CheckoutPage checkout;
	WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage gethomepage() {
		homepage = new HomePage(driver);
		return homepage;
	}
	
	public OfferPage getofferpage()
	{
		offerPage=new OfferPage(driver);
		return offerPage;
	}

	public CheckoutPage getcheckoutpage()
	{
		checkout=new CheckoutPage(driver);
		return checkout;
	}
	
}
