package br.com.bancoomicron.contas;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, int matriculaCliente) {
		super(numero, matriculaCliente);
	}

	@Override
	public boolean sacar(double valor) {
		if(valor >= this.saldo)
			return true;
		return false;
	}
}
