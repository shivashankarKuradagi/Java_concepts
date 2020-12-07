package com.shiv.designPattern.decorative;

public class RedDecorator extends ShapeDecorator {

	public RedDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		shape.draw();
		addRedBorder();
	}

	private void addRedBorder() {
		System.out.println("Adding Red Border!");
	}
}
