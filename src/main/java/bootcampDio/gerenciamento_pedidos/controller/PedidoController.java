package bootcampDio.gerenciamento_pedidos.controller;

import bootcampDio.gerenciamento_pedidos.domain.model.Cliente;
import bootcampDio.gerenciamento_pedidos.domain.model.Pedido;
import bootcampDio.gerenciamento_pedidos.domain.service.ClienteServiceImp;
import bootcampDio.gerenciamento_pedidos.domain.service.PedidoServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    public final PedidoServiceImp service;

    public PedidoController(PedidoServiceImp service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Pedido> salvarCliente(@RequestBody Pedido pedido){
        Pedido pedidoSalvo = service.novoPedido(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPedido(@PathVariable Long id){
            Pedido pedido = service.buscarPedidoId(id);
        if (pedido != null){
            return ResponseEntity.ok(pedido);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deletarPedido(@PathVariable Long id){
        Pedido pedido = service.buscarPedidoId(id);
        if (pedido != null){
            service.deletarPedido(id);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
