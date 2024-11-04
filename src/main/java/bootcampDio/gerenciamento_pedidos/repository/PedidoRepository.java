package bootcampDio.gerenciamento_pedidos.repository;

import bootcampDio.gerenciamento_pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
