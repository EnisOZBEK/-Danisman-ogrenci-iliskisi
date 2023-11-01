package BilgisayarMühendisliði;

import java.util.Scanner;

/**
 * Bütün sistemin çalýþtýðý sýnýf.
 * @author Enis
 *
 */
public class Sistem {
		
	Scanner scan = new Scanner(System.in);
	
	public static int danýþmanSeçimi;
	public static int danýþman1ÖðrenciSayýsý = 0;
	public static int danýþman2ÖðrenciSayýsý = 0;
	public static int danýþman3ÖðrenciSayýsý = 0;
	public static int danýþman4ÖðrenciSayýsý = 0;
	public static int danýþman5ÖðrenciSayýsý = 0;
	public static int danýþman6ÖðrenciSayýsý = 0;
	public static int danýþman7ÖðrenciSayýsý = 0;
	public static int danýþman8ÖðrenciSayýsý = 0;
	public static int danýþman9ÖðrenciSayýsý = 0;
	public static int danýþman10ÖðrenciSayýsý = 0;
	
	/**
	 * 
	 * @return Seçtiðimiz danýþmanýn deðerini döndürür.
	 */
	public static int danýþmanSeçimi() {
		return danýþmanSeçimi;
	}
	
	/**
	 * Sistemi baþlatan fonksiyon.
	 */
	public void sistemiBaþlat() {
		
		while(true) {
			
			BilgisayarMühendisliði bm = new BilgisayarMühendisliði();
			
			Danýþman danýþman1 = new Danýþman("Enis", "ÖZBEK", "Prof.");
			Danýþman danýþman2 = new Danýþman("Eren", "KAYNAR", "Prof.");
			Danýþman danýþman3 = new Danýþman("Utku", "YILDIZ", "Doç.");
			Danýþman danýþman4 = new Danýþman("Sefa", "ÖZKAYA", "Doç.");
			Danýþman danýþman5 = new Danýþman("Miraç", "GÜLCÝHAN", "Doç.");
			Danýþman danýþman6 = new Danýþman("Emirhan", "PEKESER", "Öðretim Görevlisi");
			Danýþman danýþman7 = new Danýþman("Ece Özlem", "ÞÝMÞEK", "Öðretim Görevlisi");
			Danýþman danýþman8 = new Danýþman("Gülcan", "DOÐAN", "Öðretim Görevlisi");
			Danýþman danýþman9 = new Danýþman("Sude", "MATYAR", "Yardýmcý Öðretim Görevlisi");
			Danýþman danýþman10 = new Danýþman("Eda", "HACIOÐLU", "Yardýmcý Öðretim Görevlisi");
		
			System.out.println("Ýstanbul Geliþim Üniversitesi danýþman sistemine hoþgeldiniz!");
			System.out.println("Lütfen iþlem yapmak istdiðiniz danýþmaný seçiniz: ");
			System.out.println("=============================================================================");
			System.out.println("0) Adý:" + danýþman1.getAd() + "        Soyadý: " + danýþman1.getSoyad() + "      Ünvaný: " + danýþman1.getÜnvan());
			System.out.println("1) Adý:" + danýþman2.getAd() + "        Soyadý: " + danýþman2.getSoyad() + "     Ünvaný: " + danýþman2.getÜnvan());
			System.out.println("2) Adý:" + danýþman3.getAd() + "        Soyadý: " + danýþman3.getSoyad() + "     Ünvaný: " + danýþman3.getÜnvan());
			System.out.println("3) Adý:" + danýþman4.getAd() + "        Soyadý: " + danýþman4.getSoyad() + "     Ünvaný: " + danýþman4.getÜnvan());
			System.out.println("4) Adý:" + danýþman5.getAd() + "       Soyadý: " + danýþman5.getSoyad() + "   Ünvaný: " + danýþman5.getÜnvan());
			System.out.println("5) Adý:" + danýþman6.getAd() + "     Soyadý: " + danýþman6.getSoyad() + "    Ünvaný: " + danýþman6.getÜnvan());
			System.out.println("6) Adý:" + danýþman7.getAd() + "   Soyadý: " + danýþman7.getSoyad() + "     Ünvaný: " + danýþman7.getÜnvan());
			System.out.println("7) Adý:" + danýþman8.getAd() + "      Soyadý: " + danýþman8.getSoyad() + "      Ünvaný: " + danýþman8.getÜnvan());
			System.out.println("8) Adý:" + danýþman9.getAd() + "        Soyadý: " + danýþman9.getSoyad() + "     Ünvaný: " + danýþman9.getÜnvan());
			System.out.println("9) Adý:" + danýþman10.getAd() + "         Soyadý: " + danýþman10.getSoyad() + "   Ünvaný: " + danýþman10.getÜnvan());
			System.out.println("=============================================================================");
			
			danýþmanSeçimi = scan.nextInt();
		
			while(danýþmanSeçimi < 0 || danýþmanSeçimi > 9) {
				System.out.println("Lütfen doðru tuþlayýnýz!");
				danýþmanSeçimi = scan.nextInt();
			}
			
			switch(danýþmanSeçimi) {
			
			case 0:
				while(true) {
					Kiþiler a = new Öðrenci("Uður", "KAYA", "Öðrenci", 101, 1, (float) 2.76);
					a.öðrenciEkle(a);
					
					System.out.println("Hoþgeldiniz! Sayýn " + danýþman1.getÜnvan() + " " + danýþman1.getAd() + " " + danýþman1.getSoyad());
					bm.iþlemMenüsü();
				}
				
			case 1:
				while(true) {
					Kiþiler a = new Öðrenci("Nur", "BAYRAM", "Öðrenci", 102, 2, (float) 2.76);
					a.öðrenciEkle(a);
					
					System.out.println("Hoþgeldiniz! Sayýn " + danýþman2.getÜnvan() + " " + danýþman2.getAd() + " " + danýþman2.getSoyad());
					bm.iþlemMenüsü();
				}
				
			case 2:
				while(true) {
					Kiþiler a = new Öðrenci("Zelal", "KAYRAN", "Öðrenci", 103, 3, (float) 3.2);
					a.öðrenciEkle(a);
					
					System.out.println("Hoþgeldiniz! Sayýn " + danýþman3.getÜnvan() + " " + danýþman3.getAd() + " " + danýþman3.getSoyad());
					bm.iþlemMenüsü();
				}
					
			case 3:
				while(true) {
					Kiþiler a = new Öðrenci("Sevilay", "YILDIZ", "Öðrenci", 104, 4, (float) 2.62);
					a.öðrenciEkle(a);
					
					System.out.println("Hoþgeldiniz! Sayýn " + danýþman4.getÜnvan() + " " + danýþman4.getAd() + " " + danýþman4.getSoyad());
					bm.iþlemMenüsü();
				}
				
			case 4:
				while(true) {
					Kiþiler a = new Öðrenci("Soner", "PELTEK", "Öðrenci", 105, 5, (float) 2.16);
					a.öðrenciEkle(a);
					
					System.out.println("Hoþgeldiniz! Sayýn " + danýþman5.getÜnvan() + " " + danýþman5.getAd() + " " + danýþman5.getSoyad());
					bm.iþlemMenüsü();
				}
					
			case 5:
				while(true) {
					Kiþiler a = new Öðrenci("Emirhan", "ÞEKER", "Öðrenci", 106, 6, (float) 2.21);
					a.öðrenciEkle(a);
					
					System.out.println("Hoþgeldiniz! Sayýn " + danýþman6.getÜnvan() + " " + danýþman6.getAd() + " " + danýþman6.getSoyad());
					bm.iþlemMenüsü();
				}
				
			case 6:
				while(true) {
					Kiþiler a = new Öðrenci("Cristiano", "RONALDO", "Öðrenci", 107, 7, (float) 4);
					a.öðrenciEkle(a);
					
					System.out.println("Hoþgeldiniz! Sayýn " + danýþman7.getÜnvan() + " " + danýþman7.getAd() + " " + danýþman7.getSoyad());
					bm.iþlemMenüsü();
				}
				
			case 7:
				while(true) {
					Kiþiler a = new Öðrenci("Elif", "KARACA", "Öðrenci", 108, 7, (float) 2.58);
					a.öðrenciEkle(a);
					
					System.out.println("Hoþgeldiniz! Sayýn " + danýþman8.getÜnvan() + " " + danýþman8.getAd() + " " + danýþman8.getSoyad());
					bm.iþlemMenüsü();
				}
				
			case 8:
				while(true) {
					Kiþiler a = new Öðrenci("Lionel", "MESSÝ", "Öðrenci", 109, 8, (float) 3.54);
					a.öðrenciEkle(a);
					
					System.out.println("Hoþgeldiniz! Sayýn " + danýþman9.getÜnvan() + " " + danýþman9.getAd() + " " + danýþman9.getSoyad());
					bm.iþlemMenüsü();
				}	
				
			case 9:
				while(true) {
					Kiþiler a = new Öðrenci("Robert", "LEWANDOWSKI", "Öðrenci", 110, 8, (float) 3.44);
					a.öðrenciEkle(a);
					
					System.out.println("Hoþgeldiniz! Sayýn " + danýþman10.getÜnvan() + " " + danýþman10.getAd() + " " + danýþman10.getSoyad());
					bm.iþlemMenüsü();
				}
			}
		}
	}	
}
	