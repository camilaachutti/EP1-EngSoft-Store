package br.com.caelum.vraptor.blank;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.PedidoDao;

@Resource
public class PedidosController {

	private final PedidoDao dao;
	private final Result result;
	
    public PedidosController(PedidoDao dao, Result result) {
        this.dao = dao;
        this.result = result;
    }
    
    @Get("/")
    public List<Pedido> lista() {
    	return dao.listaTudo();
    }
    
    @Post("/pedidos")
    public void adiciona(Pedido pedido, List<Item> item) {
    	for ( Item i : item )
    		i.setPedido(pedido);
    	pedido.setItens(item);
    	dao.salva(pedido);
    	result.redirectTo(this).lista();

    }

    @Get("/pedidos/novo")
    public void formulario() {
    }
    
    @Get("/pedidos/{id}")
    public Pedido mostra(Long id){
    	return dao.carrega(id);
    }

}
