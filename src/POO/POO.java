package POO;

public class POO {

	public static void main(String[] args) {
		         //creo una instancia de la clase dentro de mi archivo pirncipal que tiene el metodo main (de acceso)
		
		         //a que clase se refiere,  nombre para el objeto = nuevo alumno del constructor y entre parentesis todos los parametros que pide el constructor
                 Alumno alu1 = new Alumno("ricardo", "manzo",36934112,  30, "programacion");
                 
                 //con el metodo setter puedo reasignar el valor al atributo
                 alu1.setEdad(31 );
                 alu1.setCarrera("artes");
                 
                 //con los metodos getters los puedo acceder
                 System.out.println("el alumno "+ alu1.getNombre() + " tiene " + alu1.getEdad() + " y estudia " + alu1.getCarrera());
	}

}
