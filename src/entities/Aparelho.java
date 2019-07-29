package entities;

public class Aparelho <T> {
	private T objeto;

	public Aparelho(T objeto) {
		this.objeto = objeto;
	}

	public T getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}
	
	
	
	

}
