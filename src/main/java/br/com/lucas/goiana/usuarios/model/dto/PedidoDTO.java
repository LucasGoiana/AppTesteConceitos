package br.com.lucas.goiana.usuarios.model.dto;

import java.util.Date;
import java.util.List;

public class PedidoDTO {


    public PedidoDTO(Long idPedido, Date data, String cliente, List<ItemPedidoDTO> itens) {
        this.idPedido = idPedido;
        this.data = data;
        this.cliente = cliente;
        this.itens = itens;
    }

    private Long idPedido;

    private Date data;

    private String cliente;

    private List<ItemPedidoDTO> itens;

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedidoDTO> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedidoDTO> itens) {
        this.itens = itens;
    }
}
