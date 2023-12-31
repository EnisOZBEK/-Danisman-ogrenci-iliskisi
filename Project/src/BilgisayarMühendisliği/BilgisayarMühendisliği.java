package BilgisayarMühendisliği;

/**
 * Neredeyse bölümle alakalı bütün fonksiyonların çalıştığı sınıf.
 * @author Enis
 *
 */
public class BilgisayarMühendisliği extends Sistem {
	private final int limit;
	private final int danışmanLimiti;
	private static int toplamÖğrenciSayısı;
	private Öğrenci öğrenci[];
	private Danışman danışman[];
	private Kişiler kişilerListe[];
	
	/**
	 * Değişkenlerin değerlerini belirledik.
	 */
	public BilgisayarMühendisliği() {
		limit = 400;
		danışmanLimiti = 40;
		toplamÖğrenciSayısı = 0;
		öğrenci = new Öğrenci[400];
		danışman = new Danışman[10];
		kişilerListe = new Kişiler[410];
	}
	
	/**
	 * İşlem menüsünün fonksiyonu.
	 */
	public void işlemMenüsü() {
		System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
		System.out.println("1) Kişisel Bilgiler");
		System.out.println("2) Haftalık ders programı");
		System.out.println("3) Transkript");
		
		int işlemSeçimi = scan.nextInt();
		
		while(işlemSeçimi < 1 || işlemSeçimi > 3) {
			System.out.println("Lütfen doğru tuşlayınız!");
			işlemSeçimi = scan.nextInt();
		}
		
		switch(işlemSeçimi) {
		
		case 1:
			danışmanınÖğrencilerininBilgileriniListele();
			
			break;
			
		case 2:
			haftalıkDersProgramı();
		
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
	 * @return toplamÖğrenciSayısı nı döndürür.
	 */
	public static int getToplamÖğrenciSayısı() {
		return toplamÖğrenciSayısı;
	}
	
	/**
	 * Bir danışmana ait öğrencilerin kişisel bilgilerini listeler.
	 */
	public void danışmanınÖğrencilerininBilgileriniListele() {
		if(danışmanSeçimi() == 0) {
			for(int i = 0; i < danışman1ÖğrenciSayısı; i++) {
				System.out.println(kişilerListe[i]);
				System.out.println(kişilerListe[0]);
			}
		}
		
		else if(danışmanSeçimi() == 1) {
			for(int i = 0; i < danışman2ÖğrenciSayısı; i++) {
				System.out.println(öğrenci[i]);
			}
		}
		
		else if(danışmanSeçimi() == 2) {
			for(int i = 0; i < danışman3ÖğrenciSayısı; i++) {
				System.out.println(öğrenci[i]);
			}
		}
		
		else if(danışmanSeçimi() == 3) {
			for(int i = 0; i < danışman4ÖğrenciSayısı; i++) {
				System.out.println(öğrenci[i]);
			}
		}
		
		else if(danışmanSeçimi() == 4) {
			for(int i = 0; i < danışman5ÖğrenciSayısı; i++) {
				System.out.println(öğrenci[i]);
			}
		}
		
		else if(danışmanSeçimi() == 5) {
			for(int i = 0; i < danışman6ÖğrenciSayısı; i++) {
				System.out.println(öğrenci[i]);
			}
		}
		
		else if(danışmanSeçimi() == 6) {
			for(int i = 0; i < danışman7ÖğrenciSayısı; i++) {
				System.out.println(öğrenci[i]);
			}
		}
		
		else if(danışmanSeçimi() == 7) {
			for(int i = 0; i < danışman8ÖğrenciSayısı; i++) {
				System.out.println(öğrenci[i]);
			}
		}
		
		else if(danışmanSeçimi() == 8) {
			for(int i = 0; i < danışman9ÖğrenciSayısı; i++) {
				System.out.println(öğrenci[i]);
			}
		}
		
		else if(danışmanSeçimi() == 9) {
			for(int i = 0; i < danışman10ÖğrenciSayısı; i++) {
				System.out.println(öğrenci[i]);
			}
		}
		
	}
	
	/**
	 * Danışmanlara öğrenci eklerken kullandığımız fonksiyon. 
	 * @param kişiler
	 * @return Ekleyebilirsek true, ekleyemezsek false döndürür.
	 */
	public boolean öğrenciEkle(Kişiler kişiler) {
		if(toplamÖğrenciSayısı < limit) {
			if(danışmanSeçimi() == 0) {
				if(danışman1ÖğrenciSayısı < danışmanLimiti) {
					kişilerListe[danışman1ÖğrenciSayısı] = kişiler;
					toplamÖğrenciSayısı++;
					danışman1ÖğrenciSayısı++;
					return true;
				}
				else {
					System.err.println("Bu danışmana daha fazla öğrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danışmanSeçimi() == 1) {
				if(danışman2ÖğrenciSayısı < danışmanLimiti) {
					kişilerListe[danışman2ÖğrenciSayısı] = kişiler;
					toplamÖğrenciSayısı++;
					danışman2ÖğrenciSayısı++;
					return true;
				}
				else {
					System.err.println("Bu danışmana daha fazla öğrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danışmanSeçimi() == 2) {
				if(danışman3ÖğrenciSayısı < danışmanLimiti) {
					kişilerListe[danışman3ÖğrenciSayısı] = kişiler;
					toplamÖğrenciSayısı++;
					danışman3ÖğrenciSayısı++;
					return true;
				}
				else {
					System.err.println("Bu danışmana daha fazla öğrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danışmanSeçimi() == 3) {
				if(danışman4ÖğrenciSayısı < danışmanLimiti) {
					kişilerListe[danışman4ÖğrenciSayısı] = kişiler;
					toplamÖğrenciSayısı++;
					danışman4ÖğrenciSayısı++;
					return true;
				}
				else {
					System.err.println("Bu danışmana daha fazla öğrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danışmanSeçimi() == 4) {
				if(danışman5ÖğrenciSayısı < danışmanLimiti) {
					kişilerListe[danışman5ÖğrenciSayısı] = kişiler;
					toplamÖğrenciSayısı++;
					danışman5ÖğrenciSayısı++;
					return true;
				}
				else {
					System.err.println("Bu danışmana daha fazla öğrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danışmanSeçimi() == 5) {
				if(danışman6ÖğrenciSayısı < danışmanLimiti) {
					kişilerListe[danışman6ÖğrenciSayısı] = kişiler;
					toplamÖğrenciSayısı++;
					danışman6ÖğrenciSayısı++;
					return true;
				}
				else {
					System.err.println("Bu danışmana daha fazla öğrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danışmanSeçimi() == 6) {
				if(danışman7ÖğrenciSayısı < danışmanLimiti) {
					kişilerListe[danışman7ÖğrenciSayısı] = kişiler;
					toplamÖğrenciSayısı++;
					danışman7ÖğrenciSayısı++;
					return true;
				}
				else {
					System.err.println("Bu danışmana daha fazla öğrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danışmanSeçimi() == 7) {
				if(danışman8ÖğrenciSayısı < danışmanLimiti) {
					kişilerListe[danışman8ÖğrenciSayısı] = kişiler;
					toplamÖğrenciSayısı++;
					danışman8ÖğrenciSayısı++;
					return true;
				}
				else {
					System.err.println("Bu danışmana daha fazla öğrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danışmanSeçimi() == 8) {
				if(danışman9ÖğrenciSayısı < danışmanLimiti) {
					kişilerListe[danışman9ÖğrenciSayısı] = kişiler;
					toplamÖğrenciSayısı++;
					danışman9ÖğrenciSayısı++;
					return true;
				}
				else {
					System.err.println("Bu danışmana daha fazla öğrenci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(danışmanSeçimi() == 9) {
				if(danışman10ÖğrenciSayısı < danışmanLimiti) {
					kişilerListe[danışman10ÖğrenciSayısı] = kişiler;
					toplamÖğrenciSayısı++;
					danışman10ÖğrenciSayısı++;
					return true;
				}
				else {
					System.err.println("Bu danışmana daha fazla öğrenci ekleyemezsiniz!");
					return false;
				}
			}
		}
		System.err.println("Yanlış tuşlama yaptınız ya da bilgisayar mühendisliği bölümüne daha fazla öğrenci ekleyemezsiniz!");
		return false;
	}

	/**
	 * Döneme göre haftalık ders programını ekrana bastıran fonksiyon.
	 */
	public void haftalıkDersProgramı() {
		if(danışmanSeçimi() == 0) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FİZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danışmanSeçimi() == 1) {
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
		
		else if(danışmanSeçimi() == 2) {
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
		
		else if(danışmanSeçimi() == 3) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FİZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danışmanSeçimi() == 4) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FİZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danışmanSeçimi() == 5) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FİZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danışmanSeçimi() == 6) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FİZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danışmanSeçimi() == 7) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FİZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danışmanSeçimi() == 8) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FİZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(danışmanSeçimi() == 9) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("FİZ107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
	}
	
	/**
	 * Öğrencilerin transkriptini ekrana bastırır.
	 */
	public void transkript() {
		if(danışmanSeçimi() == 0) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 19");
			System.out.println("Ortalaması: 2.76");
			System.out.println("=======================");
		}
		
		else if(danışmanSeçimi() == 1) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 38");
			System.out.println("Ortalaması: 2.76");
			System.out.println("=======================");
		}

		else if(danışmanSeçimi() == 2) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 56");
			System.out.println("Ortalaması: 3.2");
		}

		else if(danışmanSeçimi() == 3) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 75");
			System.out.println("Ortalaması: 2.62");
			System.out.println("=======================");
		}
		
		else if(danışmanSeçimi() == 4) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 94");
			System.out.println("Ortalaması: 2.16");
			System.out.println("=======================");
		}

		else if(danışmanSeçimi() == 5) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 113");
			System.out.println("Ortalaması: 2.21");
			System.out.println("=======================");
		}

		else if(danışmanSeçimi() == 6) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 132");
			System.out.println("Ortalaması: 4");
			System.out.println("=======================");
		}

		else if(danışmanSeçimi() == 7) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 132");
			System.out.println("Ortalaması: 2.58");
			System.out.println("=======================");
		}

		else if(danışmanSeçimi() == 8) {
			System.out.println("=======================");
				System.out.println("Toplam Kredisi: 151");
				System.out.println("Ortalaması: 3.54");
				System.out.println("=======================");
			}

		else if(danışmanSeçimi() == 9) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 151");
			System.out.println("Ortalaması: 3.44");
			System.out.println("=======================");
		}

	}
	
}