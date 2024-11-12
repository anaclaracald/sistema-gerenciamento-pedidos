package bootcampDio.gerenciamento_pedidos.domain.service;

import bootcampDio.gerenciamento_pedidos.domain.model.Produto;
import bootcampDio.gerenciamento_pedidos.domain.repository.ProdutoRepository;
import bootcampDio.gerenciamento_pedidos.domain.service.contracts.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImp implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto novoProduto( String name, String categoria, Double preco) {
        Produto produto = new Produto(name, categoria, preco);
        return produtoRepository.save(produto);
    }

    @Override
    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public List<Produto> get() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto buscarProdutoId(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        if(produto.isPresent()){
            return produto.get();
        }else {
            return null;
        }
    }

    @Override
    public Produto buscarProdutoNome(String name) {
        Optional<Produto> produto = produtoRepository.findByName(name);
        if(produto.isPresent()){
            return produto.get();
        }else {
            return null;
        }
    }
}
