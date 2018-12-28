package br.com.guacom.livraria.design.patterns.modelo;

import java.math.BigDecimal;

public class ProdutosFisicos extends Produto implements TabelaDesconto {

	public ProdutosFisicos(String nome, BigDecimal preco) {
		super(nome, preco);
	}

	@Override
	public BigDecimal calculaDesconto() {
		double value = super.getPreco().doubleValue();
		return BigDecimal.valueOf(value - (value * 0.3));
	}
}
