package bootcampDio.gerenciamento_pedidos.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pedido_id")
    private Long id;

    @Column(name = "pedido_dataHora")
    @CreationTimestamp
    private LocalDateTime dataHora;

    @ManyToOne
    @JoinColumn(name = "cliente_cpf", referencedColumnName = "cliente-cpf")
    private Cliente cliente;

    @ManyToMany(mappedBy = "pedidos")
    private Set<Produto> produtos;

    public Pedido() {
    }

    public Pedido(Long id, LocalDateTime dataHora, Cliente cliente) {
        this.id = id;
        this.dataHora = dataHora;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
