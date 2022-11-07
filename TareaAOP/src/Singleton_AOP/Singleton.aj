package Singleton_AOP;

import java.util.Scanner;

import singleton.Configuracion;

public aspect Singleton {
	
	Configuracion conf;
	private static Scanner sc=new Scanner(System.in);
	
	pointcut addConfiguration() : execution(* getInstancia(..));

	
	before() : addConfiguration() {
		if(conf == null) {
			System.out.println("Ingrese nombre para la nueva configuracion: \n ");
			String device= sc.nextLine();
			System.out.println(device);
		}else {
			System.out.println("Operacion efectuada con exito");
		}
	
	}
	
	
	
	
	
}
