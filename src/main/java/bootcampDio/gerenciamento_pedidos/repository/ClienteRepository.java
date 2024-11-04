package bootcampDio.gerenciamento_pedidos.repository;

import bootcampDio.gerenciamento_pedidos.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
