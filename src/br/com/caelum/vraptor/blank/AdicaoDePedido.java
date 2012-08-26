package br.com.caelum.vraptor.blank;
import org.hibernate.Session;

import br.com.caelum.vraptor.dao.PedidoDao;
import br.com.caelum.vraptor.infra.CriadorDeSession;

public class AdicaoDePedido {
	
	public static void main(String[] args) {
		
		Pedido pedido = criaPedido();
	 
		new PedidoDao().salva(pedido);
	}

	private static Pedido criaPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeCliente("Jo‹o Lindo");
		pedido.setData("12/12/2012");
		return pedido;
	}
}	

