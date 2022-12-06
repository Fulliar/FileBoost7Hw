package com.bilgeadam.hw.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		
		String dosyaYolu = "C:\\Users\\erguv\\OneDrive\\Desktop\\Bilge Adam Boost\\File_Example\\deneme3.txt";
		File file = new File(dosyaYolu);
		try {
			FileExample.dosyaYarat(file);
		}catch (Exception ex) {
			System.out.println("Dosya oluşturulurken hata oluştu");
		}
		
		try {
			FileExample.dosyaYaz(file);
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		} catch(Exception ex) {
			System.out.println("Genel hata");
		}
		
		try {
			FileExample.dosyaOku(file);
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası");
		}	
	}
}
