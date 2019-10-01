package br.com.lojavirtual.principal;

import br.com.lojavirtual.papelaria.Teclado;

public class TestaLoja {
	public static void main(String[] args) {
		Teclado t = new Teclado();
		t.setPreço(1000.30);
		t.setUsb(true);
		System.out.println(t.isUsb());
		br.com.lojavirtual.instrumento.Teclado x = new br.com.lojavirtual.instrumento.Teclado();
		x.setQtdTeclas(35);
	}

}
