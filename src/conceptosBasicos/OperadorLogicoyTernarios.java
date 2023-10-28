package conceptosBasicos;

public class OperadorLogicoyTernarios {

	public static void main(String[] args) {
		/*operadores relacionales: devuelven un boolean
		 * 
		 * >  mayor que
		 * <  menor que
		 * >= mayor o igual 
		 * <= menor o igual
		 * 
		 * ==  igual
		 * !=  diferente
		 */
		
		/*Operadores logicos: devuelven un boolean
		 * and or not
		 * 
		 * and: &&
		 * or: ||
		 * not: !  este lo antepongo
		 * 
		 */
		
		/*Operador ternario: ?
		 * 
		 * Es como decir si esto es true entonces has esto sino esto otro.
		 * 
		 * variable ? codigo1 : codigo2
		 * 
		 * si 'variable' es true entonces aplica 'codigo1', si es falsa aplica 'codigo2'.
		 * 
		 */
		
		String mensaje = 10 < 9 ? "es mayor" : "es menor";
		
		System.out.println(mensaje);
		
		

	}

}
