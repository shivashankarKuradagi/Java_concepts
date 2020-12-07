package com.shiv.designPattern.decorative;

public class BlueBorderDecorator extends ShapeDecorator {

	public BlueBorderDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		shape.draw();
		addBlueBorder();
	}

	private void addBlueBorder() {
		System.out.println("Blue Border is added");
	}

}
