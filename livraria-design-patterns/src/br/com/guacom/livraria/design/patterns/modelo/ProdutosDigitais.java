package br.com.guacom.livraria.design.patterns.modelo;

import java.math.BigDecimal;

public class ProdutosDigitais extends Produto implements TabelaDesconto {

	public ProdutosDigitais(String nome, BigDecimal preco) {
		super(nome, preco);
	}

	@Override
	public BigDecimal calculaDesconto() {
		double value = super.getPreco().doubleValue();
		return BigDecimal.valueOf(value - (value * 0.15));
	}
}
