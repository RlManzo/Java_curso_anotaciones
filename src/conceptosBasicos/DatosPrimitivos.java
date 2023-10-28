package conceptosBasicos;

public class DatosPrimitivos {

	public static void main(String[] args) {
		/*comentario multilinea
		 * variables*/
		/*datos primitivos ->
		*int, double, char, boolean ->
		*int: enteros, double: reales(decimales),char: un solo caracter y con comillas simples 'J'
		*variables y constantes
		**/
		
		
		//sintaxis: tipo de dato + nombre
		int miPrimeraVariable;
		
		//inicializamos la variable:
		
		miPrimeraVariable = 7;
		
		//creamos las variables:
		double variableReal;
		char variableChar;
		boolean variableBooleana;
		
		//incializacion de variables->
		
		variableReal = 12.5;
		variableChar = 'x';
		variableBooleana = true;
		
		//asignacion de variables (las variables obtienen un nuevo valor)->
		
		variableReal = 14.5;
		
		System.out.println(variableReal);
		System.out.println(variableChar);
		
		// Constantes: se declaran con "final" al principio +tipo de dato y nombre.
		
		final int numeroNuevo = 25;
		
		System.out.println(numeroNuevo);
		

	}

}
