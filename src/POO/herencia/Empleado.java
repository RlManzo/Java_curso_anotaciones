package POO.herencia;

public class Empleado extends Persona {
	             //los atributos  van a ser privados siempre para que no puedan ser modificados desde otra clase
	             private int Legajo;
               
	            //en super llama a los atributos de la clase padre  
	              
				public Empleado(String nombre, String apellido, int edad, int legajo) {
				           	super(nombre, apellido, edad);
				          	this.Legajo = legajo;
				}
               
				//metodo de Empleado
				
				public void Saludar(String nombre) {
				   	this.nombre = nombre;
					  System.out.println("hola mi nombre es: " + nombre);
				}
				
				public int getLegajo() {
					return Legajo;
				}

				public void setLegajo(int legajo) {
					Legajo = legajo;
				}
               
				
				
				
	              
                  

				
}
