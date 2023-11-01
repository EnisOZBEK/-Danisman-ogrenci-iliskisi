package BilgisayarM�hendisli�i;

/**
 * ��rencilerin s�n�f�.
 * @author Enis
 *
 */
public class ��renci extends Ki�iler {

	private static int toplam��renciSay�s�;
	private int no,d�nem;
	private float ortalama;

	/**
	 * ��rencilerin �zelliklerini belirleyen yap�c�.
	 * @param ad
	 * @param soyad
	 * @param �nvan
	 * @param no
	 * @param d�nem
	 * @param ortalama
	 */
	public ��renci(String ad, String soyad, String �nvan, int no, int d�nem, float ortalama) {
		super(ad, soyad, �nvan);
		toplam��renciSay�s�++;
	}

	/**
	 * Ekrana istedi�imiz �zellikleri bast�ran toString fonksiyonu.
	 */
	public String toString() {
		String s = " Ad: " + this.getAd() + "   Soyad: " + this.getSoyad() + "   No: " + this.getNo() + "   D�nem: " + this.getD�nem() + "Ortalama: " + this.getOrtalama();
		return s;
	}
	
	/**
	 * 
	 * @return no de�erini d�nd�r�r.
	 */
	public int getNo() {
		return no;
	}

	/**
	 * 
	 * @param no de�erini ayarlar.
	 */
	public void setNo(int no) {
		this.no = no;
	}

	/**
	 * 
	 * @return d�nem de�erini d�nd�r�r.
	 */
	public int getD�nem() {
		return d�nem;
	}

	/**
	 * 
	 * @param d�nem de�erini ayarlar.
	 */
	public void setD�nem(int d�nem) {
		this.d�nem = d�nem;
	}

	/**
	 * 
	 * @return toplam��renciSay�s� de�erini d�nd�r�r.
	 */
	public static int getToplam��renciSay�s�() {
		return toplam��renciSay�s�;
	}

	/**
	 * 
	 * @param toplam��renciSay�s� de�erini ayarlar.
	 */
	public static void setToplam��renciSay�s�(int toplam��renciSay�s�) {
		��renci.toplam��renciSay�s� = toplam��renciSay�s�;
	}

	/**
	 * 
	 * @return ortalama de�erini d�nd�r�r.
	 */
	public float getOrtalama() {
		return ortalama;
	}

	/**
	 * 
	 * @param ortalama de�erini ayarlar.
	 */
	public void setOrtalama(float ortalama) {
		this.ortalama = ortalama;
	}
}