package br.com.project.selenium.test;

import br.com.project.selenium.page.inputforms.PageSimpleFormDemo;
import br.com.project.selenium.util.Constants;
import org.junit.Test;

import br.com.project.selenium.core.BaseTest;
import br.com.project.selenium.page.PageHome;

/**
 * @author jussaragranja
 * Testing the page Simple Form Demo
 */

public class TestSimpleBasicForm extends BaseTest {

	@Test
	public void singleInputFileldTest() {
		PageHome homeSeleniumEasy = new PageHome();
		homeSeleniumEasy.acessarSimpleForm("BASIC EXAMPLES TO START WITH SELENIUM");
		new PageSimpleFormDemo().enterMessage(Constants.MENSAGEM_TESTE)
				.clickShowMessage()
				.assertMessage(Constants.MENSAGEM_TESTE);
	}

	@Test
	public void twoInputFileldTest() {
		PageHome homeSeleniumEasy = new PageHome();
		homeSeleniumEasy.acessarSimpleForm("BASIC EXAMPLES TO START WITH SELENIUM");
		new PageSimpleFormDemo()
				.enterA(2)
				.enterB(2)
				.clickGetTotal()
				.assertSumEnterAEnterB();
	}

}
