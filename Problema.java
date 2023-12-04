package operadora;

public class Problema {
	
	private String defeito;
	private String dificuldade;
	
	public Problema(String defeito, String dificuldade) {
		super();
		this.defeito = defeito;
		this.dificuldade = dificuldade;
	}

	public Problema() {
		super();
	}

	public String getDefeito() {
		return defeito;
	}

	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}

	public String getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}
	
}
