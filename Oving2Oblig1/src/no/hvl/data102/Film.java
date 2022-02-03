package no.hvl.data102;

public class Film {
	private int filmnr;
	private String produsent;
	private String tittel;
	private int ar;
	private Sjanger sjanger;
	private String selskap;
	
	
	public Film() {
		
	}
	
	public Film(int filmnr, String produsent, String tittel, int Ar, Sjanger sjanger, String selskap) {
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.ar = Ar;
		this.sjanger = sjanger;
		this.selskap = selskap;
	}
	
	public int getFilmnr() {
		return filmnr;
	}
	public void setFilmnr(int nr) {
		filmnr = nr;
	}
	
	public String getProdusent() {
		return produsent;
	}
	public void setProdusent(String navn) {
		produsent = navn;
	}
	
	public String getTittel() {
		return tittel;
	}
	public void setTittel(String navn) {
		tittel = navn;
	}
	
	public int getAr() {
		return ar;
	}
	public void setAr(int aar) {
		ar = aar;
	}
	
	public Sjanger getSjanger() {
		return sjanger;
	}
	public void setSjanger(Sjanger tekst) {
		sjanger = tekst;
	}
	
	public String getSelskap() {
		return selskap;
	}
	public void setSelskap(String navn) {
		selskap = navn;
	}
	
	
	public boolean equals(Film film) {
			if(film.getFilmnr() == filmnr) {
				return true;
			}
			return false;
		}

	
	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
	}
	@Override
	public String toString() {
		return "Nr: " + filmnr + 
				"\nProdusent: " + produsent + 
				"\nTittel: " + tittel + 
				"\nUtgivelsesår: " + ar + 
				"\nSjanger: " + sjanger.toString() + 
				"\nSelskap: " + selskap;
	}
}
