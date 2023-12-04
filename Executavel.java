package operadora;

import java.time.LocalDate;
import java.time.Period;

public class Executavel {

	public static void main(String[] args) {

		Endereco end1 = new Endereco("RUA DA TECNOLOGIA", 100, "BARREIROS", "S�O JOS�");
		Endereco end2 = new Endereco("RUA DO TELEFONE", 200, "ESTREITO", "FLORIAN�POLIS");
		Endereco end3 = new Endereco("RUA DA LONGA DIST�NCIA", 300, "CENTRO", "BIGUA�U");
		Endereco end4 = new Endereco("RUA DO ADSL", 400, "CAMPINAS", "S�O JOS�");
		Endereco end5 = new Endereco("RUA DA RADIO FREQU�NCIA", 500, "COQUEIROS", "FLORIAN�POLIS");
		Endereco end6 = new Endereco("RUA DA INTERNET", 600, "CENTRO", "PALHO�A");
		Endereco end7 = new Endereco("RUA DA LINHA DISCADA", 700, "INGLESES", "FLORIAN�POLIS");
		Endereco end8 = new Endereco("RUA DO ALTA VELOCIDADE", 800, "CAMPECHE", "FLORIAN�POLIS");
		Endereco end9 = new Endereco("RUA DO 5G", 900, "KOBRASOL", "S�O JOS�");
		Endereco end10 = new Endereco("RUA DO FLUXO DE BITS", 1000, "PEDRA BRANCA", "PALHO�A");
		
		Contato con1 = new Contato("90100-0100", "BRUNA@GMAIL.COM");
		Contato con2 = new Contato("90200-0200", "CARLA@GMAIL.COM");
		Contato con3 = new Contato("90300-0300", "MARCOS@GMAIL.COM");
		Contato con4 = new Contato("90400-0400", "JOANA@GMAIL.COM");
		Contato con5 = new Contato("90500-0500", "LUCIANO@GMAIL.COM");
		Contato con6 = new Contato("90600-0600", "JOSE@GMAIL.COM");
		Contato con7 = new Contato("90700-0700", "VERA@GMAIL.COM");
		Contato con8 = new Contato("90800-0800", "DANIEL@GMAIL.COM");
		Contato con9 = new Contato("90900-0900", "CINTHIA@GMAIL.COM");
		Contato con10 = new Contato("91000-1000", "TATIANE@GMAIL.COM");
		
		Cliente cliente1 = new Cliente("BRUNA", LocalDate.of(1995, 12, 10), 'F', end1, con1);
		Cliente cliente2 = new Cliente("CARLA", LocalDate.of(1990, 07, 10), 'F', end2, con2);
		Cliente cliente3 = new Cliente("MARCOS", LocalDate.of(1989, 05, 10), 'M', end3, con3);
		Cliente cliente4 = new Cliente("JOANA", LocalDate.of(1975, 10, 10), 'F', end4, con4);
		Cliente cliente5 = new Cliente("LUCIANO", LocalDate.of(2000, 11, 10), 'M', end5, con5);
		Cliente cliente6 = new Cliente("JOSE", LocalDate.of(2000, 04, 10), 'M', end6, con6);
		Cliente cliente7 = new Cliente("VERA", LocalDate.of(1996, 03, 10), 'F', end7, con7);
		Cliente cliente8 = new Cliente("DANIEL", LocalDate.of(1987, 01, 10), 'M', end8, con8);
		Cliente cliente9 = new Cliente("CINTHIA", LocalDate.of(1993, 06, 10), 'F', end9, con9);
		Cliente cliente10 = new Cliente("TATIANE", LocalDate.of(1988, 02, 10), 'F', end10, con10);
		
		
		Endereco end11 = new Endereco("RUA DO ATENDIMENTO", 1100, "INGLESES", "FLORIAN�POLIS");
		Endereco end12 = new Endereco("RUA DO SUPORTE", 1200, "CAMPECHE", "FLORIAN�POLIS");
		Endereco end13 = new Endereco("RUA DA EFICI�NCIA", 1300, "KOBRASOL", "S�O JOS�");
		Endereco end14 = new Endereco("RUA DO LINK", 1400, "PEDRA BRANCA", "PALHO�A");
		
		Contato con11 = new Contato("91100-1100", "CARLOS@GMAIL.COM");
		Contato con12 = new Contato("91200-1200", "MIGUEL@GMAIL.COM");
		Contato con13 = new Contato("91300-1300", "ANA@GMAIL.COM");
		Contato con14 = new Contato("91400-1400", "LILIAN@GMAIL.COM");
		
		Tecnico tec1 = new Tecnico("CARLOS", LocalDate.of(1980, 07, 10), 'M', end11, con11, 5000, LocalDate.of(2000, 05, 10));
		Tecnico tec2 = new Tecnico("MIGUEL", LocalDate.of(1985, 10, 10), 'M', end12, con12, 6000, LocalDate.of(1999, 04, 10));
		Tecnico tec3 = new Tecnico("ANA", LocalDate.of(1978, 06, 10), 'F', end13, con13, 4000, LocalDate.of(2005, 02, 10));
		Tecnico tec4 = new Tecnico("LILIAN", LocalDate.of(1983, 11, 10), 'F', end14, con14, 5500, LocalDate.of(2002, 03, 10));
		
		
		Problema problema1 = new Problema("SEM INTERNET", "MEDIA");
		Problema problema2 = new Problema("MODEM QUEIMADO", "FACIL");
		Problema problema3 = new Problema("INTERNET LENTA", "DIFICIL");
		Problema problema4 = new Problema("SEM WIFI", "MEDIA");
		
		
		Chamado chamado1 = new Chamado(cliente1, problema1, tec1, LocalDate.of(2022, 11, 10), LocalDate.of(2022, 11, 12));
		Chamado chamado2 = new Chamado(cliente2, problema2, tec1, LocalDate.of(2022, 11, 11), null);
		Chamado chamado3 = new Chamado(cliente3, problema2, tec1, LocalDate.of(2022, 11, 12), null);
		Chamado chamado4 = new Chamado(cliente4, problema1, tec2, LocalDate.of(2022, 11, 11), LocalDate.of(2022, 11, 12));
		Chamado chamado5 = new Chamado(cliente5, problema4, tec2, LocalDate.of(2022, 11, 12), null);
		Chamado chamado6 = new Chamado(cliente6, problema4, tec3, LocalDate.of(2022, 11, 10), LocalDate.of(2022, 11, 11));
		Chamado chamado7 = new Chamado(cliente7, problema3, tec3, LocalDate.of(2022, 11, 11), LocalDate.of(2022, 11, 12));
		Chamado chamado8 = new Chamado(cliente8, problema2, tec3, LocalDate.of(2022, 11, 12), null);
		Chamado chamado9 = new Chamado(cliente9, problema3, tec4, LocalDate.of(2022, 11, 10), LocalDate.of(2022, 11, 12));
		Chamado chamado10 = new Chamado(cliente10, problema3, tec4, LocalDate.of(2022, 11, 11), null);
		
		Chamado[] listaChamados = {chamado1, chamado2, chamado3, chamado4, chamado5, chamado6, chamado7, chamado8, chamado9, chamado10};
		
		
		Endereco end15 = new Endereco("RUA DAS OPERADORAS", 1500, "CENTRO", "FLORIAN�POLIS");
		Operadora operadora = new Operadora("SENAC TELECOM", "123.456.0001/56", end15, listaChamados);
		
		
		//2-A

		int total = operadora.identificarQuantidadeChamadosAbertos();
		System.out.println("Total de chamados abertos: " +  total);
		System.out.println("------------------------\n");
		
		//2-B
		operadora.identificarTecnicoMaisIdoso(listaChamados);
		System.out.println("------------------------\n");

		
		//2-C
		operadora.identificarClienteMaisNovo(listaChamados);
		System.out.println("------------------------\n");
		
		operadora.identificarClienteMaisIdoso(listaChamados);
		System.out.println("------------------------\n");
		
		//2-D
		Period diferenca = operadora.identificarDiferecaIdadeClienteMaisNovoMaisIdoso();
		System.out.println("A diferenca é de: ");
		System.out.println("Anos: " + diferenca.getYears() + " - Meses: " +  diferenca.getMonths() + " - Dias: " + diferenca.getDays());
		System.out.println("------------------------\n");
		
		//2-E
		operadora.calcularPercentualClientesHomensMulheres();
		System.out.println("------------------------\n");
		
		//2-F
		operadora.listarContatoClientePorNome("Joana");
		System.out.println("------------------------\n");
		
		//2-G
		operadora.listarEnderecoTecnicoPorNome("Ana");
		System.out.println("------------------------\n");
		
		//2-H
		operadora.listarClientesPorProblema("Joana");
		System.out.println("------------------------\n");
		
		//2-I
		operadora.contabilizarProblemasPorDificuldade("facil");
		System.out.println("------------------------\n");
		
		//2-J
		operadora.identificarTecnicoComMaiorTempoContratacao();
		System.out.println("------------------------\n");
		
	}

}
