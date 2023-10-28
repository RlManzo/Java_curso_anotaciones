package POO.herencia.interfaces;

public class YoHeredo implements NuevaInterface, Interface2 {
//        Hereda de dos interfaces sus metodos
	@Override
	public String moverse() {
		return null;
	}
    
	@Override
	public void mirar() {
	       System.out.println("nos miramos");
		
	}

}
