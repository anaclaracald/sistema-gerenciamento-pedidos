package bootcampDio.gerenciamento_pedidos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @Column(name = "cliente-cpf")
    private String cpf;
    @Column(name = "cliente-nome")
    private String name;

    public Cliente() {
    }

    public Cliente(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return name;
    }
}
