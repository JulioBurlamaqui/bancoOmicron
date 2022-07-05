package br.com.bancoomicron.pessoas;

import br.com.bancoomicron.carteiras.*;

public class Auditor extends Pessoa {

	public Auditor(String CPF, String nome) {
		super(CPF, nome);
	}

	public boolean auditar(IAuditoria auditado)
	{
		double media = auditado.somaSaldo()/auditado.quantidadeDeContas();
		if(media >= 1000)
			return true;
		return false;
	}
}
