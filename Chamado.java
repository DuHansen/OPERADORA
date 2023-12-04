package operadora;

import java.time.LocalDate;

public class Chamado {
	
	private Cliente cliente;
	private Problema problema;
	private Tecnico tecnico;
	private LocalDate dataAbertura;
	private LocalDate dataFechamento;
	
	public Chamado(Cliente cliente, Problema problema, Tecnico tecnico, LocalDate dataAbertura,
			LocalDate dataFechamento) {
		super();
		this.cliente = cliente;
		this.problema = problema;
		this.tecnico = tecnico;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
	}

	public Chamado() {
		super();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Problema getProblema() {
		return problema;
	}

	public void setProblema(Problema problema) {
		this.problema = problema;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	
	public void qtdeChamadosAbertos(){
		
		}
	}
	

	

