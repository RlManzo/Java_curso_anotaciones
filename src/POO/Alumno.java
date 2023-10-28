package POO;

public class Alumno {
        //atributos de clase
	       String nombre;
	       String apellido;
	       int documento;
	       int edad;
	       String carrera;
	     
	       //constructor vacio a partir de la clase
	       public Alumno() {
		   }
	       
	       //constructor con atributos asignados
	       public Alumno(String nombre, String apellido, int documento, int edad, String carrera) {
		         	this.nombre = nombre;
		            this.apellido = apellido;
		        	this.documento = documento;
			        this.edad = edad;
		            this.carrera = carrera;
	    	}

        //metodos getters y setters
	    //permiten ver y modificar los valores   del objeto
	       
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public int getDocumento() {
			return documento;
		}

		public void setDocumento(int documento) {
			this.documento = documento;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getCarrera() {
			return carrera;
		}

		public void setCarrera(String carrera) {
			this.carrera = carrera;
		}

		//metodos de la clase propios
	       public void estudiar() {
	    	     System.out.println( "Estoy estudiando");
	        }
	       
	       

		public void aprobarMateria(double calificacion) {
	    	              if(calificacion >= 6) {
	    	            	  System.out.println("aprobe");
	    	              }
	    	              else {
	    	            	  System.out.println("desaprobe");
	    	              }
	                }

}
