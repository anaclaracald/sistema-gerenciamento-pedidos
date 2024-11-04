package bootcampDio.gerenciamento_pedidos.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "produto-id")
    private Long id;
    @Column(name = "produto-nome")
    private String nome;
    @Column(name = "produto-categoria")
    private String categoria;
    @Column(name = "produto-preco")
    private Double preco;
    @Column(name = "produto-disponibilidade")
    private boolean disponibilidade;

    public Produto(Long id, String nome, String categoria, Double preco, boolean disponibilidade) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
    }

    @ManyToMany(mappedBy = "produto")

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

}
