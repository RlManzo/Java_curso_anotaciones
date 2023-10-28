package POO.herencia;

public class RecursosHumanos extends Persona {
    String legajoUnico;
	public RecursosHumanos(String nombre, String apellido, int edad, String legajoUnico) {
		super(nombre, apellido, edad);
		this.legajoUnico = legajoUnico;
	}
	public String getLegajoUnico() {
		return legajoUnico;
	}
	public void setLegajoUnico(String legajoUnico) {
		this.legajoUnico = legajoUnico;
	}
                   
}
