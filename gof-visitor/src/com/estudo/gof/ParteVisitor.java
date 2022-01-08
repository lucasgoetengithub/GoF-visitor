package com.estudo.gof;

public interface ParteVisitor {
	public void visit(Cpu cpu);

	public void visit(Periferico perifefico);
}
