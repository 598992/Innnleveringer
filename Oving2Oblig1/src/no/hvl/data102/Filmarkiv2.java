package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT{
	private int antall;
	private LinearNode<Film> start;
	
	public Filmarkiv2(LinearNode<Film> forste) {
		this.start = forste;
		antall = 0;
	}

	public Film visFilm(int nr) {
		LinearNode<Film> aktuell = start;
		try {
			for(int i = 0; i < antall; i++) {
				if(aktuell.getElement().getFilmnr() == nr) {
					return aktuell.getElement();
				}
				aktuell = aktuell.getNeste();
			}
		} catch (NullPointerException e) {
			System.out.println("Filmen er ikke i arkivet");
		}
		return null;
		
	}
	
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film> nyNode = new LinearNode<Film>(nyFilm);
		nyNode.setNeste(start);
		start = nyNode;
	}
	
	public boolean slettFilm(int filmnr) {
		LinearNode<Film> aktuell = start;
		
		for(int i = 0; i < antall; i ++) {
			if(aktuell.getElement().getFilmnr() == filmnr) {
				aktuell.setElement(start.getElement());
				start = start.getNeste();
				return true;
			}
			aktuell = aktuell.getNeste();
		}
		return false;
	}
	
	public Film[] soekTittel(String delstreng) {
		Film[] nyTab = new Film[antall];
		int funnet = 0;
		LinearNode<Film> aktuell = start;

		for(int i = 0; i < antall; i++) {
			if(aktuell.getElement().getTittel().contains(delstreng)) {
				nyTab[funnet] = aktuell.getElement();
				funnet++;
			}
			aktuell = aktuell.getNeste();
		}
		if(antall > funnet) {
			nyTab = trimTab(nyTab, funnet);
		}
		return nyTab;
	}
	
	
	public Film[] soekProdusent(String delstreng) {
		Film[] nyTab = new Film[antall];
		int funnet = 0;
		LinearNode<Film> aktuell = start;

		for(int i = 0; i < antall; i++) {
			if(aktuell.getElement().getProdusent().contains(delstreng)) {
				nyTab[funnet] = aktuell.getElement();
				funnet++;
			}
			aktuell = aktuell.getNeste();
		}
		if(antall > funnet) {
			nyTab = trimTab(nyTab, funnet);
		}
		return nyTab;
	}
	
	private Film[] trimTab(Film[] tab, int n) {
		Film[] nyTab = new Film[n];
		for(int i = 0; i < n; i++) {
			nyTab[i] = tab[i];
		}
		return nyTab;
	}
	
	public int antall(Sjanger sjanger) {
		int antall = 0;
		LinearNode<Film> aktuell = start;
		for(int i = 0; i < antall; i++) {
			if(aktuell.getElement().getSjanger() == sjanger) {
				antall++;
			}
			aktuell = aktuell.getNeste();
		}
		return antall;
	}
	
	public int antall() {
		return antall;
	}
}
