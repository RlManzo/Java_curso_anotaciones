package POO.herencia;

public class Herencia {

	public static void main(String[] args) {
		   Empleado trabajador1 = new Empleado("Ricardo", "Manzo", 30, 00001);
		   
		   trabajador1.setApellido("Mejia");
		//  new Empleado("Julieta","silva", 33,00002);
		  
		 
		   //puedo crear un vector apartir de una clase  y guardar datos, seria un nuevo tipo de dato, en este caso creoun vector de tipo Empleado que admite solo ese tipo de datos
		   
		   Empleado trabaj [] = new Empleado[ 2] ;  //le asigno la cantidad de posiciones(indices)
		   trabaj[0] = new Empleado("juan","perez",25,00002);
		   
		   trabajador1.Saludar(trabajador1.nombre);
		   
		   System.out.println(trabaj[0]);
		   
		   

	}

}
