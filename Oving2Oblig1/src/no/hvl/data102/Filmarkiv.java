package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT{
	private Film[] arkiv;
	private int antall;
	
	public Filmarkiv(int storrelse) {
		this.arkiv = new Film[storrelse];
		antall = 0;
	}
	
	/**
	 * Viser en film
	 * @param nr nummer på film som skal vises. Om nummeret ikke finnes
	 * skrives en feilmelding.
	 */
	public Film visFilm(int nr) {
			boolean funnet = false;
			for(int i = 0; i < antall && !funnet; i++) {
				if(arkiv[i].getFilmnr() == nr) {
					return arkiv[i];
				}
			}
		return null;
	}
	
	/**
	 * Legger til en ny film.
	 * @param nyFilm
	 */
	public void leggTilFilm(Film nyFilm) {
		if(antall == arkiv.length) {
			utvid();
		}
		arkiv[antall] = nyFilm;
		antall++;
	}
	
	private void utvid() {
		Film[] tempArkiv = new Film[arkiv.length * 2];
		for(int i = 0; i < antall; i++) {
			tempArkiv[i] = arkiv[i];
		}
		arkiv = tempArkiv;
	}
	
	/**
	 * Sletter en film med gitt nr
	 * @param filmnr nr på film som skal slettes
	 * @return true om filmen ble slettet, false ellers
	 */
	public boolean slettFilm(int filmnr) {
		boolean funnet = false;
		for(int i = 0; i < antall && !funnet; i++) {
			if(filmnr == arkiv[i].getFilmnr()) {
				arkiv[i] = arkiv[antall - 1];
				arkiv[antall - 1] = null;
				antall--;
				funnet = true;
			}
		}
		return funnet;
	}
	
	/**
	 * Søker og henter Filmer med en gitt delstreng i tittelen
	 * @param delstreng som må være i tittel
	 * @return tabell med filmer som har delstreng i tittel
	 */
	public Film[] soekTittel(String delstreng) {
		Film[] nyTab = new Film[antall];
		int nyAntall = 0;
		for(int i = 0; i < antall; i++) {
			if(arkiv[i].getTittel().contains(delstreng)) {
				nyTab[nyAntall] = arkiv[i];
				nyAntall ++;
			}
		}
		if(nyAntall < antall) {
			nyTab = trimTab(nyTab, nyAntall);
		}
		return nyTab;
	}
	
	public Film[] soekProdusent(String navn) {
		Film[] nyTab = new Film[antall];
		int nyAntall = 0;
		for(int i = 0; i < antall; i++) {
			if(arkiv[i].getProdusent() == navn) {
				nyTab[nyAntall] = arkiv[i];
				nyAntall++;
			}
		}
		if(nyAntall < antall) {
			nyTab = trimTab(nyTab, nyAntall);
		}
		return nyTab;
	}
	
	/**
	 * Finner antall filmer med gitt sjanger
	 * @param sjanger
	 * @return antal filmer av gitt sjanger
	 */
	public int antall(Sjanger sjanger) {
		int funnet = 0;
		for(int i = 0; i < antall; i++) {
			if(sjanger == arkiv[i].getSjanger()) {
				funnet++;
			}
		}
		return funnet;
	}
	
	private Film[] trimTab(Film[] tab, int n) {
		Film[] nyTab = new Film[n];
		for(int i = 0; i < n; i++) {
			nyTab[i] = tab[i];
		}
		return nyTab;
	}
	
	/**
	 * 
	 * @return antal filmer i arkivet
	 */
	public int antall() {
		return antall;
	}
}
