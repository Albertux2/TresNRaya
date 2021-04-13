package utiles;

public class RespuestaTNR {
	private boolean tresNRaya;
	private String mensaje;
	
	public RespuestaTNR(boolean tresNRaya, String mensaje) {
		super();
		this.tresNRaya = tresNRaya;
		this.mensaje = mensaje;
	}

	public boolean isTresNRaya() {
		return tresNRaya;
	}

	public void setTresNRaya(boolean tresNRaya) {
		this.tresNRaya = tresNRaya;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
