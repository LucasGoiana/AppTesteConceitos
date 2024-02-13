package br.com.lucas.goiana.usuarios.controller;

import br.com.lucas.goiana.usuarios.exception.HandlerException;
import br.com.lucas.goiana.usuarios.model.dto.ItemPedidoDTO;
import br.com.lucas.goiana.usuarios.model.dto.PedidoDTO;
import br.com.lucas.goiana.usuarios.service.PerdidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private final PerdidoService perdidoService;

    public PedidoController( PerdidoService perdidoService) {
        this.perdidoService = perdidoService;
    }


    @GetMapping("/")
    public Map<String, List<PedidoDTO>> getPedidoPorCliente() throws HandlerException {
        return perdidoService.getPedidoPorCliente();
    }

    @GetMapping("/itemPedido")
    public Map<String, List<ItemPedidoDTO>> getPedidoPorItemProduto() throws HandlerException {
        return perdidoService.getPedidoPorItemProduto();
    }
   /* @PostMapping("/")
    public UserDTO postUser(@RequestBody UserDTO newUser) throws IOException, InterruptedException {
        return perdidoService.postPedidos(newUser);
    }*/
}
