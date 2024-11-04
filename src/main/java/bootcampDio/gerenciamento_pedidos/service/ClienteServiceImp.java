package bootcampDio.gerenciamento_pedidos.service;

import bootcampDio.gerenciamento_pedidos.model.Cliente;
import bootcampDio.gerenciamento_pedidos.repository.ClienteRepository;
import bootcampDio.gerenciamento_pedidos.service.contracts.ClienteService;
import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CPFValidator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClienteServiceImp implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente novoCliente(String cpf, String nome) {
        Cliente cliente = new Cliente(cpf, nome);
        return clienteRepository.save(cliente);
    }

    @Override
    public boolean verificarCPF(String cpf) {
        CPFValidator cpfvalidator = new CPFValidator();
        List<ValidationMessage> erros = cpfvalidator.invalidMessagesFor(cpf); if(erros.size() > 0){ return false; }else{ return true; }
    }

    @Override
    public void deletarCliente(String cpf) {
        // FIXME verificação se o cpf está cadastrado na base de dados
        Optional<Cliente> cliente = clienteRepository.findByCpf(cpf);
        cliente.ifPresent(clienteRepository::delete);
    }

    @Override
    public Cliente buscarCliente(String cpf) {
        Optional<Cliente> cliente = clienteRepository.findByCpf(cpf);
        if(cliente.isPresent()){
            return cliente.get();
        }else{
            return null;
        }
    }
}
