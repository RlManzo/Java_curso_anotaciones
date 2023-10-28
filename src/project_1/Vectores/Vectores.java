package project_1.Vectores;

public class Vectores {

	public static void main(String[] args) {
		      //********ARRAY UNIDIMENSIONAL: VECTOR*********
		      //declaracion  de espacio en memoria 
		      int vector [] = new int [5];
		      
		      int vector2 [] = {25, 10, 30  };    //declaro un vector de 3 posiciones y asigno valores.
		      System.out.println(vector2[1]);
		      //asignacion de valores
		      vector[0] = 20;
		      vector[1] = 8;
		      vector[2] = 3;
		      vector[3] = 3;
		      vector[4] = 25;
		      
		      //For para recorrer el array
		      
		      for ( int i = 0; i<vector.length;  i++ ) {
		    	    System.out.println(vector[i]);
		      }
		     
		      // programa para mostrar cuantas veces se reite el 3 en el vector 1
		      int cont = 0;
		      for(int i = 0; i<5; i ++) {
		    	        if(vector[i]  == 3) {
		    	        	 cont = cont + 1;
		    	        } 
		    	  }
             System.out.println("el numero 3 se repite: " + cont + " veces");
	}

}
