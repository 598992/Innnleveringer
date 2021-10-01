package no.hvl.dat100;

public class O1A {

	public static void main(String[] args) {
		int[] tabell = {5,2,3,4,8,28,19,56,47,19,57};
		int[] sortertTabell = {5,19,23,29,36,47};
		
		skrivUt(tabell);
		//System.out.println(tilStreng(tabell));
		System.out.println("sumFor: " + summerFor(tabell));
		System.out.println("sumForU: " + summerForU(tabell));
		System.out.println("sumWhile: " + summerWhile(tabell));
		
		System.out.println(finnesTall(tabell, 19));
		
		System.out.println(posisjonTall(tabell, 28));

		skrivUt(reverser(tabell));
		System.out.println("erSortert - usortert " + erSortert(tabell));
		System.out.println("erSortert - sortert "+ erSortert(sortertTabell));
		
		
		skrivUt(tabell);
		System.out.println("satt sammen med");
		skrivUt(sortertTabell);
		System.out.println(" blir");
		skrivUt(settSammen(tabell, sortertTabell));
	}

	
	public static void skrivUt(int[] tabell) {
		System.out.print("[");
		for(int v: tabell) {
			System.out.print(v + ", ");
		}
		System.out.println("]");
	}
	
	public static String tilStreng(int[] tabell) {
		String ut = "[";
		
		for(int v: tabell) {
			ut += tabell[v- 1] + ", ";
		}
		ut += "]";
		
		return ut;
	}
	public static int summerFor(int[] tabell) {
		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		
		return sum;
	}
	
	public static int summerForU(int[] tabell) {
		int sum = 0;
		for(int i: tabell) {
			sum += i;
		}
		
		return sum;
	}
	
	//Fortsatt usikker på hva de vil jeg skal gjøre her, tror ikke jeg vil gå gjennom en hel tabell med en while-løkke, og den blir bare seende ut som en tungvinn for-løkke
	public static int summerWhile(int[] tabell) {
		int sum = 0;
		int i = 0;
		while(i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		
		return sum;
	}
	
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
		for(int i: tabell) {
			if(tall == i) {
				funnet = true;
			}
		}
		return funnet;
	}
	
	public static int posisjonTall(int[] tabell, int tall) {
		boolean funnet = false;
		int i = 0;
		int index = -1;
		while(i < tabell.length && funnet == false) {
			if(tabell[i] == tall) {
				funnet = true;
				index = i;
			}
			i++;
		}
		
		return index;
	}
	
	public static int[] reverser(int[] tabell) {
		int[] nyTab = new int[tabell.length];
		for(int i = 0; i < tabell.length; i++) {
			nyTab[i] = tabell[tabell.length-(i+1)];
		}
		
		return nyTab;
	}
	
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		for(int i = 1; i < tabell.length; i++) {
			if(tabell[i-1] > tabell[i]) {
				sortert = false;
			}
		}
		return sortert;
	}
	
	public static int[] settSammen(int[] tabell, int[] tabell2) {
		int[] sammenSatt = new int[tabell.length + tabell2.length];
		for(int i = 0; i < tabell.length; i++) {
			sammenSatt[i] = tabell[i];
		}
		for(int i = tabell.length; i < tabell.length + tabell2.length; i++) {
			sammenSatt[i] = tabell2[i-tabell.length];
		}
		
		return sammenSatt;
	}
}
