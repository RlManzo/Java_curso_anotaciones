package conceptosBasicos;

public class Metodos {
	         
	//       Creo el metodo. Puedo llamar a otro metodo dentro de mi metodo (funcion que retorne una funcion)
	
	          public void suma( int numero1, int numero2 ) {
	        	             System.out.println( numero1 * numero2);
	          }
	            
	          //ejecuto mi funcion creando una instancia de mi clase y llamando a ese metodo
	          
	           public static void main(String[] args) {
	        	                           Metodos miClase = new Metodos();
	        	                           miClase.suma(10, 2);   
                }
	
}
