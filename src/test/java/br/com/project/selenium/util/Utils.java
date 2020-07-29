package br.com.project.selenium.util;

import br.com.project.selenium.core.DriverTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author jussaragranja
 * support methods for optimizing code
 */

public abstract class Utils {




	public static String extrairStackTrace(Exception e) {
		StackTraceElement[] stack = e.getStackTrace();
		String exception = "";
		for (StackTraceElement s : stack) {
			exception = exception + s.toString() + "\n\t\t";
		}
		return exception;
	}

	
	/**
	 * Metodo para capturar screenshot
	 * @param driver 
	 * 
	 * @param fileName
	 *            - Nome do arquivo
	 */
	public static void takeScreenshot(WebDriver driver, String casoDeteste, String nomeEvidencia) {
		File scrFile = ((TakesScreenshot) DriverTest.getDriver())
				.getScreenshotAs(OutputType.FILE);
		try {
			String pastaImages = "Evidencias/"+casoDeteste+"/"+nomeEvidencia+".jpg";
					
			String pastaResultado = "resultadoTest/" + pastaImages;
					
			File fileDestino = new File(pastaResultado);
			FileUtils.copyFile(scrFile,fileDestino,true);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static Date getData(){
		Calendar cal = Calendar.getInstance();
		
		return cal.getTime();
	}
	
	public static String getDataAtual() {
		try {
			SimpleDateFormat formatDate = new SimpleDateFormat("ddMMyyyy");
			Calendar calendar = new GregorianCalendar();
			Date data = new Date();
			calendar.setTime(data);
			return formatDate.format(data);
		} catch (Exception e) {
			return null;
		}
	}
}
