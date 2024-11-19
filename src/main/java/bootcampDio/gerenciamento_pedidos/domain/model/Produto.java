package bootcampDio.gerenciamento_pedidos.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Entity
@Table(name = "produto")
@NoArgsConstructor
@ToString
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "produto_id")
    private Long id;

    @Column(name = "produto_nome")
    private String name;

    @Column(name = "produto_categoria")
    private String categoria;

    @Column(name = "produto_preco")
    private Double preco;

    @Column(name = "produto_disponibilidade")
    private boolean disponibilidade;

    // Many-to-many relationship with Pedido
    @ManyToMany
    @JoinTable(
            name = "produto_pedido",
            joinColumns = @JoinColumn(name = "produto_id"),
            inverseJoinColumns = @JoinColumn(name = "pedido_id")
    )
    private Set<Pedido> pedidos;

    public Produto(String name, String categoria, Double preco) {
        this.name = name;
        this.categoria = categoria;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }
}
