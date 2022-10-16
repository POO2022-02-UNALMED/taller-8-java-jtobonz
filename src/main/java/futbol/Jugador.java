package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

	public short getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
	@Override
	public int compareTo(Futbolista futbolista) {
		int x;
		x = this.getEdad() - futbolista.getEdad();
		return Math.abs(x);
	}
	 public String toString() {
		 return "El futbolista " +getNombre()+ " tiene " + getEdad() + ", y " 
		 		+ "juega de " + getPosicion() + " con el dorsal "
				 + getDorsal() + ". Ha marcado "+ getGolesMarcados();
	 }

}
