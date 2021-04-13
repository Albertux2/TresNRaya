package utiles;

import modelo.Tipo;

public class RespuestaColocacion {
	private boolean respuesta;
	private String mensaje;
	private Tipo tipo;

	
	public RespuestaColocacion(boolean respuesta, String mensaje, Tipo tipo) {
		super();
		this.respuesta = respuesta;
		this.mensaje = mensaje;
		this.tipo = tipo;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	public RespuestaColocacion() {
		super();
	}

	
	public RespuestaColocacion(boolean respuesta, String mensaje) {
		super();
		this.respuesta = respuesta;
		this.mensaje = mensaje;
	}


	public boolean isRespuesta() {
		return respuesta;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setRespuesta(boolean respuesta) {
		this.respuesta = respuesta;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
}
