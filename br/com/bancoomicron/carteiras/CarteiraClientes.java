package br.com.bancoomicron.carteiras;

import br.com.bancoomicron.pessoas.Cliente;
import java.util.ArrayList;

public class CarteiraClientes implements IAuditoria {
	
	private ArrayList<Cliente> clientes;

	public CarteiraClientes() {
		clientes = new ArrayList<Cliente>();
	}

	@Override
	public double somaSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int quantidadeDeContas() {
		return clientes.size();
	}

	public void adicionaCliente(Cliente c){
		clientes.add(c);
	}
	
	private int getIndicePorCPF()
	{
		
	}
	
	public boolean removerCliente(String CPF)
	{
		
	}
	
	public boolean removerCliente(String[] CPF)
	{
		
	}
	
	public Cliente buscaCPF(String CPF)
	{
		
	}
}
