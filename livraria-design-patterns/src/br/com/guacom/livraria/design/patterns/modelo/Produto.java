package br.com.guacom.livraria.design.patterns.modelo;

import java.math.BigDecimal;

public abstract class Produto implements TabelaDesconto {
	
	private String nome;
	private BigDecimal preco;
	
	public Produto(String nome, BigDecimal preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
}
