package operadora;

import java.time.LocalDate;

public class Cliente extends Pessoa{

	public Cliente(String nome, LocalDate dataNascimento, char sexo, Endereco endereco, Contato contato) {
		super(nome, dataNascimento, sexo, endereco, contato);
	}
	
	public Cliente() {
		super();
	}
	
}
