package bootcampDio.gerenciamento_pedidos.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @Column(name = "cliente-cpf")
    private String cpf;
    @Column(name = "cliente-nome")
    private String name;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return name;
    }
}
