package bootcampDio.gerenciamento_pedidos.service.contracts;

import bootcampDio.gerenciamento_pedidos.model.Cliente;
import bootcampDio.gerenciamento_pedidos.model.Pedido;
import bootcampDio.gerenciamento_pedidos.model.Produto;

public interface ClienteService {
    Cliente novoCliente(String cpf, String name);

    boolean verificarCPF(String cpf);

    void deletarCliente(String cpf);

    Cliente buscarCliente(String cpf);

    //Pedido buscarPedido(Cliente cpf);
}
