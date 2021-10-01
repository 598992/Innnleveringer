package no.hvl.dat100;

public class O1B {

	//ble veldig mange matriser brukt til diverse testing, men lot dem ligge
	public static void main(String[] args) {
		//Første 4 brukt til oppg. a-d
		int[][] matrise1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] matrise2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] matrise3 = {
				{1,2,3},
				{4,5,6},
				{7,8,9, 4}
		};
		int[][] matrise4 = {
				{2,4,6},
				{3,6,9},
				{4,8,12}
		};
		
		// Brukt til e)
		int[][] matrise8 = {
				{0,0,1,1,1,1,0,0},
				{0,1,0,0,0,0,1,0},
				{0,1,0,0,0,0,1,0},
				{0,0,1,1,1,1,0,0},
				{0,1,0,0,0,0,1,0},
				{0,1,0,0,0,0,1,0},
				{0,1,0,0,0,0,1,0},
				{0,0,1,1,1,1,0,0}
		};
		
		
		//resten brukt til testing av f)
		int[][] matriseM1 = {
				{2,1,4},
				{0,1,1}
				
		};
		int[][] matriseM2 = {
				{6,3,-1,0},
				{1,1,0,4},
				{-2,5,0,2}
				
		};
		int[][] matriseM3 = {
				{8,7,9,2,3,1,2},
				{-2,3,-4,1,9,0,5},
				{4,3,8,-2,-1,-4,1},
				{0,9,7,2,3,4,6}
				
		};
		int[][] matriseM4 = {
				{1,2},
				{3,4},
				{5,6},
				{7,8},
				{9,-3},
				{2,1}
				
		};
		
		
		int[][] matriseM5 = {
				{1,7,3,8,3,3,6,1,4,7,2},
				{6,2,7,1,6,2,4,6,8,3,1},
				{3,7,9,4,2,6,2,1,6,8,2},
				{4,7,2,6,8,3,1,3,6,3,1},
				{6,9,3,1,4,7,3,2,5,7,8},
				{3,8,3,1,7,9,4,3,2,7,9},
				{6,2,4,7,3,1,3,7,8,3,1}
		};
		
		//a)
		skrivUtv1(matrise1);
		//b)
		System.out.println(tilString(matrise1));
		//c)
		System.out.println(tilString(skaler(3, matrise1)));
		//d)
		System.out.println(erLik(matrise1, matrise2));
		
		//e)
		System.out.println(tilString(matrise8));
		System.out.println(tilString(speil(matrise8)));
		
		System.out.println(multipliser(matriseM3, matriseM5));
		
	}
	//a)
	public static void skrivUtv1(int[][] matrise) {
		for(int i = 0; i < matrise.length; i++) {
			System.out.print("[");
			for(int v: matrise[i]) {
				System.out.print(v + ", ");
			}
			System.out.println("]");
		}
	}
	//b)
	public static String tilString(int[][] matrise) {
		String utTekst = "";
		
		for(int i = 0; i < matrise.length; i++) {
			for(int v: matrise[i]) {
				utTekst += v + " ";
			}
			utTekst += "\n";
		}
		return utTekst;
	}
	//c)
	public static int[][] skaler(int tall, int[][] matrise){
		int[][] nyMatrise = new int[matrise.length][];
		
		for(int i = 0; i < matrise.length; i++) {
			int[] tempRad = new int[matrise[i].length];
			for(int j = 0; j < matrise[i].length; j++) {
				tempRad[j] = matrise[i][j] * tall;
			}
			nyMatrise[i] = tempRad;
		}
		return nyMatrise;
	}
	
	
	//d) Sjekker først om lengdene på matrisene er like før den gidder å lete gjennom alle tallene, kanskje ikke den fineste måten å gjøre det på
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		boolean erLike = true;
		int i = 0;
		
		if(mat1.length == mat2.length) {
		while(erLike && i < mat1.length) {
			
			if(mat1[i].length == mat2[i].length) {
			for(int j = 0; j < mat1[i].length; j++) {
				if(mat1[i][j] != mat2[i][j]) {
					erLike = false;
				}
			}
			}else {
				erLike = false;
			}
			i++;
		}
		} else {
			erLike = false;
		}
		return erLike;
	}
	//e)
	public static int[][] speil(int[][] matrise){
		int[][] nyMatrise = new int[matrise.length][matrise.length];
		
		for(int r = 0; r < matrise.length; r++) {
			int[]tempRad = new int[matrise.length];
			for(int k = 0; k < matrise.length; k++) {
				tempRad[k] = matrise[k][r];
			}
			nyMatrise[r] =tempRad;
		}
		return nyMatrise;
	}
	//f)
	public static int[][] multipliser(int[][] mat1, int[][] mat2){
	
	int[][] nyMatrise = new int[mat1.length][mat2[0].length];
	
	for(int i = 0; i < mat1.length; i++) {
		
		for(int j = 0; j < mat2[0].length; j++) {
			int tall= 0;
			for(int k = 0; k < mat1[0].length; k++) {
				tall += mat1[i][k] * mat2[k][j];	
			}
			nyMatrise[i][j] = tall;
			
			tall = 0;
		}
	}
	System.out.println(tilString(nyMatrise));
	return nyMatrise;
	}
	}
