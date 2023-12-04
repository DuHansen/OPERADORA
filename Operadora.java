package operadora;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class Operadora {

	private String nome;
	private String cnpj;
	private Endereco enderecoOperadora;
	private Chamado[] chamados;
	
	public Operadora(String nome, String cnpj, Endereco enderecoOperadora, Chamado[] chamados) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.enderecoOperadora = enderecoOperadora;
		this.chamados = chamados;
	
	}

	public Operadora() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEnderecoOperadora() {
		return enderecoOperadora;
	}

	public void setEnderecoOperadora(Endereco enderecoOperadora) {
		this.enderecoOperadora = enderecoOperadora;
	}

	public Chamado[] getChamados() {
		return chamados;
	}

	public void setChamados(Chamado[] chamados) {
		this.chamados = chamados;
	}

	public int identificarQuantidadeChamadosAbertos() {
		LocalDate data = null;
		int total = 0;
		
		for (int i = 0; i < this.getChamados().length; i++) {
			if (this.getChamados()[i].getDataFechamento() != data) {
				total++;
			}
		}
		return total;
	}

	public void identificarTecnicoMaisIdoso(Chamado[] listaChamados) {

        Tecnico tecnicoMaisIdoso = listaChamados[0].getTecnico();

        for (Chamado chamado : listaChamados) { //verifica os chamados dentro da lista de chamaddos
            Tecnico tecnicoAtual = chamado.getTecnico();
            if (tecnicoAtual != null && tecnicoAtual.getDataNascimento() != null) {
                if (tecnicoMaisIdoso == null || tecnicoAtual.getDataNascimento().isBefore(tecnicoMaisIdoso.getDataNascimento())) {
                    tecnicoMaisIdoso = tecnicoAtual;
                }
            }
        }

        if (tecnicoMaisIdoso != null) {
            System.out.println("O técnico mais idoso é: " + tecnicoMaisIdoso.getNome());
        } else {
            System.out.println("Não foi possível identificar o técnico mais idoso.");
        }
    }

static Cliente clienteMaisNovo= null;
static Cliente clienteMaisIdoso = null;	

public void identificarClienteMaisNovo(Chamado[] listaChamados) {
	
    for (Chamado chamado : listaChamados) {
      
        Cliente clienteAtual = chamado.getCliente();

        if (clienteAtual != null && clienteAtual.getDataNascimento() != null) {
           
            if (clienteMaisNovo == null || clienteAtual.getDataNascimento().isAfter(clienteMaisNovo.getDataNascimento())) {
                clienteMaisNovo = clienteAtual; 
            }
		}
    }
	  if (clienteMaisNovo != null) {
            System.out.println("O cliente mais novo é: " + clienteMaisNovo.getNome());
        } else {
            System.out.println("Não foi possível identificar o cliente mais novo.");
    }
}

public void identificarClienteMaisIdoso(Chamado[] listaChamados) {
    // Itera sobre os chamados na lista
    for (Chamado chamado : listaChamados) {
        // Obtém o cliente associado ao chamado
        Cliente clienteAtual = chamado.getCliente();

        // Verifica se o cliente é válido e possui data de nascimento
        if (clienteAtual != null && clienteAtual.getDataNascimento() != null) {
            // Verifica se ainda não há cliente mais novo ou se o cliente atual é mais novo
            if (clienteMaisIdoso == null || clienteAtual.getDataNascimento().isBefore(clienteMaisIdoso.getDataNascimento())) {
                clienteMaisIdoso = clienteAtual; // Atualiza o cliente mais novo
            }
		}
    }
	if (clienteMaisIdoso != null) {
            System.out.println("O cliente mais idoso é: " + clienteMaisIdoso.getNome());
        } else {
            System.out.println("Não foi possível identificar o cliente mais idoso.");
    }
}
	

