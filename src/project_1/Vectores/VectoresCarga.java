package project_1.Vectores;

import java.util.Scanner;

public class VectoresCarga {
	public static void main(String[] args) {
		
		//para la carga automatica del usuario importo la clase "Scanner" que trae java. Nos sirve como metodo para ingresar datos.
		int vector2[] = new int[4];
		
		Scanner cargaVector = new Scanner(System.in);
		for (int i = 0; i< vector2.length; i++) {
			System.out.println("ingrese un numero");
			vector2[i] = cargaVector.nextInt();
		}
		
		for ( int i = 0; i<vector2.length;  i++ ) {
			System.out.println("tu numero ingresado en la posicion " + i +" fue:");
    	    System.out.println(vector2[i]);
      }
		
	}
              
}
