package DP02_AbstractFactoryPattern;

import DP01_FactoryPattern.Shape;


public class AbstractFactoryPatternDemo {
	public static void main(String[] args){
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
		Shape sp_sq = shapeFactory.getShape("Square");
		Color cr_gr = colorFactory.getColor("green");
		sp_sq.draw();
		cr_gr.fill();
	}
}