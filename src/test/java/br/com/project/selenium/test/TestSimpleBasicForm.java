package br.com.project.selenium.test;

import br.com.project.selenium.page.inputforms.PageSimpleFormDemo;
import org.junit.Test;

import br.com.project.selenium.core.BaseTest;
import br.com.project.selenium.page.PageHome;
import br.com.project.selenium.util.Property;

/**
 * @author jussaragranja
 * Testing the page Simple Form Demo
 */

public class TestSimpleBasicForm extends BaseTest {
	
	
	@Test
	public void realizarPrimeiroTest() {
		PageHome homeSeleniumEasy = new PageHome();
		PageSimpleFormDemo simpleFormDemo = new PageSimpleFormDemo();
		driver.navigate().to(Property.URL);
		homeSeleniumEasy.acessarSimpleForm("BASIC EXAMPLES TO START WITH SELENIUM");
		System.out.println("1 - Acesso Pagina SimpleForm");
		simpleFormDemo.preencherMensagem("Teste");
		System.out.println("2 - preechendo texto");
		simpleFormDemo.clickEnviarMensagem();
		System.out.println("3 - click");
		simpleFormDemo.validaMensagem("Teste");
		System.out.println("4 - validacao");
	}
}
