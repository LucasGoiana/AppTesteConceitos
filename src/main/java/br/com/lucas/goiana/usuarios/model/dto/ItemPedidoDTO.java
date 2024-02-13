package br.com.lucas.goiana.usuarios.model.dto;

import java.math.BigDecimal;

public class ItemPedidoDTO {
    private Long idItem;

    private ProdutoDTO produtoDTO;

    private Integer quantidade;

    private BigDecimal total;

    public ItemPedidoDTO(Long idItem, ProdutoDTO produtoDTO, Integer quantidade, BigDecimal total) {
        this.idItem = idItem;
        this.produtoDTO = produtoDTO;
        this.quantidade = quantidade;
        this.total = total;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public ProdutoDTO getProdutoDTO() {
        return produtoDTO;
    }

    public void setProdutoDTO(ProdutoDTO produtoDTO) {
        this.produtoDTO = produtoDTO;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
