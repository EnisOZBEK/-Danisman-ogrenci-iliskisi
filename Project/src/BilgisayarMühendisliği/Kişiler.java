package BilgisayarM�hendisli�i;

/**
 * B�l�mde ki t�m insanlar�n �zelliklerini belirleyen s�n�f
 * @author Enis
 *
 */
public abstract class Ki�iler extends BilgisayarM�hendisli�i {
	private String ad, soyad;
	protected String �nvan;

	/**
	 * B�l�mde ki herkesin ad�n�, soyad�n� ve �nvan�n� belirleyen yap�c�.
	 * @param ad
	 * @param soyad
	 * @param �nvan
	 */
	public Ki�iler(String ad, String soyad, String �nvan) {
		setAd(ad);
		setSoyad(soyad);
		set�nvan(�nvan);
	}

	/**
	 * 
	 * @return ad de�erini d�nd�r�r.
	 */
	public String getAd() {
		return ad;
	}

	/**
	 * 
	 * @param ad de�erini ayarlar.
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}

	/**
	 * 
	 * @return soyad de�erini d�nd�r�r.
	 */
	public String getSoyad() {
		return soyad;
	}

	/**
	 * 
	 * @param soyad de�erini ayarlar.
	 */
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	/**
	 * 
	 * @return �nvan de�erini d�nd�r�r.
	 */
	public String get�nvan() {
		return �nvan;
	}

	/**
	 * 
	 * @param �nvan de�erini ayarlar.
	 */
	public void set�nvan(String �nvan) {
		this.�nvan = �nvan;
	}
}