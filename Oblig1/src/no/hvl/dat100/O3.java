package no.hvl.dat100;

public class O3 {

	public static void main(String[] args) {
		int fac = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Fakultet av:"));
		int tall = 1;
		
		for (int i = 1; i < fac + 1; i++) {
			tall = tall * i;
		}
		
		if(fac >  33) {
			javax.swing.JOptionPane.showMessageDialog(null, "Tallet blir for stort, ta noe under 34");
		} else {
			javax.swing.JOptionPane.showMessageDialog(null, fac + " fakultet = " + tall);
		}
	}

}
