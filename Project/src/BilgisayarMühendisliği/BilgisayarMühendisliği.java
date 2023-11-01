package BilgisayarMühendisliði;

/**
 * Neredeyse bölümle alakalý bütün fonksiyonlarýn çalýþtýðý sýnýf.
 * @author Enis
 *
 */
public class BilgisayarMühendisliði extends Sistem {
	private final int limit;
	private final int danýþmanLimiti;
	private static int toplamÖðrenciSayýsý;
	private Öðrenci öðrenci[];
	private Danýþman danýþman[];
	private Kiþiler kiþilerListe[];
	
	/**
	 * Deðiþkenlerin deðerlerini belirledik.
	 */
	public BilgisayarMühendisliði() {
		limit = 400;
		danýþmanLimiti = 40;
		toplamÖðrenciSayýsý = 0;
		öðrenci = new Öðrenci[400];
		danýþman = new Danýþman[10];
		kiþilerListe = new Kiþiler[410];
	}
	
	/**
	 * Ýþlem menüsünün fonksiyonu.
	 */
	public void iþlemMenüsü() {
		System.out.println("Lütfen yapmak istediðiniz iþlemi seçiniz: ");
		System.out.println("1) Kiþisel Bilgiler");
		System.out.println("2) Haftalýk ders programý");
		System.out.println("3) Transkript");
		
		int iþlemSeçimi = scan.nextInt();
		
		while(iþlemSeçimi < 1 || iþlemSeçimi > 3) {
			System.out.println("Lütfen doðru tuþlayýnýz!");
			iþlemSeçimi = scan.nextInt();
		}
		
		switch(iþlemSeçimi) {
		
		case 1:
			danýþmanýnÖðrencilerininBilgileriniListele();
			
			break;
			
		case 2:
			haftalýkDersProgramý();
		
			break;
			
		case 3:
			transkript();
			
			break;
			
		default:
			
			break;
		}
	}
	
	/**
	 * 
	 * @return toplamÖðrenciSayýsý ný döndürür.
	 */
	public static int getToplamÖðrenciSayýsý() {
		return toplamÖðrenciSayýsý;
	}
	
	/**
	 * Bir danýþmana ait öðrencilerin kiþisel bilgilerini listeler.
	 */
	public void danýþmanýnÖðrencilerininBilgileriniListele() {
		if(danýþmanSeçimi() == 0) {
			for(int i = 0; i < danýþman1ÖðrenciSayýsý; i++) {
				System.out.println(kiþilerListe[i]);
				System.out.println(kiþilerListe[0]);
			}
		}
		
		else if(danýþmanSeçimi() == 1) {
			for(int i = 0; i < danýþman2ÖðrenciSayýsý; i++) {
				System.out.println(öðrenci[i]);
			}
		}
		
		else if(danýþmanSeçimi() == 2) {
			for(int i = 0; i < danýþman3ÖðrenciSayýsý; i++) {
				System.out.println(öðrenci[i]);
			}
		}
		
		else if(danýþmanSeçimi() == 3) {
			for(int i = 0; i < danýþman4ÖðrenciSayýsý; i++) {
				System.out.println(öðrenci[i]);
			}
		}
		
		else if(danýþmanSeçimi() == 4) {
			for(int i = 0; i < danýþman5ÖðrenciSayýsý; i++) {
				System.out.println(öðrenci[i]);
			}
		}
		
		else if(danýþmanSeçimi() == 5) {
			for(int i = 0; i < danýþman6ÖðrenciSayýsý; i++) {
				System.out.println(öðrenci[i]);
			}
		}
		
		else if(danýþmanSeçimi() == 6) {
			for(int i = 0; i < danýþman7ÖðrenciSayýsý; i++) {
				System.out.println(öðrenci[i]);
			}
		}
		
		else if(danýþmanSeçimi() == 7) {
			for(int i = 0; i < danýþman8ÖðrenciSayýsý; i++) {
				System.out.println(öðrenci[i]);
			}
		}
		
		else if(danýþmanSeçimi() == 8) {
			for(int i = 0; i < danýþman9ÖðrenciSayýsý; i++) {
				System.out.println(öðrenci[i]);
			}
		}
		
		else if(danýþmanSeçimi() == 9) {
			for(int i = 0; i < danýþman10ÖðrenciSayýsý; i++) {
				System.out.println(öðrenci[i]);
			}
		}
		
	}
	
