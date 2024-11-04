package bootcampDio.gerenciamento_pedidos.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pedido-id")
    private Long id;
    @Column(name = "pedido-dataHora")
    @CreationTimestamp
    private LocalDateTime dataHora;
    @ManyToOne()
    private Cliente cliente;
    @OneToMany(mappedBy = "pedido")
    private Set<Produto> produtos;

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
