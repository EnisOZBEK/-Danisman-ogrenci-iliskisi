package BilgisayarM�hendisli�i;

import java.util.Scanner;

/**
 * B�t�n sistemin �al��t��� s�n�f.
 * @author Enis
 *
 */
public class Sistem {
		
	Scanner scan = new Scanner(System.in);
	
	public static int dan��manSe�imi;
	public static int dan��man1��renciSay�s� = 0;
	public static int dan��man2��renciSay�s� = 0;
	public static int dan��man3��renciSay�s� = 0;
	public static int dan��man4��renciSay�s� = 0;
	public static int dan��man5��renciSay�s� = 0;
	public static int dan��man6��renciSay�s� = 0;
	public static int dan��man7��renciSay�s� = 0;
	public static int dan��man8��renciSay�s� = 0;
	public static int dan��man9��renciSay�s� = 0;
	public static int dan��man10��renciSay�s� = 0;
	
	/**
	 * 
	 * @return Se�ti�imiz dan��man�n de�erini d�nd�r�r.
	 */
	public static int dan��manSe�imi() {
		return dan��manSe�imi;
	}
	
	/**
	 * Sistemi ba�latan fonksiyon.
	 */
	public void sistemiBa�lat() {
		
		while(true) {
			
			BilgisayarM�hendisli�i bm = new BilgisayarM�hendisli�i();
			
			Dan��man dan��man1 = new Dan��man("Enis", "�ZBEK", "Prof.");
			Dan��man dan��man2 = new Dan��man("Eren", "KAYNAR", "Prof.");
			Dan��man dan��man3 = new Dan��man("Utku", "YILDIZ", "Do�.");
			Dan��man dan��man4 = new Dan��man("Sefa", "�ZKAYA", "Do�.");
			Dan��man dan��man5 = new Dan��man("Mira�", "G�LC�HAN", "Do�.");
			Dan��man dan��man6 = new Dan��man("Emirhan", "PEKESER", "��retim G�revlisi");
			Dan��man dan��man7 = new Dan��man("Ece �zlem", "��M�EK", "��retim G�revlisi");
			Dan��man dan��man8 = new Dan��man("G�lcan", "DO�AN", "��retim G�revlisi");
			Dan��man dan��man9 = new Dan��man("Sude", "MATYAR", "Yard�mc� ��retim G�revlisi");
			Dan��man dan��man10 = new Dan��man("Eda", "HACIO�LU", "Yard�mc� ��retim G�revlisi");
		
			System.out.println("�stanbul Geli�im �niversitesi dan��man sistemine ho�geldiniz!");
			System.out.println("L�tfen i�lem yapmak istdi�iniz dan��man� se�iniz: ");
			System.out.println("=============================================================================");
			System.out.println("0) Ad�:" + dan��man1.getAd() + "        Soyad�: " + dan��man1.getSoyad() + "      �nvan�: " + dan��man1.get�nvan());
			System.out.println("1) Ad�:" + dan��man2.getAd() + "        Soyad�: " + dan��man2.getSoyad() + "     �nvan�: " + dan��man2.get�nvan());
			System.out.println("2) Ad�:" + dan��man3.getAd() + "        Soyad�: " + dan��man3.getSoyad() + "     �nvan�: " + dan��man3.get�nvan());
			System.out.println("3) Ad�:" + dan��man4.getAd() + "        Soyad�: " + dan��man4.getSoyad() + "     �nvan�: " + dan��man4.get�nvan());
			System.out.println("4) Ad�:" + dan��man5.getAd() + "       Soyad�: " + dan��man5.getSoyad() + "   �nvan�: " + dan��man5.get�nvan());
			System.out.println("5) Ad�:" + dan��man6.getAd() + "     Soyad�: " + dan��man6.getSoyad() + "    �nvan�: " + dan��man6.get�nvan());
			System.out.println("6) Ad�:" + dan��man7.getAd() + "   Soyad�: " + dan��man7.getSoyad() + "     �nvan�: " + dan��man7.get�nvan());
			System.out.println("7) Ad�:" + dan��man8.getAd() + "      Soyad�: " + dan��man8.getSoyad() + "      �nvan�: " + dan��man8.get�nvan());
			System.out.println("8) Ad�:" + dan��man9.getAd() + "        Soyad�: " + dan��man9.getSoyad() + "     �nvan�: " + dan��man9.get�nvan());
			System.out.println("9) Ad�:" + dan��man10.getAd() + "         Soyad�: " + dan��man10.getSoyad() + "   �nvan�: " + dan��man10.get�nvan());
			System.out.println("=============================================================================");
			
			dan��manSe�imi = scan.nextInt();
		
			while(dan��manSe�imi < 0 || dan��manSe�imi > 9) {
				System.out.println("L�tfen do�ru tu�lay�n�z!");
				dan��manSe�imi = scan.nextInt();
			}
			
			switch(dan��manSe�imi) {
			
			case 0:
				while(true) {
					Ki�iler a = new ��renci("U�ur", "KAYA", "��renci", 101, 1, (float) 2.76);
					a.��renciEkle(a);
					
					System.out.println("Ho�geldiniz! Say�n " + dan��man1.get�nvan() + " " + dan��man1.getAd() + " " + dan��man1.getSoyad());
					bm.i�lemMen�s�();
				}
				
			case 1:
				while(true) {
					Ki�iler a = new ��renci("Nur", "BAYRAM", "��renci", 102, 2, (float) 2.76);
					a.��renciEkle(a);
					
					System.out.println("Ho�geldiniz! Say�n " + dan��man2.get�nvan() + " " + dan��man2.getAd() + " " + dan��man2.getSoyad());
					bm.i�lemMen�s�();
				}
				
			case 2:
				while(true) {
					Ki�iler a = new ��renci("Zelal", "KAYRAN", "��renci", 103, 3, (float) 3.2);
					a.��renciEkle(a);
					
					System.out.println("Ho�geldiniz! Say�n " + dan��man3.get�nvan() + " " + dan��man3.getAd() + " " + dan��man3.getSoyad());
					bm.i�lemMen�s�();
				}
					
			case 3:
				while(true) {
					Ki�iler a = new ��renci("Sevilay", "YILDIZ", "��renci", 104, 4, (float) 2.62);
					a.��renciEkle(a);
					
					System.out.println("Ho�geldiniz! Say�n " + dan��man4.get�nvan() + " " + dan��man4.getAd() + " " + dan��man4.getSoyad());
					bm.i�lemMen�s�();
				}
				
			case 4:
				while(true) {
					Ki�iler a = new ��renci("Soner", "PELTEK", "��renci", 105, 5, (float) 2.16);
					a.��renciEkle(a);
					
					System.out.println("Ho�geldiniz! Say�n " + dan��man5.get�nvan() + " " + dan��man5.getAd() + " " + dan��man5.getSoyad());
					bm.i�lemMen�s�();
				}
					
			case 5:
				while(true) {
					Ki�iler a = new ��renci("Emirhan", "�EKER", "��renci", 106, 6, (float) 2.21);
					a.��renciEkle(a);
					
					System.out.println("Ho�geldiniz! Say�n " + dan��man6.get�nvan() + " " + dan��man6.getAd() + " " + dan��man6.getSoyad());
					bm.i�lemMen�s�();
				}
				
			case 6:
				while(true) {
					Ki�iler a = new ��renci("Cristiano", "RONALDO", "��renci", 107, 7, (float) 4);
					a.��renciEkle(a);
					
					System.out.println("Ho�geldiniz! Say�n " + dan��man7.get�nvan() + " " + dan��man7.getAd() + " " + dan��man7.getSoyad());
					bm.i�lemMen�s�();
				}
				
			case 7:
				while(true) {
					Ki�iler a = new ��renci("Elif", "KARACA", "��renci", 108, 7, (float) 2.58);
					a.��renciEkle(a);
					
					System.out.println("Ho�geldiniz! Say�n " + dan��man8.get�nvan() + " " + dan��man8.getAd() + " " + dan��man8.getSoyad());
					bm.i�lemMen�s�();
				}
				
			case 8:
				while(true) {
					Ki�iler a = new ��renci("Lionel", "MESS�", "��renci", 109, 8, (float) 3.54);
					a.��renciEkle(a);
					
					System.out.println("Ho�geldiniz! Say�n " + dan��man9.get�nvan() + " " + dan��man9.getAd() + " " + dan��man9.getSoyad());
					bm.i�lemMen�s�();
				}	
				
			case 9:
				while(true) {
					Ki�iler a = new ��renci("Robert", "LEWANDOWSKI", "��renci", 110, 8, (float) 3.44);
					a.��renciEkle(a);
					
					System.out.println("Ho�geldiniz! Say�n " + dan��man10.get�nvan() + " " + dan��man10.getAd() + " " + dan��man10.getSoyad());
					bm.i�lemMen�s�();
				}
			}
		}
	}	
}
	