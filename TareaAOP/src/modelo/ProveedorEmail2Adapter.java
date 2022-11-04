package modelo;

public class ProveedorEmail2Adapter extends Email {
	
	private ProveedorEmail2 proveedorEmail2=new ProveedorEmail2();
	
	@Override
	public void send() {
		this.proveedorEmail2.sendEmailMultimedia();
	}
}
