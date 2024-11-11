package bootcampDio.gerenciamento_pedidos.service;

import bootcampDio.gerenciamento_pedidos.model.Produto;
import bootcampDio.gerenciamento_pedidos.repository.ProdutoRepository;
import bootcampDio.gerenciamento_pedidos.service.contracts.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImp implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto inserir(Long id, String name, String categoria, Double preco, boolean disponibilidade) {
        Produto produto = new Produto(id, name, categoria, preco, disponibilidade);
        return produtoRepository.save(produto);
    }

    @Override
    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public List<Produto> get() {
        return (List<Produto>) produtoRepository.findAll();
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
