package br.com.bancoomicron.contas;

public class ContaEspecial extends ContaCorrente {

	private double chequeEspecial;
	private final static double taxa_iof = 0.03;
	
	public ContaEspecial(int numero, int matriculaCliente) {
		super(numero, matriculaCliente);
	}
	
	@Override
	public boolean sacar(double valor) {
        if (super.saldo >= valor)
        {
            super.saldo -= valor;
            return true;
        }
        
        if (super.saldo + chequeEspecial <= valor)
        {
            super.saldo -= valor + (chequeEspecial + chequeEspecial*taxa_iof);
            return true;
        }
        return false;
    }

}
