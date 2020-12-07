package com.shiv.designPattern.decorative;

public abstract class ShapeDecorator implements Shape {
	
	protected Shape shape;

	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}
	
	public abstract void draw();	

}
