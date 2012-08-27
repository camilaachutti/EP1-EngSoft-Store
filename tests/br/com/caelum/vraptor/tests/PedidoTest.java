package br.com.caelum.vraptor.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.vraptor.blank.Item;
import br.com.caelum.vraptor.blank.Pedido;

public class PedidoTest {
	Pedido pedido;
	
	@Before
	public void preparaTestes() {
		pedido = new Pedido();
		
	}
	@Test
	public void valorTotalSemItem() {
		pedido.setItens(new ArrayList<Item>());
		assertEquals(0.0, pedido.calculaValorTotal(), 0);
	}
	
	@Test
	public void valorTotalComItemEQuantidade1() {
		List<Item> listaItens = new ArrayList<Item>();
		Item itemQtd1 = new Item(1, 10.0);
		listaItens.add(itemQtd1);
		pedido.setItens(listaItens);
		assertEquals(10.0, pedido.calculaValorTotal(), 0);
	}


	@Test
	public void valorTotalComUmItemEQuantidadeMaiorQue1() {
		List<Item> listaItens = new ArrayList<Item>();
		Item itemQtdMaior1 = new Item(5, 10.0);
		listaItens.add(itemQtdMaior1);
		pedido.setItens(listaItens);
		assertEquals(50.0, pedido.calculaValorTotal(), 0);
	}

	@Test
	public void valorTotalComDoisItensEQuantidade1() {
		List<Item> listaItens = new ArrayList<Item>();
		Item primeiroItemQtd1 = new Item(1, 10.0);
		listaItens.add(primeiroItemQtd1);
		
		Item segundoItemQtd1 = new Item(1, 20.0);
		listaItens.add(segundoItemQtd1);

		pedido.setItens(listaItens);
		assertEquals(30.0, pedido.calculaValorTotal(), 0);
	}


	@Test
	public void valorTotalComDoisItensEQuantidadeMaiorQue1() {
		List<Item> listaItens = new ArrayList<Item>();
		Item primeiroItemQtdMaior1 = new Item(5, 10.0);
		listaItens.add(primeiroItemQtdMaior1);
		
		Item segundoItemQtdMaior1 = new Item(2,10.0);
		listaItens.add(segundoItemQtdMaior1);

		pedido.setItens(listaItens);
		assertEquals(70.0, pedido.calculaValorTotal(), 0);
	}

}
