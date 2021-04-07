package ejercicio2.pojo;

public class Producto {

	private String nombre;
	private int cantidad;
	
	public Producto(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	/* Esta es una modificación que hago yo: LUUUUUUUUUUUUURRRRRRRRRRRRRRRRRR */

	public String getNombre() {
		return nombre;
	}

	


	public int getCantidad() {
		return cantidad;
	}

/*modificiacion......!!!!!!!!*/

	@Override
	public String toString() {
		return " - " + nombre + ", unidades: " + cantidad;
	}
	
	
	
	
}
