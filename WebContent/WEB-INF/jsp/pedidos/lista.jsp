<table>
    <thead>
        <tr>
            <th>Nome do Cliente</th>
            <th>Data</th>
            <th>Qtd. Itens</th>
            <th>Valor Total</th>
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