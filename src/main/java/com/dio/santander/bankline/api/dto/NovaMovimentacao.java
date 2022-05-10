package com.dio.santander.bankline.api.dto;


import com.dio.santander.bankline.api.model.MovimentacaoTipo;

public class NovaMovimentacao {
	
	private String Descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	private Integer idConta;
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	
	
}
