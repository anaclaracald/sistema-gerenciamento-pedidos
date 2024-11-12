package bootcampDio.gerenciamento_pedidos.domain.service.contracts;

import bootcampDio.gerenciamento_pedidos.domain.model.Cliente;

public interface ClienteService {
    Cliente novoCliente(String cpf, String name);

    boolean verificarCPF(String cpf);

    void deletarCliente(String cpf);

    Cliente buscarCliente(String cpf);

    //Pedido buscarPedido(Cliente cpf);
}
