package br.com.project.selenium.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author jussaragranja
 * Conversions
 */

public class Conversions {

	/**
	 * Verifica se a string � não-nula e não-vazia
	 */
	public static boolean check(String s) {
		return (s != null) && (!s.equals(""));
	}
	
	/**
	 * Verifica se a string � não-nula e não-vazia
	 */
	public static boolean checkComTrim(String s) {
		return (s != null) && (!s.trim().equals(""));
	}

	/**
	 * Verifica se o array de bytes � não-nulo e não-vazio
	 */
	public static boolean check(byte[] s) {
		return (s != null) && (s.length != 0);
	}

	/**
	 * Verifica se a string pode ser convertida em um inteiro
	 */
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch(NumberFormatException error) {
			return false;
		}
	}

	/**
	 * Verifica se a string pode ser convertida em um double
	 */
	public static boolean isDouble(String s) {
		try {
			if(s == null)
				return false;
			Double.parseDouble(s);
			return true;
		} catch(NumberFormatException error) {
			return false;
		}
	}

	/**
	 * Verifica se a string pode ser convertida em um long
	 */
	public static boolean isLong(String s) {
		try {
			if(s == null)
				return false;
			Long.parseLong(s);
			return true;
		} catch(NumberFormatException error) {
			return false;
		}
	}

	/**
	 * Verifica se a string pode ser convertida em um double
	 */
	public static boolean isDouble(String s, NumberFormat nf) {
		try {
			if(s == null)
				return false;
			nf.parse(s);
			return true;
		} catch(ParseException error) {
			return false;
		}
	}

	/**
	 * Verifica se a data � válido
	 */
	public static boolean isDate(String s, SimpleDateFormat sdf) {
		try {
			if(s != null) {
				if(sdf.toPattern().trim().length() == s.trim().length()) {
					sdf.setLenient(false);
					sdf.parse(s);
					return true;
				}
			}
			return false;
		} catch(ParseException error) {
			return false;
		}
	}

	/**
	 * Verifica se a hora � válido
	 */
	public static boolean isHour(String s, SimpleDateFormat sdf) {
		try {
			sdf.parse(s);
			return true;
		} catch(ParseException error) {
			return false;
		}
	}
}
