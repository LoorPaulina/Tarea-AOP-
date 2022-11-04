package singleton;

import java.util.Scanner;

public class Sistema {
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[]) {
		int opcion=3;
		while(opcion!=0) {
			System.out.println("----------------Menú-----------\n ");
			System.out.println("1. Ingresar Nueva Configuracion: \n ");
			System.out.println("2. Elegir Configuracion existente: \n ");
			System.out.println("0. Salir \n ");
			opcion=sc.nextInt();
			sc.nextLine();
			
			switch(opcion) {
			case 1: 
				System.out.println("Ingrese nombre para la nueva configuracion: \n ");
				String device= sc.nextLine();
				Configuracion configuracion=Configuracion.getInstancia(device);
				System.out.println("Configuracion predeterminada:"+ configuracion.getNombre());
			case 2:
				System.out.println("Operacion efectuada con exito");
			}
		
		
		
}}}

