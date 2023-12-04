package operadora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	private char sexo;
	private Endereco endereco;
	private Contato contato;
	
	public Pessoa(String nome, LocalDate dataNascimento, char sexo, Endereco endereco, Contato contato) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.endereco = endereco;
		this.contato = contato;
	}

	public Pessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + this.nome + ", dataNascimento=" + this.dataNascimento + ", sexo=" + this.sexo + ", endereco="
				+ this.endereco + ", contato=" + this.contato + "]";
	}

	
}
