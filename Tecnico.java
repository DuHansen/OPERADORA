package operadora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tecnico extends Pessoa{
	
	private double salario;
	private LocalDate dataContratacao;
	
	public Tecnico(String nome, LocalDate dataNascimento, char sexo, Endereco endereco, Contato contato, double salario,
			LocalDate dataContratacao) {
		super(nome, dataNascimento, sexo, endereco, contato);
		this.salario = salario;
		this.dataContratacao = dataContratacao;
	}

	public Tecnico() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public void identificarTecnicoMaisIdoso(){
		LocalDate data = null;

		if(data == null){
			data = getDataNascimento();
		}
		if(data == getDataNascimento()){
			data = getDataNascimento();
		}

	};


	@Override
	public String toString() {
		return super.toString()
				+ "\nSal�rio R$: " + this.getSalario() 
				+ "\nData de Contrata��o: " + this.getDataContratacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	

}
}
