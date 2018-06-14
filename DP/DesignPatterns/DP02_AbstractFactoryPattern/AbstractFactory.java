package DP02_AbstractFactoryPattern;

import DP01_FactoryPattern.Shape;


public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}