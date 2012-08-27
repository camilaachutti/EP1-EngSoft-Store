<table id="listaDePedidos">
    <thead>
        <tr>
            <th id="nomeDoCliente">Nome do Cliente</th>
            <th id="data">Data</th>
            <th id="quantidade">Qtd. Itens</th>
            <th id="valorTotal">Valor Total</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${pedidoList}" var="pedido">
            <tr>
                <td><a href="<c:url value="/pedidos/${pedido.id}"/>">${pedido.nomeCliente}</a></td>
                <td>${pedido.data}</td>
                <td>${pedido.quantidadeDeItens()}</td>
                <td>${pedido.calculaValorTotal()}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>