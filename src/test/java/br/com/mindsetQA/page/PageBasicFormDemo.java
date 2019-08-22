package br.com.mindsetQA.page;

import br.com.mindsetQA.core.CoreDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageBasicFormDemo{

	protected WebDriver driver;
	public PageBasicFormDemo() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	@FindBy(id = "user-message")
	WebElement inputMsg;
	
	@FindBy(xpath ="//button[contains(text(),'Show Message')]")
	WebElement botaoShowMsg;
	
	@FindBy(xpath ="//label[contains(text(),'Your Message:')]")
	WebElement labelSuaMensagem;
	
	@FindBy(id = "display")
	WebElement labelTextoSuaMsg;
	
	public void preencherMensagem(String texto) {
		inputMsg.clear();
		inputMsg.sendKeys(texto);
	}
	public void clickEnviarMensagem() {
		aguardarElemento(botaoShowMsg);
		botaoShowMsg.click();
	}

	public void validaMensagem(String texto) {
		WebDriverWait driverWait = new WebDriverWait(CoreDriver.getDriver(), 30);
		driverWait.until(ExpectedConditions.visibilityOf(labelTextoSuaMsg));
		Assert.assertEquals(texto, labelTextoSuaMsg.getText());
	}

	public void aguardarElemento(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(this.driver, 30);
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}
}
