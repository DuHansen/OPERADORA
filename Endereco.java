package operadora;

public class Endereco {
	
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	
	public Endereco(String rua, int numero, String bairro, String cidade) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Endereco() {
		super();
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + this.rua + ", numero=" + this.numero + ", bairro=" + this.bairro + ", cidade=" + this.cidade + "]";
	}
	
}
