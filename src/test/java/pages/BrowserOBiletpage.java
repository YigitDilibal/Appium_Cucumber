package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserDriver;

public class BrowserOBiletpage {
    public BrowserOBiletpage(){
        PageFactory.initElements(BrowserDriver.getBrowserDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='sidebar toggle'])[1]")
    public WebElement HamburgerButon;

    @FindBy(xpath = "//*[@class='language']")
    public WebElement DilSecenegi;

    @FindBy(xpath = "(//*[@data-language='tr-TR'])[1]")
    public WebElement TurkceButon;


    @FindBy(xpath = "//*[@class='currency']")
    public WebElement ParabirimiDegistirmeButonu;


    @FindBy(xpath = "(//*[@class='currency-name'])[1]")
    public WebElement TLButonu;

    @FindBy(xpath = "//*[@id='search-button']")
    public WebElement SearchButonu;

    @FindBy(xpath = " (//span[@class='amount-sign'])[1]")
    public WebElement TLBilgisi;
}