<form action="<c:url value="/pedidos"/>" method="POST">
	<fieldset>
		<legend>Novo Pedido</legend>
		
		<div class="field">
			<div class="label"><label for="cliente">Cliente:</label></div>
			<div class="input">
				<input id="cliente" type="text" name="pedido.nomeCliente" value="${pedido.nome}" />
			</div> 
		</div>
		
		<div class="field">
			<div class="label"><label for="data">Data:</label></div>
		  	<div class="input"><input id="data" type="text" name="pedido.data" value="${pedido.data}" /></div>
		</div>


		<table id="itens">
			<thead>
				<tr>
					<th>Item</th>
					<th>Quantidade</th>
					<th>Preco Unitario</th>
				</tr>

			</thead>
			<tbody>

				<tr>
					<td><input id="descricao" type="text" name="item[0].descricao" /></td>
					<td><input id="quantidade" type="text" name="item[0].quantidade" /></td>
					<td><input id="preco" type="text" name="item[0].preco" /></td>
				</tr>
				
				<tr>
					<td><input id="descricao" type="text" name="item[1].descricao" /></td>
					<td><input id="quantidade" type="text" name="item[1].quantidade" /></td>
					<td><input id="preco" type="text" name="item[1].preco" /></td>
				</tr>

				<tr>
					<td><input id="descricao" type="text" name="item[2].descricao" /></td>
					<td><input id="quantidade" type="text" name="item[2].quantidade" /></td>
					<td><input id="preco" type="text" name="item[2].preco" /></td>
				</tr>
			</tbody>
		</table>
		<button type="submit">Enviar</button>
	</fieldset>
</form>