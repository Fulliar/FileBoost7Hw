package com.bilgeadam.hw.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

	
	
	public static void dosyaYarat(File file) throws Exception
	{
			if(file.exists()) {
				
				System.out.println("Böyle bir dosya zaten var.");
								
			}else {
				if(!file.createNewFile()) {
					System.out.println("Dosya oluşturulurken hata oluştu");
				} else {
					System.out.println("Dosya oluşturuldu");
				}
			}
		 	}
	
	public static void dosyaYaz(File file) throws FileNotFoundException, Exception
	{
			if(file.exists()) 
			{
				Scanner scanner = new Scanner(System.in);
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				System.out.println("Dosyaya yazılacaklar:");
				bufferedWriter.write(scanner.nextLine());
				bufferedWriter.close();
				scanner.close();
				System.out.println("Dosya yazma işlemi başarılı");	
			} else {
				System.out.println("Dosya bulunamdi.");
			}	
	}
	
	public static void dosyaOku(File file) throws IOException
	{
		if(file.exists()) 
		{
			String line;
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(file.getName() + " isimli dosyadan okunanlar : \n" + line);
			}
			
		}else {
			System.out.println("Dosya bulunamdi.");
		}	
	}
}