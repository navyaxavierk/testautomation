package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucedemopage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement loginButton;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement addToCart1;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement addToCart2;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement addToCart3;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement addToCart4;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement addToCart5;
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement addToCart6;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cartClick;
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkOut;
	@FindBy(id="first-name")
	WebElement firstName;
	@FindBy(id="last-name")
	WebElement lastName;
	@FindBy(id="postal-code")
	WebElement postalCode;
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement nextStep;
	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement finish;
	@FindBy(xpath="//*[@id=\"back-to-products\"]")
	WebElement backToHome;
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement menu;
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	public Saucedemopage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void sauceDemoLogin(String userName,String pass)
	{
	username.clear();
	username.sendKeys(userName);
	password.clear();
	password.sendKeys(pass);
	}
	public void login()
	{
	loginButton.click();
	}
	public void addItemToCart()
	{
	addToCart1.click();
	addToCart2.click();
	addToCart3.click();
	addToCart4.click();
	addToCart5.click();
	addToCart6.click();
	}
	public void clickCart()
	{
	cartClick.click();
	checkOut.click();
	}
	public void data(String fname,String lname,String zipcode )
	{
	firstName.sendKeys(fname);
	lastName.sendKeys(lname);
	postalCode.sendKeys(zipcode);
	nextStep.click();
	}
	public void end()
	{
	finish.click();
	backToHome.click();
	}
	public void logout() throws Exception
	{
	menu.click();
	Thread.sleep(3000);
	logout.click();
	}

}

