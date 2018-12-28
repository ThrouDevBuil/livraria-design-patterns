package br.com.guacom.livraria.design.patterns.teste;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.guacom.livraria.design.patterns.modelo.CalculadorDeDesconto;
import br.com.guacom.livraria.design.patterns.modelo.JogoDeTabuleiro;
import br.com.guacom.livraria.design.patterns.modelo.LivroDigital;
import br.com.guacom.livraria.design.patterns.modelo.LivroFisico;
import br.com.guacom.livraria.design.patterns.modelo.Produto;
import br.com.guacom.livraria.design.patterns.modelo.ProdutosDigitais;
import br.com.guacom.livraria.design.patterns.modelo.ProdutosFisicos;
import br.com.guacom.livraria.design.patterns.modelo.RevistaFisicas;
import br.com.guacom.livraria.design.patterns.modelo.RevistasDigitais;
import br.com.guacom.livraria.design.patterns.modelo.TabelaDesconto;
import br.com.guacom.livraria.design.patterns.modelo.VideoGame;

public class Teste {
	
	//A classe cliente (Teste) está passando uma estratégia de cálculo de desconto para o calculador
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.addAll(Arrays.asList(new JogoDeTabuleiro("Dama", BigDecimal.valueOf(30.0)), 
				new LivroDigital("+ Esperto que o diabo", BigDecimal.valueOf(45.50)), 
				new LivroFisico("O poder do hábito", BigDecimal.valueOf(45.39)), 
				new RevistaFisicas("Veja", BigDecimal.valueOf(30.23)), 
				new RevistasDigitais("O Globo", BigDecimal.valueOf(20.0)),
				new VideoGame("God Of War", BigDecimal.valueOf(150.78))));
		
		CalculadorDeDesconto calc = new CalculadorDeDesconto();
		
		for(Produto product : produtos) {
			TabelaDesconto tb = product;
												//Passando uma estratégia para o cálculo de desconto (Strategy)
			System.out.println(calc.calcularDesconto(tb));
		}
	}
}
