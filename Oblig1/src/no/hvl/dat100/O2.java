package no.hvl.dat100;

public class O2 {
	public static void main(String[] args) {
		int poeng = -1;
		char karakter = 0;
		
		
		for(int i = 0; i < 10; i++) {
			while(poeng > 100 || poeng < 0) {
			poeng = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Poengsum"));
			if (poeng > 100 || poeng < 0) {
				javax.swing.JOptionPane.showMessageDialog(null, "Vennligst prøv en gyldig poengsum (mellom 0 og 100)");
			}
			}
		if(poeng <= 100 && poeng >= 90) {
			karakter = 'A';
		} else if (poeng < 90 && poeng > 79) {
			karakter = 'B';
		} else if (poeng < 80 && poeng > 59) {
			karakter = 'C';
		} else if (poeng < 60 && poeng > 49) {
			karakter = 'D';
		} else if(poeng < 50 && poeng > 39) {
			karakter = 'E';
		} else if (poeng < 40 && poeng > -1) {
			karakter = 'F';
		} 
	
		javax.swing.JOptionPane.showMessageDialog(null, "Karakteren ble " + karakter + " til elev nr. " + (i+1));
		
		poeng = -1;
	}
	}
}
