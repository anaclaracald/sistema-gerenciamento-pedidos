package bootcampDio.gerenciamento_pedidos.repository;

import bootcampDio.gerenciamento_pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}
