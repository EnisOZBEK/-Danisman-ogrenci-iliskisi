package BilgisayarMühendisliði;

/**
 * Bölümde ki tüm insanlarýn özelliklerini belirleyen sýnýf
 * @author Enis
 *
 */
public abstract class Kiþiler extends BilgisayarMühendisliði {
	private String ad, soyad;
	protected String ünvan;

	/**
	 * Bölümde ki herkesin adýný, soyadýný ve ünvanýný belirleyen yapýcý.
	 * @param ad
	 * @param soyad
	 * @param ünvan
	 */
	public Kiþiler(String ad, String soyad, String ünvan) {
		setAd(ad);
		setSoyad(soyad);
		setÜnvan(ünvan);
	}

	/**
	 * 
	 * @return ad deðerini döndürür.
	 */
	public String getAd() {
		return ad;
	}

	/**
	 * 
	 * @param ad deðerini ayarlar.
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}

	/**
	 * 
	 * @return soyad deðerini döndürür.
	 */
	public String getSoyad() {
		return soyad;
	}

	/**
	 * 
	 * @param soyad deðerini ayarlar.
	 */
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	/**
	 * 
	 * @return ünvan deðerini döndürür.
	 */
	public String getÜnvan() {
		return ünvan;
	}

	/**
	 * 
	 * @param ünvan deðerini ayarlar.
	 */
	public void setÜnvan(String ünvan) {
		this.ünvan = ünvan;
	}
}