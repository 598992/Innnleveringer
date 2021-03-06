package no.hvl.data102.adt;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public interface FilmarkivADT {
	
	/**
	 * Viser en film
	 * @param nr nummer p? film som skal vises. Om nummeret ikke finnes
	 * skrives en feilmelding.
	 */
	Film visFilm(int nr);
	
	/**
	 * Legger til en ny film.
	 * @param nyFilm
	 */
	void leggTilFilm(Film nyFilm);
	
	/**
	 * Sletter en film med gitt nr
	 * @param filmnr nr p? film som skal slettes
	 * @return true om filmen ble slettet, false ellers
	 */
	boolean slettFilm(int filmnr);
	
	/**
	 * S?ker og henter Filmer med en gitt delstreng i tittelen
	 * @param delstreng som m? v?re i tittel
	 * @return tabell med filmer som har delstreng i tittel
	 */
	Film[] soekTittel(String delstreng);
	
	Film[] soekProdusent(String delstreng);
	
	/**
	 * Finner antall filmer med gitt sjanger
	 * @param sjanger
	 * @return antal filmer av gitt sjanger
	 */
	int antall(Sjanger sjanger);
	
	/**
	 * 
	 * @return antal filmer i arkivet
	 */
	int antall();
}
