package br.com.bancoomicron.pessoas;

import br.com.bancoomicron.carteiras.*;
import br.com.bancoomicron.contas.*;

public class Cliente extends Pessoa {
	
	private CarteiraContas contas;
	private int matricula;
	public static int geradorMatricula = 0;
	
	public static int geraMatricula(){
		return ++Cliente.geradorMatricula;
	}

	public Cliente(String CPF, String nome) {
		super(CPF, nome);
	}
	
	public Cliente(String CPF, String nome, Conta conta)
	{
		super(CPF, nome);
		this.contas.adicionarConta(conta);
	}
	
	public double somaSaldos(){
		return contas.somaSaldo();
	}

	public int numContas() {
		return contas.quantidadeDeContas();
	}

	public int getMatricula() {
		return matricula;
	}
	
	public void adicionarConta(Conta c){
		contas.adicionarConta(c);
	}
	
	public boolean removerConta(int numero_conta)
	{
		
		return false;
	}
}
