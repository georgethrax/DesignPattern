package DP05_PrototypePattern;


public class Rectangle extends Shape {

   public Rectangle(){
     type = "Rectangle"; // type is protected
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}