	/**
	 * Danýþmanlara öðrenci eklerken kullandýðýmýz fonksiyon. 
	 * @param kiþiler
	 * @return Ekleyebilirsek true, ekleyemezsek false döndürür.
	 */
	public boolean öðrenciEkle(Kiþiler kiþiler) {
		if(toplamÖðrenciSayýsý < limit) {
			if(danýþmanSeçimi() == 0) {
				if(danýþman1ÖðrenciSayýsý < danýþmanLimiti) {
					kiþilerListe[danýþman1ÖðrenciSayýsý] = kiþiler;
					toplamÖðrenciSayýsý++;
					danýþman1ÖðrenciSayýsý++;
					return true;
				}
				else {
					System.err.println("Bu danýþmana daha fazla öðrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danýþmanSeçimi() == 1) {
				if(danýþman2ÖðrenciSayýsý < danýþmanLimiti) {
					kiþilerListe[danýþman2ÖðrenciSayýsý] = kiþiler;
					toplamÖðrenciSayýsý++;
					danýþman2ÖðrenciSayýsý++;
					return true;
				}
				else {
					System.err.println("Bu danýþmana daha fazla öðrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danýþmanSeçimi() == 2) {
				if(danýþman3ÖðrenciSayýsý < danýþmanLimiti) {
					kiþilerListe[danýþman3ÖðrenciSayýsý] = kiþiler;
					toplamÖðrenciSayýsý++;
					danýþman3ÖðrenciSayýsý++;
					return true;
				}
				else {
					System.err.println("Bu danýþmana daha fazla öðrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danýþmanSeçimi() == 3) {
				if(danýþman4ÖðrenciSayýsý < danýþmanLimiti) {
					kiþilerListe[danýþman4ÖðrenciSayýsý] = kiþiler;
					toplamÖðrenciSayýsý++;
					danýþman4ÖðrenciSayýsý++;
					return true;
				}
				else {
					System.err.println("Bu danýþmana daha fazla öðrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danýþmanSeçimi() == 4) {
				if(danýþman5ÖðrenciSayýsý < danýþmanLimiti) {
					kiþilerListe[danýþman5ÖðrenciSayýsý] = kiþiler;
					toplamÖðrenciSayýsý++;
					danýþman5ÖðrenciSayýsý++;
					return true;
				}
				else {
					System.err.println("Bu danýþmana daha fazla öðrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danýþmanSeçimi() == 5) {
				if(danýþman6ÖðrenciSayýsý < danýþmanLimiti) {
					kiþilerListe[danýþman6ÖðrenciSayýsý] = kiþiler;
					toplamÖðrenciSayýsý++;
					danýþman6ÖðrenciSayýsý++;
					return true;
				}
				else {
					System.err.println("Bu danýþmana daha fazla öðrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danýþmanSeçimi() == 6) {
				if(danýþman7ÖðrenciSayýsý < danýþmanLimiti) {
					kiþilerListe[danýþman7ÖðrenciSayýsý] = kiþiler;
					toplamÖðrenciSayýsý++;
					danýþman7ÖðrenciSayýsý++;
					return true;
				}
				else {
					System.err.println("Bu danýþmana daha fazla öðrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danýþmanSeçimi() == 7) {
				if(danýþman8ÖðrenciSayýsý < danýþmanLimiti) {
					kiþilerListe[danýþman8ÖðrenciSayýsý] = kiþiler;
					toplamÖðrenciSayýsý++;
					danýþman8ÖðrenciSayýsý++;
					return true;
				}
				else {
					System.err.println("Bu danýþmana daha fazla öðrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danýþmanSeçimi() == 8) {
				if(danýþman9ÖðrenciSayýsý < danýþmanLimiti) {
					kiþilerListe[danýþman9ÖðrenciSayýsý] = kiþiler;
					toplamÖðrenciSayýsý++;
					danýþman9ÖðrenciSayýsý++;
					return true;
				}
				else {
					System.err.println("Bu danýþmana daha fazla öðrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danýþmanSeçimi() == 9) {
				if(danýþman10ÖðrenciSayýsý < danýþmanLimiti) {
					kiþilerListe[danýþman10ÖðrenciSayýsý] = kiþiler;
					toplamÖðrenciSayýsý++;
					danýþman10ÖðrenciSayýsý++;
					return true;
				}
				else {
					System.err.println("Bu danýþmana daha fazla öðrenci ekleyemezsiniz!");
					return false;
				}
			}
		}
		System.err.println("Yanlýþ tuþlama yaptýnýz ya da bilgisayar mühendisliði bölümüne daha fazla öðrenci ekleyemezsiniz!");
		return false;
	}

	/**
	 * Döneme göre haftalýk ders programýný ekrana bastýran fonksiyon.
	 */
	public void haftalýkDersProgramý() {
		if(danýþmanSeçimi() == 0) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FÝZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danýþmanSeçimi() == 1) {
			System.out.println("=======================");
			System.out.println("BIL106 --- 3 Kredi");
			System.out.println("FIZ108 --- 4 Kredi");
			System.out.println("MAT104 --- 3 Kredi");
			System.out.println("MAT106 --- 4 Kredi");
			System.out.println("TRD102 --- 2 Kredi");
			System.out.println("YDL102 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danýþmanSeçimi() == 2) {
			System.out.println("=======================");
			System.out.println("ATA201 --- 2 Kredi");
			System.out.println("BIL201 --- 4 Kredi");
			System.out.println("EEM211 --- 3 Kredi");
			System.out.println("MAT203 --- 3 Kredi");
			System.out.println("MAT207 --- 3 Kredi");
			System.out.println("SOS498 --- 3 Kredi");
			System.out.println("Toplam Kredi: 18");
			System.out.println("=======================");
		}
		
		else if(danýþmanSeçimi() == 3) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FÝZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danýþmanSeçimi() == 4) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FÝZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danýþmanSeçimi() == 5) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FÝZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danýþmanSeçimi() == 6) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FÝZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danýþmanSeçimi() == 7) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FÝZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danýþmanSeçimi() == 8) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FÝZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danýþmanSeçimi() == 9) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FÝZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
	}
	
	/**
	 * Öðrencilerin transkriptini ekrana bastýrýr.
	 */
	public void transkript() {
		if(danýþmanSeçimi() == 0) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 19");
			System.out.println("Ortalamasý: 2.76");
			System.out.println("=======================");
		}
		
		else if(danýþmanSeçimi() == 1) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 38");
			System.out.println("Ortalamasý: 2.76");
			System.out.println("=======================");
		}

		else if(danýþmanSeçimi() == 2) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 56");
			System.out.println("Ortalamasý: 3.2");
		}

		else if(danýþmanSeçimi() == 3) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 75");
			System.out.println("Ortalamasý: 2.62");
			System.out.println("=======================");
		}
		
		else if(danýþmanSeçimi() == 4) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 94");
			System.out.println("Ortalamasý: 2.16");
			System.out.println("=======================");
		}

		else if(danýþmanSeçimi() == 5) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 113");
			System.out.println("Ortalamasý: 2.21");
			System.out.println("=======================");
		}

		else if(danýþmanSeçimi() == 6) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 132");
			System.out.println("Ortalamasý: 4");
			System.out.println("=======================");
		}

		else if(danýþmanSeçimi() == 7) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 132");
			System.out.println("Ortalamasý: 2.58");
			System.out.println("=======================");
		}

		else if(danýþmanSeçimi() == 8) {
			System.out.println("=======================");
				System.out.println("Toplam Kredisi: 151");
				System.out.println("Ortalamasý: 3.54");
				System.out.println("=======================");
			}

		else if(danýþmanSeçimi() == 9) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 151");
			System.out.println("Ortalamasý: 3.44");
			System.out.println("=======================");
		}

	}
	
}