package bootcampDio.gerenciamento_pedidos.controller;

import bootcampDio.gerenciamento_pedidos.domain.model.Produto;
import bootcampDio.gerenciamento_pedidos.domain.service.ProdutoServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    public final ProdutoServiceImp service;

    public ProdutoController(ProdutoServiceImp service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto){
        Produto produtoSalvo = service.novoProduto(produto.getName(), produto.getCategoria(), produto.getPreco());
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProdutoId(@PathVariable Long id){
        Produto produto = service.buscarProdutoId(id);
        if (produto != null){
            return ResponseEntity.ok(produto);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/{name}")
    public ResponseEntity<Produto> buscarProdutoId(@PathVariable String name){
        Produto produto = service.buscarProdutoNome(name);
        if (produto != null){
            return ResponseEntity.ok(produto);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deletarPedido(@PathVariable Long id){
        Produto produto = service.buscarProdutoId(id);
        if (produto != null){
            service.deleteById(id);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
