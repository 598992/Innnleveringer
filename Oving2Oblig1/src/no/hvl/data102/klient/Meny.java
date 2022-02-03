package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Meny {
	private Tekstgrensesnitt tekstgr;  
	 private FilmarkivADT filmarkiv;  
	  
	 public Meny(FilmarkivADT filmarkiv){ 
	  tekstgr = new Tekstgrensesnitt();  
	  this.filmarkiv = filmarkiv; 
	 } 
	  
	 public void start(){ 
		 Film film1 = new Film(1, "JonHelge", "Inception", 2024, Sjanger.Thriller, "Nofo" );
		 Film film2 = new Film(2, "Hans David", "Book man", 2021, Sjanger.Skrekk, "Noroff");
		 Film film3 = new Film(3, "JonHelge", "Alien", 1986, Sjanger.Skrekk, "Nofo");
		 Film film4 = new Film(4, "OJ", "Aliens", 1991, Sjanger.Skrekk, "Nofo");
		 filmarkiv.leggTilFilm(film1);
		 filmarkiv.leggTilFilm(film2);
		 filmarkiv.leggTilFilm(film3);
		 filmarkiv.leggTilFilm(film4);
		 
		 
		 //tekstgr.skrivUtFilmDelstrengITittel(filmarkiv, "Alien");
		 //tekstgr.skrivUtFilmProdusent(filmarkiv, "JonHelge");
		 tekstgr.skrivUtStatistikk(filmarkiv);
	 } 
}
