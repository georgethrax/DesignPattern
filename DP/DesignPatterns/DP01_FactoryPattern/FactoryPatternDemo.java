package DP01_FactoryPattern;
//import DP01_FactoryPattern.ShapeFactory;
//import DP01_FactoryPattern.Shape;

public class FactoryPatternDemo{
	public static void main(String[] args){
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape sp_circle = shapeFactory.getShape("CIRcle");
		Shape sp_rect = shapeFactory.getShape("RectangLE");
		Shape sp_sq = shapeFactory.getShape("SQUARE");

		sp_circle.draw();
		sp_rect.draw();
		sp_sq.draw();
	}
}