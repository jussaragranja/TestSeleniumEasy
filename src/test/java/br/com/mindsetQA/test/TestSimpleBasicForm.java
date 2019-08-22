package br.com.mindsetQA.test;

import org.junit.Test;

import br.com.mindsetQA.core.CoreBaseTest;
import br.com.mindsetQA.page.PageBasicFormDemo;
import br.com.mindsetQA.page.PageHomeSeleniumEasy;
import br.com.mindsetQA.util.Property;

public class TestSimpleBasicForm extends CoreBaseTest{
	
	
	@Test
	public void realizarPrimeiroTest() {
		PageHomeSeleniumEasy homeSeleniumEasy = new PageHomeSeleniumEasy();
		PageBasicFormDemo basicFormDemo = new PageBasicFormDemo();
		driver.navigate().to(Property.URL);
		homeSeleniumEasy.acessarSimpleForm("BASIC EXAMPLES TO START WITH SELENIUM");
		System.out.println("1 - Acesso Pagina SimpleForm");
		basicFormDemo.preencherMensagem("Teste");
		System.out.println("2 - preechendo texto");
		basicFormDemo.clickEnviarMensagem();
		System.out.println("3 - click");
		basicFormDemo.validaMensagem("Teste");
		System.out.println("4 - validacao");
	}
}
