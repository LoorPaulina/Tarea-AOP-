package modelo;

//clase del proveedor de email 1
public class ProveedorEmail extends Email{
	
	@Override
	public void send() {
		System.out.println("Enviando un email del Proveedor 1");// metodo de la clase Email
	}
}

