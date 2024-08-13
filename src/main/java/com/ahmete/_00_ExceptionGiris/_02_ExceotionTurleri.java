package com.ahmete._00_ExceptionGiris;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Exception;
 * -sizin tanımladığınız exceptionlar (user-Defined Exception)
 * -Hazır gelen exceptionlar (Built-in Exceptions)
 *     -Checked
 *        Derleme zamanında mutlaka kontrol sağlanmasını zorunlu kılar
 *        Bu kontrol için 2 yol vardır
 *          1.Yol:Try-Catch bloguna alarak
 *          2.Yol: içinde bulundugumuz metodun imzasına throws ile exception adını yazarak
 *     -UnChecked (AritmeticException,NullPointerException,ArrayIndexOutOfBoundsException):RuntimeException'dan türetilen sınıflar.
 */
public class _02_ExceotionTurleri {
	public static void main(String[] args) {
		
		try {
			dosyaOku();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("program devam ediyor!");
		
		
	}
	private static void dosyaOku() throws FileNotFoundException {
		FileInputStream fis = null;
		fis = new FileInputStream("C:/javaFiles/Hello3.txt");
		
	}
}