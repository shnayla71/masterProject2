package pages;



import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EtsyHomePages {
		public EtsyHomePages(){
			PageFactory.initElements(Driver.getDriver(),this);
		}


		public EtsyHomePages dropdownMethod() throws InterruptedException{

			Driver.getDriver().findElement(By.xpath("//div[@class='wt-select']")).click();
			Thread.sleep(3000);
			WebElement dropdown=Driver.getDriver().findElement(By.xpath("//select[@id='variation-selector-0']"));
			Select select=new Select(dropdown);
			Thread.sleep(3000);
			System.out.println(select.getFirstSelectedOption().getText());
			Thread.sleep(3000);
			select.selectByIndex(3);
			Thread.sleep(3000);
			WebElement dropdown1=Driver.getDriver().findElement(By.xpath("//select[@id='variation-selector-1']"));
			Thread.sleep(3000);
			Select select1=new Select(dropdown1);
			Thread.sleep(3000);
			select1.selectByIndex(3);
			return this;
		}
		@FindBy(id="global-enhancements-search-query")
		public WebElement searchbox;

		@FindBy(xpath = "(//button[@type='submit'])[1]")
		public WebElement searchButton;


		@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[6]/div/div/div/div[1]/div/ul/li[1]/div/a/div[1]/div/div/div/img")
		public WebElement selectItem;


		@FindBy(xpath="//*[@id=\"listing-page-cart\"]//button[contains(text(),'Add')]")

	    public WebElement addToCardButton;
	public EtsyHomePages addToCardMethod() throws InterruptedException{
		Thread.sleep(3000);
		Driver.getDriver().manage().window().maximize();
		Thread.sleep(3000);
		Driver.getDriver().findElement((By) addToCardButton).click();

		return this;
	}

		@FindBy(xpath="//*[@id=\"desktop-category-topnav\"]/div/div/ul/li[2]/a")
	    public WebElement firstTab;

		@FindBy(xpath = "//*[@id=\"desktop-category-topnav\"]/div/div/ul/li[3]/a")
	    public WebElement secondTab;

	}

