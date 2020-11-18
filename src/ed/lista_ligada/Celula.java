package ed.lista_ligada;

public class Celula {
	
	private Object elemento;
	private Celula proximoElemento;
	
	public Celula(Object elemento, Celula proximoElemento) {
		this.elemento = elemento;
		this.proximoElemento = proximoElemento;
	}

	public Object getElemento() {
		return elemento;
	}


	public Celula getProximoElemento() {
		return proximoElemento;
	}

	public void setProximoElemento(Celula proximoElemento) {
		this.proximoElemento = proximoElemento;
	}

	@Override
	public String toString() {
		return "Celula [elemento=" + elemento + ", proximoElemento=" + proximoElemento + "]";
	}
	
	
	
	
	
}