public Period identificarDiferecaIdadeClienteMaisNovoMaisIdoso() {
	// Verifica se ambos os clientes foram encontrados e têm datas de nascimento
	Period diferenca = null;

	
	if (clienteMaisNovo != null && clienteMaisIdoso != null &&
			clienteMaisNovo.getDataNascimento() != null && clienteMaisIdoso.getDataNascimento() != null) {

		diferenca = Period.between(clienteMaisIdoso.getDataNascimento(), clienteMaisNovo.getDataNascimento());
	}

		return diferenca;
	
}

	public void contabilizarProblemasPorDificuldade(String dificuldade) {
		
		int totalProblemas = 0;

		for (Chamado chamado : this.chamados) {
            if (chamado != null && chamado.getProblema() != null) {
				String dificuldadeChamado = chamado.getProblema().getDificuldade();

                if (dificuldadeChamado.equalsIgnoreCase(dificuldade)) {
                    totalProblemas++;
                }
			}
		}
		System.out.println("Total de problemas com dificuldade " + dificuldade + ": " + totalProblemas);
	}

	public void calcularPercentualClientesHomensMulheres() {
		int totalClientes = 0;
		int homens = 0;
		int mulheres = 0;
	
		for (int i = 0; i < this.getChamados().length; i++) {
			Chamado chamado = this.getChamados()[i];
	
			if (chamado != null && chamado.getCliente() != null) {
				char sexo = chamado.getCliente().getSexo();
	
				if (sexo == 'M') {
					homens++;
				} else if (sexo == 'F') {
					mulheres++;
				}
	
				totalClientes++;
			}
		}
	
		if (totalClientes > 0) {
			double percentualHomens = (homens / (double) totalClientes) * 100.0;
			double percentualMulheres = (mulheres / (double) totalClientes) * 100.0;
	
			System.out.println("Percentual de homens: " + percentualHomens + "%");
			System.out.println("Percentual de mulheres: " + percentualMulheres + "%");
		} else {
			System.out.println("Não foi possível identificar.");
		}
	}


	public void listarContatoClientePorNome(String substring) {
		// Itera sobre todos os chamados na lista da operadora
		for (Chamado chamado : this.getChamados()) {
			// Verifica se o chamado e o cliente associado não são nulos
			if (chamado != null && chamado.getCliente() != null) {
				// Obtém o nome do cliente
				String nomeCliente = chamado.getCliente().getNome();
				
				// Verifica se o nome do cliente contém a substring fornecida
				// Ignora maiúsculas e minúsculas para tornar a comparação insensível a caso
				if (nomeCliente.toLowerCase().contains(substring.toLowerCase())) {
				
					System.out.println("Cliente: " + nomeCliente);
					System.out.println("Contato: " + chamado.getCliente().getContato());
				
				}
			}
		}
	}
	public void listarEnderecoTecnicoPorNome(String nome) {
    Set<String> enderecosExibidos = new HashSet<>();

    for (Chamado chamado : this.getChamados()) {
        if (chamado != null && chamado.getTecnico() != null) {
            String nomeTecnico = chamado.getTecnico().getNome();

            if (nomeTecnico.toLowerCase().contains(nome.toLowerCase())) {
                String endereco = chamado.getTecnico().getEndereco().toString();

                // Verifica se o endereço já foi exibido
                if (!enderecosExibidos.contains(endereco)) {
                    System.out.println("Técnico: " + nomeTecnico);
                    System.out.println("Endereço: " + endereco);

                    // Adiciona o endereço à lista de endereços exibidos
                    enderecosExibidos.add(endereco);
                }
            }
        }
    }
}

  

public void identificarTecnicoComMaiorTempoContratacao() {
	// Inicializa as variáveis para armazenar o técnico com maior tempo de contratação
	Tecnico tecnicoComMaiorTempoContratacao = null;
	LocalDate dataAtual = LocalDate.now();

	// Itera sobre os chamados na lista
	for (int i = 0; i < this.chamados.length; i++) {
		Chamado chamado = this.chamados[i];

		if (chamado != null && chamado.getTecnico() != null){
			Tecnico tecnicoAtual = chamado.getTecnico();
			LocalDate dataContratacao = tecnicoAtual.getDataContratacao();

			// Verifica se o técnico possui data de contratação
			if (dataContratacao != null) {
				// Calcula o período entre a data de contratação e a data atual
				Period periodoContratacao = Period.between(dataContratacao, dataAtual);

				// Verifica se ainda não há técnico com maior tempo de contratação
				// ou se o técnico atual tem mais tempo de contratação
				if (tecnicoComMaiorTempoContratacao == null ||
						periodoContratacao.toTotalMonths() > Period.between(tecnicoComMaiorTempoContratacao.getDataContratacao(), dataAtual).toTotalMonths()) {
					tecnicoComMaiorTempoContratacao = tecnicoAtual;
				}
			}
		}
	}

	// Verifica se foi encontrado algum técnico com data de contratação
	if (tecnicoComMaiorTempoContratacao != null) {
		System.out.println("Técnico com maior tempo de contratação: " + tecnicoComMaiorTempoContratacao.getNome());
		System.out.println("Data de contratação: " + tecnicoComMaiorTempoContratacao.getDataContratacao());
	} else {
		System.out.println("Nenhum técnico encontrado com data de contratação.");
	}
}

public void listarClientesPorProblema(String substring) {
    for (int i = 0; i < this.chamados.length; i++) {
        Chamado chamado = this.chamados[i];

        if (chamado != null && chamado.getProblema() != null) {
            String nomeCliente = chamado.getCliente().getNome().toLowerCase();

            if (nomeCliente.contains(substring.toLowerCase())) {
                System.out.println("Cliente: " + chamado.getCliente().getNome());
                System.out.println("Contato: " + chamado.getCliente().getContato());
            }
        }
    }
}
	
}

