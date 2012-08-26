package br.com.caelum.vraptor.blank;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class EncontrarPedido {
	public static void main(String[] args) {
		Session session = getSession();
		Pedido pedido = (Pedido) session.load(Pedido.class, 1L);
		//Transaction tx = session.beginTransaction();
		System.out.println(pedido);
	}

	private static Session getSession() {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
}