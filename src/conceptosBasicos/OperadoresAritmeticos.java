package conceptosBasicos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		//suma: +, resta: -, multiplicacion: *,division:/ y resto: %
        int operandoUno = 10;
        int operandoDos = 5;
        int resultado = 0;
        
        //suma
        resultado = operandoUno + operandoDos;
        
        System.out.println(resultado);        
        
        //resta
        resultado = operandoUno - operandoDos;
        
        System.out.println(resultado);  
        
        //incremento:
        
        operandoUno++;
        
        //incremento "x" cantidad de veces con +=
        
        operandoUno += 10;
        System.out.println(operandoUno);
        
        
        //convertir un tipo de dato a otro:
        
        int result = 0;
        int numberOne = 10;
        float numberTwo = 5.4f;
      
        result = numberOne + (int)numberTwo;  //poniendo entre parentesis el tipo de dato puedo convertirlo. Esto se llama Casting
	}

}
