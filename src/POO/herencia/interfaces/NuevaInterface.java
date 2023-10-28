package POO.herencia.interfaces;

public interface NuevaInterface {
             //los metodos son abstractos por defecto
	         public String moverse();
	        
	         //puede tener mas metodos con retorno de tipo void y deben ser static
	         public static void gritar() {
	        	   System.out.println("puedo gritar");	        
	        	   }
}
