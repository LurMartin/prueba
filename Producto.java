package ejercicio2.pojo;

public class Producto {

	private String nombre;
	private int cantidad;
	
	public Producto(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	


	public int getCantidad() {
		return cantidad;
	}



	@Override
	public String toString() {
		return " - " + nombre + ", unidades: " + cantidad;
	}
	
	
	
	
}
