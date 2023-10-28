package POO.herencia;

public class Polimorfismo {

	public static void main(String[] args) {
		      //puedo crear vectores del tipo de clase especifico y guardar objetos de ese tipo
		 
		Persona humano[] =  new Persona[3];
		
		humano[0] = new Empleado(null, null, 0, 0);
		humano[1] = new RecursosHumanos(null, null, 0, null);
		
		
		//puedo crear un objeto padre e hijo y asignarlo teniendo en cuenta la herencia, si lo hago al reves, es decir al hijo asignarle el padre me tira error
		Persona perso = new Persona(null, null, 0);
		Empleado emple = new Empleado(null, null, 0, 0);
		
		perso = emple;
	//	emple = perso;

	}

}
