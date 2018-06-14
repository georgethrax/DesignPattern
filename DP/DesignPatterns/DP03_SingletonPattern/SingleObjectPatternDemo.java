package DP03_SingletonPattern;


public class SingleObjectPatternDemo {

	public static void main(String[] args){
	
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
}