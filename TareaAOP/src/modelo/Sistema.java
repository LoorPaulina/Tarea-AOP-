package modelo;
import java.util.Scanner;

public class Sistema {

	private static Email email;
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println("Eliga una opción: \n"
				+ "1: Enviar mensaje txt"+
				"Enviar mensaje multimedia");
		int opcion=Integer.valueOf(sc.nextInt());
		switch(opcion) {
		case 1:
			email= new ProveedorEmail();
			//envia archivo de texto
			email.send();
		case 2:
			email= new ProveedorEmail2Adapter();
			//envia archivo multimedia
			email.send();
		}
		
		
	}
}
