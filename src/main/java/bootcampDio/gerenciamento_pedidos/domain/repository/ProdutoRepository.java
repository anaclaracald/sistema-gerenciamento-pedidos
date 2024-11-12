package bootcampDio.gerenciamento_pedidos.domain.repository;

import bootcampDio.gerenciamento_pedidos.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    Optional<Produto> findByName(String nome);

    void deleteById(Long id);
}
