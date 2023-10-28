package POO.herencia;

public abstract class ClaseAbstracta {
         //las clases abstractas no pueden ser instanciadas directamente, si o si son heredables
	     //puede tener atributos que hereden sus hijos
	      private String nombre;
	      
	      public ClaseAbstracta(String nombre) {
	    	    this.nombre = nombre;
	      }
	
	     //tiene metodos que pueden ser publicos o protected para poder ser utilizados y el sentido es que no te dicen especificamente que hacer
	    
	     public abstract void saltar();
	     
	      //puede tener metodos que no son abstractos, pero al menos uno de ellos debe serlo
	     public  void correr() {
	    	 System.out.println("Yo corro por las mañanas");
	     }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		};

}
