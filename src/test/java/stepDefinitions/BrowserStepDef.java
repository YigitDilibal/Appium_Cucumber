package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BrowserOBiletpage;
import utilities.BrowserDriver;
import utilities.ConfigReader;

public class BrowserStepDef {
    BrowserOBiletpage page=new BrowserOBiletpage();

    @Given("Kullanici hepsiburada adresine gider")
    public void kullanici_hepsiburada_adresine_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.hepsiburada.com");

    }
    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String gidilecekurl) {
        BrowserDriver.getBrowserDriver().get(ConfigReader.getProperty(gidilecekurl));

    }
    @Then("Arama kutusunun oldugunu dogrular")
    public void arama_kutusunun_oldugunu_dogrular() throws InterruptedException {

        Thread.sleep(5000);
        Assert.assertTrue(BrowserDriver.getBrowserDriver().findElementByXPath("//*[@class='searchBoxMobile-LcFBew99VnEBicYKIF5Q']").isDisplayed());
        Thread.sleep(5000);

        BrowserDriver.getBrowserDriver().findElementByXPath("//*[@class='sf-DownloadAppIcon-HqDeeweXhmgtqbV9yykK']").click();

    }
    @When("Dil olarak Turkce secer")
    public void dil_olarak_turkce_secer() throws InterruptedException {
        page.HamburgerButon.click();
        Thread.sleep(2000);
        page.DilSecenegi.click();
        Thread.sleep(2000);
        page.TurkceButon.click();

    }
    @When("Para birimi olarak TL secer")
    public void para_birimi_olarak_tl_secer() throws InterruptedException {
        page.HamburgerButon.click();
        Thread.sleep(2000);
        page.ParabirimiDegistirmeButonu.click();
        Thread.sleep(2000);
        page.TLButonu.click();

    }
    @When("Bul secenegine tiklar")
    public void bul_secenegine_tiklar() {
        page.SearchButonu.click();


    }
    @Then("Gelen bilet fiyatinin TL oldugunu dogrular")
    public void gelen_bilet_fiyatinin_tl_oldugunu_dogrular() {
        String TurkLirasi=page.TLBilgisi.getText();
        Assert.assertTrue(TurkLirasi.equals("TL"));

    }


}