package bootcampDio.gerenciamento_pedidos.model;

import jakarta.persistence.*;

import javax.management.ConstructorParameters;
import java.util.Set;

@Entity
@Table(name = "produto")
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

    public Produto() {
    }

    public Produto(Long id, String name, String categoria, Double preco, boolean disponibilidade) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
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

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
