package br.com.esec.shapes;

import br.com.esec.interfaces.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}