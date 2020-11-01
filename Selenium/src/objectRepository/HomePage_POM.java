package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericlib.BaseClass;

public class HomePage_POM {
	@FindBy(linkText="More")
	private WebElement more;
	@FindBy(name="Campaigns")
	private WebElement campaign;
	@FindBy(xpath="//span[text()=' Administrator']/../following-sibling::td[1]")
	private WebElement signoutdd;
	@FindBy(linkText="Sign Out")
	private WebElement signoutLink;
	public WebElement getMore() {
		return more;
	}
	public WebElement getCampaign() {
		return campaign;
	}
	public WebElement getSignoutdd() {
		return signoutdd;
	}
	public WebElement getSignoutLink() {
		return signoutLink;
	}
	public void navigateToCampaign()
	{
		campaign.click();
	}
	public void logout_From_App()
	{
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(signoutdd).perform();
		signoutLink.click();
	}
}
