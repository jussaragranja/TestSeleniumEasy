package br.com.mindsetQA.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
/**
 * 
 * @author CONDUCTOR\thiago.freire
 * Base se execucao de todos os testes
 *
 */
public abstract class CoreBaseTest {
	
	public WebDriver driver;
	
	/*
	 * Buscando o nome do proximo teste a ser executado
	 */
	@Rule
	public TestName nameTest = new TestName();
	
	
	/*
	 * metodo executado antes de cada caso de teste
	 */
	@After
	public void after(){
		if(driver != null){
			driver.quit();
		}
		driver = null;
	}
	
	
	/*
	 * Para cada caso de teste, ira instanciar um novo driver
	 */
	@Before
	public void before() throws MalformedURLException{
		driver = CoreDriver.getDriver();
	}
}
