package POO.herencia.interfaces;

import POO.herencia.ClaseAbstracta;

//extiende de clase abstracta e implementa de una interface sus metodos
public class Implementacion extends ClaseAbstracta implements NuevaInterface{

// CONSTRUCTOR DE CLASE ABSTRACTA
	public Implementacion(String nombre) {
		super(nombre);
	}
	
//METODO DE INTERFACE
	@Override
	public String moverse() {
		return null;
	}
	
//METODO ABSTRACTO
	@Override
	public void saltar() {
	}

}
