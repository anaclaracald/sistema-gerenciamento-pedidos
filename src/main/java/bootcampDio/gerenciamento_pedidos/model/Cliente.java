package bootcampDio.gerenciamento_pedidos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "cliente-cpf")
    private Long cpf;
    @Column(name = "cliente-nome")
    private String nome;

    public Cliente(Long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
