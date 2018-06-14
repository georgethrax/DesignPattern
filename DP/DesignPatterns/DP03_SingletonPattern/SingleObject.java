package DP03_SingletonPattern;


public class SingleObject {

	// The SINGLE instance
	private static SingleObject instance = new SingleObject();

	// Private Constructor to avoid multi-instances
	private SingleObject(){}

	// Static function
	public static SingleObject getInstance(){
		return instance;
	}

	// Demo
	public void showMessage(){
		System.out.println("SingleObject::showMessage().");
	}
}