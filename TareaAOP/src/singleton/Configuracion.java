package singleton;

public class Configuracion {
	private String nombre;
	private static Configuracion instance;
	
	private Configuracion(String nombre) {
		this.nombre=nombre;
	}	
	
	public static Configuracion getInstancia(String nombre) {
		if(instance==null) {
			instance=new Configuracion(nombre);
			System.out.println("Configuracion guardada con éxito");
		}else {
			System.out.println("Ya existe una configuracion predeterminada");
		}
		return instance;
	}
	
	public String getNombre() {
		return nombre;
	}
}
	

