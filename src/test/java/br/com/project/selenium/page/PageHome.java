package br.com.project.selenium.page;

import br.com.project.selenium.core.DriverTest;
import br.com.project.selenium.core.PageBase;
import br.com.project.selenium.util.Log;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author jussaragranja
 * Class represents the page Home from site SeleniumEasy
 */

public class PageHome extends PageBase<PageHome> {

	protected WebDriver driver;
	public PageHome() {
		this.driver = DriverTest.getDriver();
		PageFactory.initElements(DriverTest.getDriver(), this);
	}

	@FindBy(id = "image-darkener")
	private WebElement alertLearnSelenium;

	@FindBy(xpath = "//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]")
	private WebElement botaoNoThanks;

	@FindBy(xpath = "//div[@id='home']//h3[@class='head text-center']")
	private WebElement tituloPage;
	
	@FindBy(id="btn_basic_example")
	private WebElement botaoStart;
	
	@FindBy(xpath="//div[@id='basic']//h3[@class='head text-center']")
	private WebElement tituloBasicExemples;
	
	@FindBy(linkText="Simple Form Demo")
	private WebElement selecaoSimpleFormDemo;

	public void acessarSimpleForm(String text) {
		if(isVisibility(alertLearnSelenium)){
			botaoNoThanks.click();
		}
		botaoStart.click();
		aguardarElementoVisivel(selecaoSimpleFormDemo);
		Assert.assertEquals(text, tituloBasicExemples.getText());
		selecaoSimpleFormDemo.click();
		Log.info("Acessando página SimpleForm");
	}
	
}
