package br.com.guacom.livraria.design.patterns.modelo;

import br.com.guacom.hotel.util.MoedaUtil;

public class CalculadorDeDesconto {
	
	public String calcularDesconto(TabelaDesconto tbd) {
		return MoedaUtil.formatBr(tbd.calculaDesconto());
	}
}
