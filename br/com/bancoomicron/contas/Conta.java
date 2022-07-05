package br.com.bancoomicron.contas;

public abstract class Conta {

	protected double saldo;
	protected int numero;
	protected int matriculaCliente;
	
	public Conta (int numero, int matriculaCliente)
	{
		this.matriculaCliente = matriculaCliente;
		this.numero = numero;
		this.saldo = 0;
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public abstract boolean sacar(double valor);
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero(){
		return numero;
	}
	
}
