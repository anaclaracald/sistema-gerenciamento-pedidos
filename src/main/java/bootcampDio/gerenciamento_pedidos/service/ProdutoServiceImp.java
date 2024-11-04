package bootcampDio.gerenciamento_pedidos.service;

import bootcampDio.gerenciamento_pedidos.model.Produto;
import bootcampDio.gerenciamento_pedidos.repository.ClienteRepository;
import bootcampDio.gerenciamento_pedidos.repository.PedidoRepository;
import bootcampDio.gerenciamento_pedidos.repository.ProdutoRepository;
import bootcampDio.gerenciamento_pedidos.service.contracts.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImp implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public void inserir() {

    }

    @Override
    public void atualizar(Long id) {

    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    public Produto buscarProdutoId(Long id) {
        pro
        return null;
    }

    @Override
    public Produto buscarProdutoNome(String nome) {
        return null;
    }
}
