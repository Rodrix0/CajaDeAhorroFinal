package Caja;
import java.util.Scanner;

public class Persona {
	private String nombre;
	private String documento;
	public Persona(String nombre,String documento) {
		this.nombre=nombre;
		this.documento=documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento=documento;
	}
	 public static Persona crearDesdeEntrada() {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Ingrese el nombre: ");
				String nombre = scanner.nextLine();

				System.out.print("Ingrese el documento de identidad: ");
				String documentoIdentidad = scanner.nextLine();

				return new Persona(nombre, documentoIdentidad);
			}
	    }
	
}