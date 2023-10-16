package br.com.poo.pacote;

import br.com.poo.metodos.*;

//Definindo a classe como abstrata, não  é possível instanciar o objeto do tipo ContaBancaria, o abstract permite formar um molde
public abstract class ContaBancaria {

	// Atributos do objeto banco
	protected Double saldo;

	protected String nome;

	protected int cpf;

	protected int agencia;

	// O Java cria automaticamente o construtor, portanto dessa vez não foi
	// utilizado o método construtor para inicializar o objeto

	public Double getSaldo() {
		return saldo;
	}

	// Getters e setters para acessar os atributos encapsulados
	public void setSaldo(Double saldo) {

		this.saldo = saldo;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		// Método de verificação de dados do tipo String.
		TratarDados.tratarString(nome);

		this.nome = nome;
	}

	public int getCpf() {

		return cpf;
	}

	public void setCpf(int cpf) {

		// Método para tratamento de dados para números inteiros
		TratarDados.tratarInteiros(cpf);

		this.cpf = cpf;
	}

	public int getAgencia() {

		return agencia;
	}

	public void setAgencia(int agencia) {
		// Método de verificação do tipo inteiro, verifica se o valor é negativo ou
		// igual a zero

		TratarDados.tratarInteiros(agencia);

		this.agencia = agencia;
	}

	// Métodos abstratos que serão utilizados em outras classes
	public abstract void efetuarSaque(Double valor);

	public abstract void efetuarDeposito(Double valor);

	public abstract void consultarDados();

}
