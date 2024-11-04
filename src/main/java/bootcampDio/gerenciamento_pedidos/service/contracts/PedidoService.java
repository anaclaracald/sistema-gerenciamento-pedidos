package bootcampDio.gerenciamento_pedidos.service.contracts;

import bootcampDio.gerenciamento_pedidos.model.Pedido;
import bootcampDio.gerenciamento_pedidos.model.Produto;

public interface PedidoService {
    void novoPedido();

    void atualizarPedido(Long id);

    void deletarPedido(Long id);

    double valorTotal(Long id);

    Pedido buscarPedidoId(Long id);

    Pedido buscarPedidoCliente(Long cpf);

    Produto listarProdutos(Long id);
}
