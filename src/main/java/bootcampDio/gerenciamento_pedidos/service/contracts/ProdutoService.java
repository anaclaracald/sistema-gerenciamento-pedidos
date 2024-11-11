package bootcampDio.gerenciamento_pedidos.service.contracts;

import bootcampDio.gerenciamento_pedidos.model.Cliente;
import bootcampDio.gerenciamento_pedidos.model.Pedido;
import bootcampDio.gerenciamento_pedidos.model.Produto;

import java.util.List;

public interface ProdutoService {

    Produto inserir(Long id, String name, String categoria, Double preco, boolean disponibilidade);

    //void atualizar(Long id);

    void deleteById(Long id);

    List<Produto> get();

    Produto buscarProdutoId(Long id);

    Produto buscarProdutoNome(String name);

}
