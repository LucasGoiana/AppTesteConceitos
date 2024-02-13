package br.com.lucas.goiana.usuarios.service;

import br.com.lucas.goiana.usuarios.exception.HandlerException;
import br.com.lucas.goiana.usuarios.model.dto.ItemPedidoDTO;
import br.com.lucas.goiana.usuarios.model.dto.PedidoDTO;
import br.com.lucas.goiana.usuarios.model.dto.ProdutoDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PerdidoServiceImpl implements PerdidoService {
    @Override
    public Map<String, List<PedidoDTO>> getPedidoPorCliente() throws HandlerException {

         var list = fazListaPedido()
                 .stream()
                 .collect(
                         Collectors.groupingBy(
                                 PedidoDTO::getCliente
                         )
                 );

         return list;
    }

    @Override
    public Map<String, List<ItemPedidoDTO>> getPedidoPorItemProduto() throws HandlerException {
        return null;
    }

    private List<PedidoDTO> fazListaPedido(){


        ProdutoDTO produtoDTO = new ProdutoDTO(1L, "Garrafa da Stanley", new BigDecimal(20));
        ItemPedidoDTO itemPedidoDTO = new ItemPedidoDTO(1L, produtoDTO, 10, new BigDecimal(20));
        List<ItemPedidoDTO> listItemPedidoDTO = new ArrayList<>();
        listItemPedidoDTO.add(itemPedidoDTO);

        ProdutoDTO produtoDTO2 = new ProdutoDTO(2L, "Copo da Stanley", new BigDecimal(20));
        ItemPedidoDTO itemPedidoDTO2 = new ItemPedidoDTO(2L, produtoDTO2, 10, new BigDecimal(20));
        listItemPedidoDTO.add(itemPedidoDTO2);


        PedidoDTO pedidoDTO = new PedidoDTO(1L, new Date(), "Lucas Goaina Malicia", listItemPedidoDTO);
        PedidoDTO pedidoDTO2 = new PedidoDTO(2L, new Date(), "Lucas Goiana Malicia", listItemPedidoDTO);

        List<PedidoDTO> listPedidoDTO = new ArrayList<>();
        listPedidoDTO.add(pedidoDTO);
        listPedidoDTO.add(pedidoDTO2);

        return listPedidoDTO;
    }
}
