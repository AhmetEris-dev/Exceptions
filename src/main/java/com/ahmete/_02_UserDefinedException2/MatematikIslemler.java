package com.ahmete._02_UserDefinedException2;

import java.util.Scanner;

public class MatematikIslemler {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sayi1=10;
		int sayi2=20;
		while (true) {
			System.out.println("Matematik İşlemleri");
			System.out.println("1-Çarpma");
			System.out.println("2-Bölme");
			System.out.println("3-Toplama");
			System.out.println("4-Çıkarma");
			System.out.println("0-Çıkış");
			// kullanıcı yanlış seçim yaptığında (0-4 arasında değilse) bir hata fırlatın.
			// hata türü kendi yazdığınız bir hata olabilir.
			// WrongChoiceException
			
			int userInput;
			switch (userInput=sc.nextInt()) {
				case 1:
					carpma(sayi1,sayi2);
					break;
				case 2:
					bolme(sayi1,sayi2);
					break;
				case 3:
					toplama(sayi1,sayi2);
					break;
				case 4:
					cikarma(sayi1,sayi2);
					break;
				case 0:
					System.out.println("Program kapatılıyor....");
					return;
				default:
					try {
						userInputKontrol();
					}
					catch (WrongChoiceException e) {
						e.printStackTrace();
					}
			}
		}
	}
	
	private static void userInputKontrol() throws WrongChoiceException {
		
		throw new WrongChoiceException("0-4 arası değer girilmeli.");
		
	}
	
	private static void cikarma(int sayi1, int sayi2) {
		System.out.println(sayi1-sayi2);
	}
	
	private static void toplama(int sayi1, int sayi2) {
		System.out.println(sayi1+sayi2);
	}
	
	private static void bolme(int sayi1, int sayi2) {
		System.out.println(sayi1/(double)sayi2);
	}
	
	private static void carpma(int sayi1,int sayi2) {
		System.out.println(sayi1*sayi2);
	}
}