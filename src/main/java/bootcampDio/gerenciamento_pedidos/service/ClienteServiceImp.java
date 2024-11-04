package bootcampDio.gerenciamento_pedidos.service;

import bootcampDio.gerenciamento_pedidos.model.Cliente;
import bootcampDio.gerenciamento_pedidos.model.Pedido;
import bootcampDio.gerenciamento_pedidos.model.Produto;
import bootcampDio.gerenciamento_pedidos.service.contracts.ClienteService;

public class ClienteServiceImp implements ClienteService {

    @Override
    public void novoCliente() {

    }

    @Override
    public boolean verificarCPF(Long cpf) {
        return false;
    }

    @Override
    public void deletarCliente(Long cpf) {

    }

    @Override
    public Cliente buscarCliente(Long cpf) {
        return null;
    }

    @Override
    public Pedido buscarPedido(Cliente cpf) {
        return null;
    }

}
