package bootcampDio.gerenciamento_pedidos.service;

import bootcampDio.gerenciamento_pedidos.model.Pedido;
import bootcampDio.gerenciamento_pedidos.model.Produto;
import bootcampDio.gerenciamento_pedidos.repository.ClienteRepository;
import bootcampDio.gerenciamento_pedidos.repository.PedidoRepository;
import bootcampDio.gerenciamento_pedidos.repository.ProdutoRepository;
import bootcampDio.gerenciamento_pedidos.service.contracts.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PedidoServiceImp implements PedidoService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ProdutoRepository produtoRepository;


    @Override
    public void novoPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    @Override
    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }

    @Override
    public double valorTotal(Long id) {
        Optional<Pedido> pedidoOptional = pedidoRepository.findById(id);
        if (pedidoOptional.isPresent()){
            Pedido pedido = pedidoOptional.get();
            return pedido.getProdutos().stream().mapToDouble(Produto::getPreco).sum();
        }else{
            return 0;
        }
    }

    @Override
    public Pedido buscarPedidoId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pedido> findPedidosByClienteCpf(String cpf) {
        return pedidoRepository.findByClienteCpf(cpf);
    }

    @Override
    public Set<Produto> listarProdutos(Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return pedido.map(Pedido::getProdutos).orElse(null);
    }
}
