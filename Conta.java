package br.com.poo.pacote;

import javax.swing.JOptionPane;

import br.com.poo.metodos.*;

//A classe conta herda de ContaBancaria
public class Conta extends ContaBancaria {

	@Override
	public void efetuarSaque(Double valor) {

		Double novoSaldo = this.saldo - valor;

		// Se o valor inserido for maior do que o saldo gera um erro, afinal isso não é
		// possível
		if (valor > this.saldo) {

			// Imprime no prompt uma mensagem com um ícone que facilita a visualização do
			// usuário
			JOptionPane.showMessageDialog(null,
					"O valor que você digitou é maior do que o valor disponível em sua conta, ERRO!!", null,
					JOptionPane.ERROR_MESSAGE);

		}

		else {

			// Imprime no prompt os valores que demonstram as operações antes e depois
			JOptionPane.showMessageDialog(null,
					"SAQUE EFETUADO COM SUCESSO" + "\nValor disponível na conta antes da transação: "
					// O método formatarDecimais recebe um valor decimal como parametro e formata
					// esse valor em uma String
							+ TratarDados.formatarDecimais(saldo) + "\nValor disponível na conta após a operação:  "
							+ TratarDados.formatarDecimais(novoSaldo));

		}

	}

	@Override
	public void efetuarDeposito(Double valor) {

		valor += this.saldo;

		// Imprime no prompt os valores que demonstram as operações antes e depois
		JOptionPane.showMessageDialog(null, "DEPOSITO EFETUADO COM SUCESSO" + "\nValor após a transação: "
		// O método formatarDecimais recebe um valor decimal como parametro e formata
		// esse valor em uma String
				+ TratarDados.formatarDecimais(valor) + "\nValor antes da operação:  "

				+ TratarDados.formatarDecimais(saldo));

	}

	@Override
	public void consultarDados() {

		// Imprime no prompt todos os dados do cliente , inclusive os valores formatados
		// pelo método formatarDecimais
		JOptionPane.showMessageDialog(null, "Nome:  " + nome + "\nSaldo:  " + TratarDados.formatarDecimais(saldo)
				+ "\nCPF:  " + cpf + "\nAgência:  " + agencia);

	}

}
