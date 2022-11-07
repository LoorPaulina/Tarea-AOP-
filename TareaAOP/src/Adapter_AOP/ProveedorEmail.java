package Adapter_AOP;

//clase del proveedor de email 1
public class ProveedorEmail implements Email{
	
	public void send() {
		System.out.println("Enviando un email del Proveedor 1");// metodo de la clase Email
	}
}
