package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Tekstgrensesnitt {
	// lese opplysningene om en FILM fra tastatur  
	 public static Film lesFilm(){ 
	  // TODO 
		int filmnr = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Filmnr: "));
		String produsent = javax.swing.JOptionPane.showInputDialog("Produsent: ");
		String tittel = javax.swing.JOptionPane.showInputDialog("Tittel: ");
		int ar = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Utgivelsesår: "));
		Sjanger sjanger = Sjanger.valueOf(javax.swing.JOptionPane.showInputDialog("Sjanger: "));
		String selskap = javax.swing.JOptionPane.showInputDialog("Selskap: ");

	  return new Film(filmnr, produsent, tittel, ar, sjanger, selskap); 
	 } 
	 
	 // vise en film med alle opplysninger på skjerm (husk tekst for sjanger) 
	 public void visFilm(Film film) { 
		 javax.swing.JOptionPane.showMessageDialog(null, film.toString());
		 //TODO
	 } 
	 
	 // Skrive ut alle Filmer med en spesiell delstreng i tittelen 
	 public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) { 
	  // TODO 
		 Film[] nyTab = filma.soekTittel(delstreng);
		 for(int i = 0; i < nyTab.length; i++) {
			 System.out.println(nyTab[i].toString());
		 }
	 } 
	 
	 // Skriver ut alle Filmer av en produsent / en gruppe 
	 public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) { 
	  // TODO
		 Film[] nyTab = filma.soekProdusent(delstreng);
		 for(int i = 0; i < nyTab.length; i++) {
			 if(nyTab[i].getProdusent() == delstreng) {
				 System.out.println(nyTab[i].toString());
			 }
		 }
	 } 
	 
	 // Skrive ut en enkel statistikk som inneholder antall Filmer totalt 
	 // og hvor mange det er i hver sjanger 
	 public void skrivUtStatistikk(FilmarkivADT filma) { 
		 String ut = "Statistikk for filmene i arkivet: \n";
		 Sjanger[] sjangTab = Sjanger.values();
		 for(int i = 0; i < sjangTab.length; i++) {
			 ut += "Antall " + sjangTab[i].toString() + ": " + filma.antall(sjangTab[i]) + "\n";
		 }
		 ut += "Totalt antall filmer: " + filma.antall();
		 System.out.println(ut);
	 } 
	 // ... Ev. andre metoder 
}
