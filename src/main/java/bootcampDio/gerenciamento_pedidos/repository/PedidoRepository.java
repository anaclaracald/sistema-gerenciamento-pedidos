package bootcampDio.gerenciamento_pedidos.repository;

import bootcampDio.gerenciamento_pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    @Query("SELECT p FROM Pedido p WHERE p.cliente.cpf = :cpf")
    List<Pedido> findByClienteCpf(@Param("cpf") String cpf);
}
