package br.com.esec.shapes;

import br.com.esec.interfaces.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}