package br.com.caelum.vraptor.blank;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Resource;

@Resource
public class Mundo {

	public String boasVindas(){
		return "O joão é lindo! Só um pouquinho!";
	}
	
	public List<String> paises() {	
		List<String> result = new ArrayList<String>();
		result.add("Brasil");
		result.add("Portugal");
		result.add("Japão");
		result.add("Canadá");
		result.add("Paraguai");
		return result;
	}
	
	public Pedido lista(){
		Pedido pedido = new Pedido();
		pedido.setData("11111");
		pedido.setNomeCliente("João!");
		return pedido;
	}
		
}
