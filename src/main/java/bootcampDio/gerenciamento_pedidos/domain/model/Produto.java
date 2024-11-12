package bootcampDio.gerenciamento_pedidos.domain.model;

import jakarta.persistence.*;

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

    public Produto(String name, String categoria, Double preco) {
        this.name = name;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Produto{");
        sb.append("name='").append(name).append('\'');
        sb.append(", categoria='").append(categoria).append('\'');
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public String getNome() {
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

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
