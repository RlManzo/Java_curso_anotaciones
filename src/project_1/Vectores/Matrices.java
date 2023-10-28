package project_1.Vectores;

public class Matrices {

	public static void main(String[] args) {
		//las matrices son array bidimensionales 
		//se crea una especie de tabla de filas y columnas
		//el primer seria la columna vertical y el segundo la fila horizontal
		    int matriz1 [] [] = new int [2] [2];
		    
		
		    matriz1[0][0]= 5;
		    matriz1[0][1]= 8;
		    matriz1[1][0]= 12;
		    matriz1[1][1]= 1;
		
       
           
           
           //recorrer matriz con un ciclo for
           
           for(int f = 0; f<2;  f ++) {
        	      for(int c = 0;  c<2;  c++) {
        	    	      System.out.println("el valor de la fila f es: " + f +  " en la columna c:  " +  c);
        	    	      System.out.println("es de: " +  matriz1[f][c]);
        	    	      }
           }
           
           
           
	}

}
