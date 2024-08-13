package com.ahmete;

import java.util.Scanner;

class WrongChoiceException extends Exception {
	public WrongChoiceException(String message) {
		super(message);
	}
}

public class MatematikIslemleri {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi1 = 10;
		int sayi2 = 20;
		
		System.out.println("Matematik İşlemleri");
		System.out.println("1 - Çarpma");
		System.out.println("2 - Bölme");
		System.out.println("3 - Toplama");
		System.out.println("4 - Çıkarma");
		System.out.println("0 - Çıkış");
		System.out.print("Bir işlem seçiniz: ");
		
		int secim = scanner.nextInt();
		
		try {
			if (secim < 0 || secim > 4) {
				throw new WrongChoiceException("Hatalı seçim! Lütfen 0 ile 4 arasında bir değer giriniz.");
			}
			
			switch (secim) {
				case 1:
					System.out.println("Çarpma: " + (sayi1 * sayi2));
					break;
				case 2:
					System.out.println("Bölme: " + (sayi1 / sayi2));
					break;
				case 3:
					System.out.println("Toplama: " + (sayi1 + sayi2));
					break;
				case 4:
					System.out.println("Çıkarma: " + (sayi1 - sayi2));
					break;
				case 0:
					System.out.println("Çıkış yapılıyor...");
					break;
			}
		} catch (WrongChoiceException e) {
			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}
}