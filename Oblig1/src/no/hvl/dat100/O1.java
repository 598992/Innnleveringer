package no.hvl.dat100;


public class O1 {

	public static void main(String[] args) {
		int inntekt = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Inntekt"));
		double trinnskatt = 0;
		
		if(inntekt <= 164100) {
			trinnskatt = 0;
		} else if(inntekt > 164100 && inntekt <= 230950) {
			trinnskatt = inntekt * 0.0093;
		} else if(inntekt > 230950 && inntekt <= 580650) {
			trinnskatt = inntekt * 0.0241;
		} else if (inntekt > 580650 && inntekt <= 934050) {
			trinnskatt = inntekt * 0.1152;
		} else if (inntekt > 934050) {
			trinnskatt = inntekt * 0.1452;
		}

		String utTekst = 
				"Med inntekten " + inntekt + "\n" + 
				"Er trinnskannen på " + twoDigits(trinnskatt);
	javax.swing.JOptionPane.showMessageDialog(null, utTekst);
	}
/**
 * Fra forelesning 06.09
 * Runder av en double til 2 desimaler
 * @param x
 * @return
 */
	private static String twoDigits (double x) {
		String str = String.format("%.2f", x);
		return str;
	}
	
}
