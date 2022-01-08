package com.estudo.gof;

public class Visi {
	public static void main(String[] args) {
		ParteComp computador = new Cpu();
		computador.adicionar(new ShowVisitor());
	}
}
