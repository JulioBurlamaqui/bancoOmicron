package br.com.bancoomicron.carteiras;

import br.com.bancoomicron.contas.Conta;
import java.util.ArrayList;

public class CarteiraContas implements IAuditoria {

	private ArrayList<Conta> contas;

	public CarteiraContas() {
		contas = new ArrayList<Conta>();
	}

	public int tamanho(){
		return contas.size();
	}
	
	@Override
	public double somaSaldo()
	{
		
	}

	@Override
	public int quantidadeDeContas() {
		return contas.size();
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public boolean removerConta()
	{
		
	}

}
