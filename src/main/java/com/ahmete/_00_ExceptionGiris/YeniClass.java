package com.ahmete._00_ExceptionGiris;

import java.time.LocalDate;

public class YeniClass {
	private String ad;
	private String soyad;
	private LocalDate dogumTarihi;
	
	public YeniClass(String ad, String soyad, LocalDate dogumTarihi) {
		this.ad = ad;
		this.soyad = soyad;
		this.dogumTarihi = dogumTarihi;
	}
}