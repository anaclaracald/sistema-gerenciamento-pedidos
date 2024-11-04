package bootcampDio.gerenciamento_pedidos.service;

import bootcampDio.gerenciamento_pedidos.model.Pedido;
import bootcampDio.gerenciamento_pedidos.model.Produto;
import bootcampDio.gerenciamento_pedidos.repository.ClienteRepository;
import bootcampDio.gerenciamento_pedidos.repository.PedidoRepository;
import bootcampDio.gerenciamento_pedidos.repository.ProdutoRepository;
import bootcampDio.gerenciamento_pedidos.service.contracts.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImp implements PedidoService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ProdutoRepository produtoRepository;


    @Override
    public void novoPedido() {

    }

    @Override
    public void atualizarPedido(Long id) {

    }

    @Override
    public void deletarPedido(Long id) {

    }

    @Override
    public double valorTotal(Long id) {
        return 0;
    }

    @Override
    public Pedido buscarPedidoId(Long id) {
        return null;
    }

    @Override
    public Pedido buscarPedidoCliente(Long cpf) {
        return null;
    }

    @Override
    public Produto listarProdutos(Long id) {
        return null;
    }
}
