package com.shiv.designPattern.decorative;

public class DecoratorDemo {

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape rectAngle = new Rectangle();
		
		ShapeDecorator shapeDecorator = new RedDecorator(circle);
		
		System.out.println("Normal");
		circle.draw();
		System.out.println("----------------");
		System.out.println("Red border");
		shapeDecorator.draw();
		
	}

}
