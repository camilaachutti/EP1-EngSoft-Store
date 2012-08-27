package br.com.caelum.vraptor.blank;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Pedido {
	@Id @GeneratedValue
	private Long id;
	private String nomeCliente;
	private String data;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Item> itens;
	//private Integer quantidadeDeItens;
	
	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public Long getId() {
		return id;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String toString() {
		return "Pedido "+ id + " ("+ nomeCliente + ", " + data + ")"; 
	}
	
	public double calculaValorTotal() {
		double valorTotal = 0.0; 
		
		for(Item item : itens){
			valorTotal += (item.getPreco() * item.getQuantidade());
		}
		return valorTotal;
	}

	public Integer quantidadeDeItens() {
		return itens.size();
	}
	
}
