package bootcampDio.gerenciamento_pedidos.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pedido-id")
    private Long id;
    @Column(name = "pedido-dataHora")
    private LocalDateTime dataHora;
    private Cliente cliente;

    private Set<Produto> produtos;

    @ManyToMany
    @JoinTable(name = "pedido",
            joinColumns = @JoinColumn(name = "pedido-id"),
            inverseJoinColumns = @JoinColumn(name = "produto-id"))

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
