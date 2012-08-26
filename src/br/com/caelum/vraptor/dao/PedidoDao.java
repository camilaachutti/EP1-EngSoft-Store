package br.com.caelum.vraptor.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.blank.Pedido;
import br.com.caelum.vraptor.infra.CriadorDeSession;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class PedidoDao {

	private final Session session;
	public PedidoDao(){
		this.session = CriadorDeSession.getSession();
	}
	
	public void salva(Pedido pedido) {
		Transaction tx = session.beginTransaction();
		session.save(pedido);
		tx.commit();
	}
	
	public List<Pedido> listaTudo() {
		return this.session.createCriteria(Pedido.class).list();
	}

	public Pedido carrega(Long id){
		return (Pedido) this.session.load(Pedido.class, id);
		
	
	}
}
