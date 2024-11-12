package bootcampDio.gerenciamento_pedidos.domain.service.contracts;

import bootcampDio.gerenciamento_pedidos.domain.model.Pedido;
import bootcampDio.gerenciamento_pedidos.domain.model.Produto;

import java.util.List;
import java.util.Set;

public interface PedidoService {
    Pedido novoPedido(Pedido pedido);

    //void atualizarPedido(Long id);

    void deletarPedido(Long id);

    double valorTotal(Long id);

    Pedido buscarPedidoId(Long id);

    List<Pedido> findPedidosByClienteCpf(String cpf);

    Set<Produto> listarProdutos(Long id);
}
