package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private int edad;
	private String posicion;
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + getNombre()+ " tiene "+ getEdad() + ", y juega de "+ getPosicion();
	}
	
	public boolean equals(Futbolista futbolista) {
		if (compareTo(futbolista) == 0) {
			return true;
		} else {
			return false;
		}
	}
		
	public abstract boolean jugarConLasManos();

	@Override
	public int compareTo(Futbolista futbolista) {
		int x = 1;
		if (futbolista == this) {
		x = 0;
		}
		return x;
	}
}
	
		
	
	
	

