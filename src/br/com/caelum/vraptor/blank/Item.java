package br.com.caelum.vraptor.blank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Item {
	@Id @GeneratedValue
	private Long id;
	private String descricao;
	private Integer quantidade;
	private double preco;
	@ManyToOne
	private Pedido pedido;
	
	public Item(){
		
	}
	public Item(Integer quantidade, double preco){
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double total (){
		double total;
		total = quantidade * preco;
		return total;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
}
