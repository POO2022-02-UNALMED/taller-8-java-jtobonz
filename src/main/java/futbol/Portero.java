package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	
	public int compareTo(Portero futbolista) {
		int x;
		x = this.getGolesRecibidos() - futbolista.getGolesRecibidos();
		return Math.abs(x);
	}
	
	public String toString() {
		 return "El futbolista " +getNombre()+ " tiene " + getEdad() + ", y " 
		 		+ "juega de " + getPosicion() + " con el dorsal "
				 + getDorsal() + ". Le han marcado "+ getGolesRecibidos();
	 }
}
