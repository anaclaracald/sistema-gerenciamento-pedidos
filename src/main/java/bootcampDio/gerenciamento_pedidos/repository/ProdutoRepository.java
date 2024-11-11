package bootcampDio.gerenciamento_pedidos.repository;

import bootcampDio.gerenciamento_pedidos.model.Cliente;
import bootcampDio.gerenciamento_pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    Optional<Produto> findByName(String nome);

    void deleteById(Long id);
}
