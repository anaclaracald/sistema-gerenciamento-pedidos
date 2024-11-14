package bootcampDio.gerenciamento_pedidos.controller;

import bootcampDio.gerenciamento_pedidos.domain.model.Cliente;
import bootcampDio.gerenciamento_pedidos.domain.service.ClienteServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    public final ClienteServiceImp service;

    public ClienteController(ClienteServiceImp service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente){
        boolean cpfValido = service.verificarCPF((cliente.getCpf()));
        if (!cpfValido){
            return ResponseEntity.badRequest().body(null);
        }
        Cliente clienteSalvo = service.novoCliente(cliente.getCpf(), cliente.getNome());
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalvo);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<Cliente> buscarCliente(@PathVariable String cpf){
        Cliente cliente = service.buscarCliente(cpf);
        if (cliente != null){
            return ResponseEntity.ok(cliente);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deletarCliente(@PathVariable String cpf){
        Cliente cliente = service.buscarCliente(cpf);
        if (cliente != null){
            service.deletarCliente(cpf);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/verificar-cpf")
    public ResponseEntity<Boolean> verificarCPF(@RequestBody String cpf){
        boolean cpfValido= service.verificarCPF(cpf);
        return ResponseEntity.ok(cpfValido);
    }
}
