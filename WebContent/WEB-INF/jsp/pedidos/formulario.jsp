<form action="<c:url value="/pedidos"/>" method="POST">
	<fieldset>
		<legend>Adicionar Pedido</legend>

		<label for="cliente">Cliente:</label> <input id="cliente" type="text"
			name="pedido.nomeCliente" value="${pedido.nome}" /> <label for="data">Data:</label>
		<input id="data" type="text" name="pedido.data" value="${pedido.data}" />


		<table>
			<thead>
				<tr>
					<th>Item</th>
					<th>Qtd</th>
					<th>Unitario</th>
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