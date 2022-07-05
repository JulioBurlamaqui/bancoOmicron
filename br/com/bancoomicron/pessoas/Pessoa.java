package br.com.bancoomicron.pessoas;

public abstract class Pessoa {
	protected String CPF;
	protected String nome;
	
	
	public Pessoa(String CPF, String nome)
	{
		this.CPF = CPF;
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public String getNome() {
		return nome;
	}
}
