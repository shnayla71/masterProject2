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
			WebElement dropdown=Driver.getDriver().findElement(By.cssSelector("select[id='variation-selector-0']"));
			Select select=new Select(dropdown);
			Thread.sleep(2000);
			System.out.println(select.getFirstSelectedOption().getText());
			Thread.sleep(3000);
			select.selectByVisibleText(" Blank ($79.00)");
			Thread.sleep(2000);
			WebElement dropdown1=Driver.getDriver().findElement(By.xpath("//select[@id='variation-selector-1']"));
			Thread.sleep(2000);
			Select select1=new Select(dropdown1);
			Thread.sleep(2000);
			select1.selectByIndex(3);
			return this;
		}
		@FindBy(id="global-enhancements-search-query")
		public WebElement searchbox;

		@FindBy(xpath = "(//button[@type='submit'])[1]")
		public WebElement searchButton;


		@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[6]/div/div/div/div[1]/div/ul/li[1]/div/a/div[1]/div/div/div/img")
		public WebElement selectItem;

		@FindBy(xpath ="//div[@class='wt-select']")
		public WebElement selectSize;

		@FindBy(xpath = "/html/body/main/div[1]/div[1]/div/div/div[1]/div[2]/div/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/select/option[4]")
        public WebElement sizeOption;

		@FindBy(id= "variation-selector-1")
		public WebElement selectLetter;

		@FindBy(xpath = "/html/body/main/div[1]/div[1]/div/div/div[1]/div[2]/div/div[6]/div[1]/div[1]/div[2]/div[2]/div[2]/select/option[4]")
        public WebElement letterOption;

		@FindBy(xpath="/html/body/main/div[1]/div[1]/div/div/div[1]/div[2]/div/div[6]/div[1]/div[4]/div[2]/form/div/button")
	    public WebElement addToCardButton;


		@FindBy(xpath="//li[@data-ui='top-nav-promo-link'][1]")
	    public WebElement firstTab;

		@FindBy(xpath = "//li[@data-node-id='10855']")
	    public WebElement secondTab;

	}

