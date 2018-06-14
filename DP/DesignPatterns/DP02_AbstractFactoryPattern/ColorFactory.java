package DP02_AbstractFactoryPattern;

import DP01_FactoryPattern.Shape;


public class ColorFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String shapeType){
		return null;
	}

	@Override
	public Color getColor(String color){
		if (color == null){
			return null;
		}
		if (color.equalsIgnoreCase("RED")){
			return new Red();
		}
		else if (color.equalsIgnoreCase("Green")){
			return new Green();
		}
		return null;
	}
}