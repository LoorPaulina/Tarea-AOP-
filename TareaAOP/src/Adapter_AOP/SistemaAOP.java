package Adapter_AOP;

public class SistemaAOP {

	private static Email email;
	
	public static void main(String args[]) {
		
		System.out.println("El programa enviara dos mensajes de distintos proveedores\n"
				+"1: Enviar mensaje txt \n"+
				"2: Enviar mensaje multimedia \n");

		email= new ProveedorEmail();
		//envia archivo de texto
		email.send();
		
		
	}
}
