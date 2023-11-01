package BilgisayarM�hendisli�i;

/**
 * Neredeyse b�l�mle alakal� b�t�n fonksiyonlar�n �al��t��� s�n�f.
 * @author Enis
 *
 */
public class BilgisayarM�hendisli�i extends Sistem {
	private final int limit;
	private final int dan��manLimiti;
	private static int toplam��renciSay�s�;
	private ��renci ��renci[];
	private Dan��man dan��man[];
	private Ki�iler ki�ilerListe[];
	
	/**
	 * De�i�kenlerin de�erlerini belirledik.
	 */
	public BilgisayarM�hendisli�i() {
		limit = 400;
		dan��manLimiti = 40;
		toplam��renciSay�s� = 0;
		��renci = new ��renci[400];
		dan��man = new Dan��man[10];
		ki�ilerListe = new Ki�iler[410];
	}
	
	/**
	 * ��lem men�s�n�n fonksiyonu.
	 */
	public void i�lemMen�s�() {
		System.out.println("L�tfen yapmak istedi�iniz i�lemi se�iniz: ");
		System.out.println("1) Ki�isel Bilgiler");
		System.out.println("2) Haftal�k ders program�");
		System.out.println("3) Transkript");
		
		int i�lemSe�imi = scan.nextInt();
		
		while(i�lemSe�imi < 1 || i�lemSe�imi > 3) {
			System.out.println("L�tfen do�ru tu�lay�n�z!");
			i�lemSe�imi = scan.nextInt();
		}
		
		switch(i�lemSe�imi) {
		
		case 1:
			dan��man�n��rencilerininBilgileriniListele();
			
			break;
			
		case 2:
			haftal�kDersProgram�();
		
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
	 * @return toplam��renciSay�s� n� d�nd�r�r.
	 */
	public static int getToplam��renciSay�s�() {
		return toplam��renciSay�s�;
	}
	
	/**
	 * Bir dan��mana ait ��rencilerin ki�isel bilgilerini listeler.
	 */
	public void dan��man�n��rencilerininBilgileriniListele() {
		if(dan��manSe�imi() == 0) {
			for(int i = 0; i < dan��man1��renciSay�s�; i++) {
				System.out.println(ki�ilerListe[i]);
				System.out.println(ki�ilerListe[0]);
			}
		}
		
		else if(dan��manSe�imi() == 1) {
			for(int i = 0; i < dan��man2��renciSay�s�; i++) {
				System.out.println(��renci[i]);
			}
		}
		
		else if(dan��manSe�imi() == 2) {
			for(int i = 0; i < dan��man3��renciSay�s�; i++) {
				System.out.println(��renci[i]);
			}
		}
		
		else if(dan��manSe�imi() == 3) {
			for(int i = 0; i < dan��man4��renciSay�s�; i++) {
				System.out.println(��renci[i]);
			}
		}
		
		else if(dan��manSe�imi() == 4) {
			for(int i = 0; i < dan��man5��renciSay�s�; i++) {
				System.out.println(��renci[i]);
			}
		}
		
		else if(dan��manSe�imi() == 5) {
			for(int i = 0; i < dan��man6��renciSay�s�; i++) {
				System.out.println(��renci[i]);
			}
		}
		
		else if(dan��manSe�imi() == 6) {
			for(int i = 0; i < dan��man7��renciSay�s�; i++) {
				System.out.println(��renci[i]);
			}
		}
		
		else if(dan��manSe�imi() == 7) {
			for(int i = 0; i < dan��man8��renciSay�s�; i++) {
				System.out.println(��renci[i]);
			}
		}
		
		else if(dan��manSe�imi() == 8) {
			for(int i = 0; i < dan��man9��renciSay�s�; i++) {
				System.out.println(��renci[i]);
			}
		}
		
		else if(dan��manSe�imi() == 9) {
			for(int i = 0; i < dan��man10��renciSay�s�; i++) {
				System.out.println(��renci[i]);
			}
		}
		
	}
	
	/**
	 * Dan��manlara ��renci eklerken kulland���m�z fonksiyon. 
	 * @param ki�iler
	 * @return Ekleyebilirsek true, ekleyemezsek false d�nd�r�r.
	 */
	public boolean ��renciEkle(Ki�iler ki�iler) {
		if(toplam��renciSay�s� < limit) {
			if(dan��manSe�imi() == 0) {
				if(dan��man1��renciSay�s� < dan��manLimiti) {
					ki�ilerListe[dan��man1��renciSay�s�] = ki�iler;
					toplam��renciSay�s�++;
					dan��man1��renciSay�s�++;
					return true;
				}
				else {
					System.err.println("Bu dan��mana daha fazla ��renci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(dan��manSe�imi() == 1) {
				if(dan��man2��renciSay�s� < dan��manLimiti) {
					ki�ilerListe[dan��man2��renciSay�s�] = ki�iler;
					toplam��renciSay�s�++;
					dan��man2��renciSay�s�++;
					return true;
				}
				else {
					System.err.println("Bu dan��mana daha fazla ��renci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(dan��manSe�imi() == 2) {
				if(dan��man3��renciSay�s� < dan��manLimiti) {
					ki�ilerListe[dan��man3��renciSay�s�] = ki�iler;
					toplam��renciSay�s�++;
					dan��man3��renciSay�s�++;
					return true;
				}
				else {
					System.err.println("Bu dan��mana daha fazla ��renci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(dan��manSe�imi() == 3) {
				if(dan��man4��renciSay�s� < dan��manLimiti) {
					ki�ilerListe[dan��man4��renciSay�s�] = ki�iler;
					toplam��renciSay�s�++;
					dan��man4��renciSay�s�++;
					return true;
				}
				else {
					System.err.println("Bu dan��mana daha fazla ��renci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(dan��manSe�imi() == 4) {
				if(dan��man5��renciSay�s� < dan��manLimiti) {
					ki�ilerListe[dan��man5��renciSay�s�] = ki�iler;
					toplam��renciSay�s�++;
					dan��man5��renciSay�s�++;
					return true;
				}
				else {
					System.err.println("Bu dan��mana daha fazla ��renci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(dan��manSe�imi() == 5) {
				if(dan��man6��renciSay�s� < dan��manLimiti) {
					ki�ilerListe[dan��man6��renciSay�s�] = ki�iler;
					toplam��renciSay�s�++;
					dan��man6��renciSay�s�++;
					return true;
				}
				else {
					System.err.println("Bu dan��mana daha fazla ��renci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(dan��manSe�imi() == 6) {
				if(dan��man7��renciSay�s� < dan��manLimiti) {
					ki�ilerListe[dan��man7��renciSay�s�] = ki�iler;
					toplam��renciSay�s�++;
					dan��man7��renciSay�s�++;
					return true;
				}
				else {
					System.err.println("Bu dan��mana daha fazla ��renci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(dan��manSe�imi() == 7) {
				if(dan��man8��renciSay�s� < dan��manLimiti) {
					ki�ilerListe[dan��man8��renciSay�s�] = ki�iler;
					toplam��renciSay�s�++;
					dan��man8��renciSay�s�++;
					return true;
				}
				else {
					System.err.println("Bu dan��mana daha fazla ��renci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(dan��manSe�imi() == 8) {
				if(dan��man9��renciSay�s� < dan��manLimiti) {
					ki�ilerListe[dan��man9��renciSay�s�] = ki�iler;
					toplam��renciSay�s�++;
					dan��man9��renciSay�s�++;
					return true;
				}
				else {
					System.err.println("Bu dan��mana daha fazla ��renci ekleyemezsiniz!");
					return false;
				}
			}
			
			else if(dan��manSe�imi() == 9) {
				if(dan��man10��renciSay�s� < dan��manLimiti) {
					ki�ilerListe[dan��man10��renciSay�s�] = ki�iler;
					toplam��renciSay�s�++;
					dan��man10��renciSay�s�++;
					return true;
				}
				else {
					System.err.println("Bu dan��mana daha fazla ��renci ekleyemezsiniz!");
					return false;
				}
			}
		}
		System.err.println("Yanl�� tu�lama yapt�n�z ya da bilgisayar m�hendisli�i b�l�m�ne daha fazla ��renci ekleyemezsiniz!");
		return false;
	}

	/**
	 * D�neme g�re haftal�k ders program�n� ekrana bast�ran fonksiyon.
	 */
	public void haftal�kDersProgram�() {
		if(dan��manSe�imi() == 0) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("F�Z107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(dan��manSe�imi() == 1) {
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
		
		else if(dan��manSe�imi() == 2) {
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
		
		else if(dan��manSe�imi() == 3) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("F�Z107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(dan��manSe�imi() == 4) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("F�Z107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(dan��manSe�imi() == 5) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("F�Z107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(dan��manSe�imi() == 6) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("F�Z107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(dan��manSe�imi() == 7) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("F�Z107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(dan��manSe�imi() == 8) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("F�Z107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
		
		else if(dan��manSe�imi() == 9) {
			System.out.println("=======================");
			System.out.println("BIL105 --- 3 Kredi");
			System.out.println("BIL107 --- 3 Kredi");
			System.out.println("F�Z107 --- 4 Kredi");
			System.out.println("MAT105 --- 4 Kredi");
			System.out.println("TRD101 --- 2 Kredi");
			System.out.println("YDL101 --- 3 Kredi");
			System.out.println("Toplam Kredi: 19");
			System.out.println("=======================");
		}
	}
	
	/**
	 * ��rencilerin transkriptini ekrana bast�r�r.
	 */
	public void transkript() {
		if(dan��manSe�imi() == 0) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 19");
			System.out.println("Ortalamas�: 2.76");
			System.out.println("=======================");
		}
		
		else if(dan��manSe�imi() == 1) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 38");
			System.out.println("Ortalamas�: 2.76");
			System.out.println("=======================");
		}

		else if(dan��manSe�imi() == 2) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 56");
			System.out.println("Ortalamas�: 3.2");
		}

		else if(dan��manSe�imi() == 3) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 75");
			System.out.println("Ortalamas�: 2.62");
			System.out.println("=======================");
		}
		
		else if(dan��manSe�imi() == 4) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 94");
			System.out.println("Ortalamas�: 2.16");
			System.out.println("=======================");
		}

		else if(dan��manSe�imi() == 5) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 113");
			System.out.println("Ortalamas�: 2.21");
			System.out.println("=======================");
		}

		else if(dan��manSe�imi() == 6) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 132");
			System.out.println("Ortalamas�: 4");
			System.out.println("=======================");
		}

		else if(dan��manSe�imi() == 7) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 132");
			System.out.println("Ortalamas�: 2.58");
			System.out.println("=======================");
		}

		else if(dan��manSe�imi() == 8) {
			System.out.println("=======================");
				System.out.println("Toplam Kredisi: 151");
				System.out.println("Ortalamas�: 3.54");
				System.out.println("=======================");
			}

		else if(dan��manSe�imi() == 9) {
			System.out.println("=======================");
			System.out.println("Toplam Kredisi: 151");
			System.out.println("Ortalamas�: 3.44");
			System.out.println("=======================");
		}

	}
	
}