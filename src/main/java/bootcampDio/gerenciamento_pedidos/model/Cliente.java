package bootcampDio.gerenciamento_pedidos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "cliente-cpf")
    private String cpf;
    @Column(name = "cliente-nome")
    private String nome;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @OneToMany

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
