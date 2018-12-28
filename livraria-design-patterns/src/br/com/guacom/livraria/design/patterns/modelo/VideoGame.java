package br.com.guacom.livraria.design.patterns.modelo;

import java.math.BigDecimal;

public class VideoGame extends Produto {

	public VideoGame(String nome, BigDecimal preco) {
		super(nome, preco);
	}

	@Override
	public BigDecimal calculaDesconto() {
		return super.getPreco();
	}
}
