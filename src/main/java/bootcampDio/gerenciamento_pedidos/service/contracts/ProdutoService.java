package bootcampDio.gerenciamento_pedidos.service.contracts;

import bootcampDio.gerenciamento_pedidos.model.Cliente;
import bootcampDio.gerenciamento_pedidos.model.Pedido;
import bootcampDio.gerenciamento_pedidos.model.Produto;

public interface ProdutoService {

    void inserir();

    void atualizar(Long id);

    void deletar(Long id);

    Produto buscarProdutoId(Long id);

    Produto buscarProdutoNome(String nome);

}
