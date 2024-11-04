package bootcampDio.gerenciamento_pedidos.service.contracts;

import bootcampDio.gerenciamento_pedidos.model.Cliente;
import bootcampDio.gerenciamento_pedidos.model.Pedido;
import bootcampDio.gerenciamento_pedidos.model.Produto;

public interface ClienteService {
    void novoCliente();

    boolean verificarCPF(Long cpf);

    void deletarCliente(Long cpf);

    Cliente buscarCliente(Long cpf);

    Pedido buscarPedido(Cliente cpf);
}
