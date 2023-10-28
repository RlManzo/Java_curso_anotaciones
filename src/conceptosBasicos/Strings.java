package conceptosBasicos;

public class Strings {

	public static void main(String[] args) {
		
		//en Java un String es una clase.
		
	    String comentario = "bienvenidos";
		
		String mensaje = new String("Hola mundo");  //de esta forma creo una instancia del objeto string
		
		final String mensaje2 =  "bienvenidos a java";
		

		
		System.out.println(comentario);
		System.out.println(mensaje);
		System.out.println(mensaje2);
		
		
		
		
		/*************** Medodos de String ****************
		***************************************************
		***************************************************/
		
		
		//.length() longitud de caracteres
		int cantidad = mensaje.length();
		
		System.out.println(cantidad);
		
		
		
		//.contains("") adentro le ponemos la palabra o frase a buscar, devuelve un booleano
		
		boolean contiene = mensaje.contains("mundo");
		
		System.out.print(contiene);
		
		
		
		//metodo concat, devuelve nuevo string con la frase concatenada
		
		String nuevoMensaje = mensaje.concat(" como estas?");
		
		System.out.println(nuevoMensaje);
		
		//metodo toUpperCase() pone todo en mayusculas
		
		System.out.println(mensaje.toUpperCase());
		
		
		//tiLowerCase, todo a minusculas
		
		System.out.println(mensaje.toLowerCase());
		
		//los metodos se pueden concatenar .toLowerCase().concat()
		
	}

}
