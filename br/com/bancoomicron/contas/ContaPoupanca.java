package br.com.bancoomicron.contas;

public class ContaPoupanca extends ContaCorrente {

	public ContaPoupanca(int numero, int matriculaCliente) {
		super(numero, matriculaCliente);
	}

	public void render(double juros){
		this.saldo *= juros;
	}
}
