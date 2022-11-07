package Adapter_AOP;

public aspect Adapter {
	
	private ProveedorEmail2 email = new ProveedorEmail2();
	
	pointcut adapterEmail():execution (void send(..));
	after():adapterEmail(){
		email.sendEmailMultimedia();
	}
}