package Auto.Model;

public class Auto implements Comparable<Auto> {	

	
	private String targa;
	
	private String km;
	private String anno;
	private String prezzo;
	
	public static final int BLEN=396;
	
	public Auto(String targa,  String km, String anno, String prezzo) {
		super();
		setTarga(targa);
		
		this.km = km;
		setAnno(anno);
		this.prezzo = prezzo;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	public String getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}
	public String getAnno() {
		return anno;
	}
	
	public void setAnno(String anno) {
		this.anno=anno;
	}
	public String toString() {
		return "Auto [targa=" + targa + ", km=" + km + ", anno=" + anno + ", prezzo=" + prezzo + "]";
	}

	@Override
	public int compareTo(Auto a) {
		// TODO Auto-generated method stub
		return toString().compareTo(a.toString());
    }
	}

