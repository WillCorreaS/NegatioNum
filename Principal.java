package view;

//import controller.ContNegativos;

public class Principal {
	
	public static void main(String [] args) {

		int[] v = {5,3,5,-6,4,12,-22,-13,16};
		int contador =  ContNegativos(v);

		System.out.println(contador);
	}

	private static int ContNegativos(int[] v) {
		int contador = 0;
		
		for (int x : v) {
			if (x < 0) {
				contador++;
			}
		}
		return contador;
	}
}

