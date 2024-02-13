package br.com.lucas.goiana.usuarios.service;

import br.com.lucas.goiana.usuarios.exception.HandlerException;
import br.com.lucas.goiana.usuarios.model.dto.ItemPedidoDTO;
import br.com.lucas.goiana.usuarios.model.dto.PedidoDTO;

import java.util.List;
import java.util.Map;

public interface PerdidoService {

    Map<String, List<PedidoDTO>> getPedidoPorCliente() throws HandlerException;
    Map<String, List<ItemPedidoDTO>> getPedidoPorItemProduto() throws HandlerException;

    //UserDTO postUser(UserDTO userDTO) throws IOException, InterruptedException;



}
