package BilgisayarMühendisliði;

/**
 * Öðrencilerin sýnýfý.
 * @author Enis
 *
 */
public class Öðrenci extends Kiþiler {

	private static int toplamÖðrenciSayýsý;
	private int no,dönem;
	private float ortalama;

	/**
	 * Öðrencilerin özelliklerini belirleyen yapýcý.
	 * @param ad
	 * @param soyad
	 * @param ünvan
	 * @param no
	 * @param dönem
	 * @param ortalama
	 */
	public Öðrenci(String ad, String soyad, String ünvan, int no, int dönem, float ortalama) {
		super(ad, soyad, ünvan);
		toplamÖðrenciSayýsý++;
	}

	/**
	 * Ekrana istediðimiz özellikleri bastýran toString fonksiyonu.
	 */
	public String toString() {
		String s = " Ad: " + this.getAd() + "   Soyad: " + this.getSoyad() + "   No: " + this.getNo() + "   Dönem: " + this.getDönem() + "Ortalama: " + this.getOrtalama();
		return s;
	}
	
	/**
	 * 
	 * @return no deðerini döndürür.
	 */
	public int getNo() {
		return no;
	}

	/**
	 * 
	 * @param no deðerini ayarlar.
	 */
	public void setNo(int no) {
		this.no = no;
	}

	/**
	 * 
	 * @return dönem deðerini döndürür.
	 */
	public int getDönem() {
		return dönem;
	}

	/**
	 * 
	 * @param dönem deðerini ayarlar.
	 */
	public void setDönem(int dönem) {
		this.dönem = dönem;
	}

	/**
	 * 
	 * @return toplamÖðrenciSayýsý deðerini döndürür.
	 */
	public static int getToplamÖðrenciSayýsý() {
		return toplamÖðrenciSayýsý;
	}

	/**
	 * 
	 * @param toplamÖðrenciSayýsý deðerini ayarlar.
	 */
	public static void setToplamÖðrenciSayýsý(int toplamÖðrenciSayýsý) {
		Öðrenci.toplamÖðrenciSayýsý = toplamÖðrenciSayýsý;
	}

	/**
	 * 
	 * @return ortalama deðerini döndürür.
	 */
	public float getOrtalama() {
		return ortalama;
	}

	/**
	 * 
	 * @param ortalama deðerini ayarlar.
	 */
	public void setOrtalama(float ortalama) {
		this.ortalama = ortalama;
	}
}