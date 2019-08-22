package br.com.mindsetQA.page;

import br.com.mindsetQA.core.CoreDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageHomeSeleniumEasy{

	protected WebDriver driver;
	public PageHomeSeleniumEasy() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}

	@FindBy(xpath = "//div[@id='home']//h3[@class='head text-center']")
	private WebElement tituloPage;
	
	@FindBy(id="btn_basic_example")
	private WebElement botaoStart;
	
	@FindBy(xpath="//div[@id='basic']//h3[@class='head text-center']")
	private WebElement tituloBasicExemples;
	
	@FindBy(linkText="Simple Form Demo")
	private WebElement selecaoSimpleFormDemo;

	public void acessarSimpleForm(String text) {
		botaoStart.click();
		WebDriverWait driverWait = new WebDriverWait(CoreDriver.getDriver(), 30);
		driverWait.until(ExpectedConditions.visibilityOf(selecaoSimpleFormDemo));
		Assert.assertEquals(text, tituloBasicExemples.getText());
		selecaoSimpleFormDemo.click();
	}
	
}
