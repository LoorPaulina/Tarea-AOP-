package Singleton_AOP;

import java.util.Scanner;

public class SistemaAOP {

	public static void main(String args[]) {
		
		System.out.println("----------------Menú-----------\n ");
		System.out.println("1. Ingresar Nueva Configuracion: \n ");
		System.out.println("2. Elegir Configuracion existente: \n ");
		System.out.println("0. Salir \n ");

		
		Configuracion.getInstancia("nombre1");
    }
}
