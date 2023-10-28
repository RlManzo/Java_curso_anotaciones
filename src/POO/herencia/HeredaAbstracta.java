package POO.herencia;

public class HeredaAbstracta extends ClaseAbstracta {
	 private String apellido;
    //hereda de clase abstracta el atributo y lo usa en el constructor
	public HeredaAbstracta(String nombre, String apellido) {
		super(nombre);
		this.apellido = apellido;
	}
	
	//hereda el metodo abstracto saltar
	@Override
	public void saltar() {
	     System.out.println("yo salto");
		
	}
	
	//UNA CLASE PUEDE HEREDAR DE SOLO UNA CLASE ABSTRACTA. SI SE QUIERE HEREDAR DE VARIAS, SE DEBE USAR INTERFACES
	
}
