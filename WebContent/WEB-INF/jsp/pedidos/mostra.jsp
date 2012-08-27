<table id="infoBasica">
    <tbody>
    	<tr>
            <th>Nome do Cliente</th>
            <td>${pedido.nomeCliente}</td>
        </tr>
		<tr>
			<th>Data</th>
			<td>${pedido.data}</td>
		</tr>
		<tr>
			<th>Valor Total</th>
			<td>${pedido.calculaValorTotal()}</td>
		</tr>
	</tbody>
</table>

<table id="itensDoPedido">
    <thead>
        <tr>
            <th>Item</th>
            <th>Qtd</th>
            <th>Preco Unitario</th>
            <th>Total</th>
        </tr>
    </thead>
    <tbody>
        	<c:forEach items="${pedido.itens}" var="item">
            	<tr>
                	<td>${item.descricao}</td>
                	<td>${item.quantidade}</td>
                	<td>${item.preco}</td>
                	<td>${item.total()}</td>
            	</tr>
        </c:forEach>
    </tbody>
</table>