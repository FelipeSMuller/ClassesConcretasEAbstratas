package br.com.poo.pacote;

import javax.swing.JOptionPane;

public class PraticandoAbstract {

	public static void main(String[] args) {

		// Instanciando um novo objeto do tipo conta.
		Conta conta1 = new Conta();
		// Criação de uma variavel do tipo inteiro, que armazena a opção escolhida pelo
		// usuário
		int escolha = 0;

		// Inicio do loop
		do {

			try {

				// Entrada do usuário
				escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
						"SEJA BEM VINDO AO BANCO \n1-Cadastrar conta \n2-Efetuar deposito \n3-Efetuar saque \n4-Consultar dados"));

				switch (escolha) {

				case 1:

					// Define o nome do usuário através dos métodos públicos encapsulados

					conta1.setNome(JOptionPane.showInputDialog(null, "Insira o seu nome: "));

					// Acessando os atributos encapsulados, o método público atua como um mediador
					// entre o parametro e o valor inserido
					conta1.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu CPF: ")));

					// Acessa os atributos encapsulados através dos getters e setters
					conta1.setAgencia(
							Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a agência do seu banco: ")));

					conta1.setSaldo(Double.parseDouble(
							JOptionPane.showInputDialog(null, "Insira um valor para iniciar sua conta: ")));

					break;

				case 2:

					// Chama o método para efetuar um depósito

					conta1.efetuarDeposito(
							Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do depósito")));

					break;

				case 3:

					//Chama o méotod para efetuar um saque
					conta1.efetuarSaque(
							Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor que deseja sacar")));

					break;

				case 4:

					// Chama o método para consultar os dados
					conta1.consultarDados();

					break;
				}

				// Tratamento de exceções, verifica se o valor digitado é algo diferente de um
				// número, ou se o programa foi fechado incorretamente!!
			} catch (NumberFormatException | NullPointerException erro) {

				// Gera uma mensagem de erro no prompt com um ícone intuítivo , que facilita na
				// identificação do erro
				JOptionPane.showMessageDialog(null,
						"Dados não numéricos foram inseridos ou o programa foi fechado incorretamente", null,
						JOptionPane.WARNING_MESSAGE);

				break;
			}

			// Enquanto escolha for maior do que 0...
		} while (escolha > 0);

	}

}
