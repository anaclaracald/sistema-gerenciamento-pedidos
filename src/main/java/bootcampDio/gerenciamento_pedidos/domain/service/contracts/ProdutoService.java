package bootcampDio.gerenciamento_pedidos.domain.service.contracts;

import bootcampDio.gerenciamento_pedidos.domain.model.Produto;

import java.util.List;

public interface ProdutoService {

    Produto novoProduto(String name, String categoria, Double preco);

    //void atualizar(Long id);

    void deleteById(Long id);

    List<Produto> get();

    Produto buscarProdutoId(Long id);

    Produto buscarProdutoNome(String name);

}
