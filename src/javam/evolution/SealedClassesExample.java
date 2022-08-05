package javam.evolution;


sealed interface Shape permits Circle, Square, Polygon{};

final class Circle implements Shape{};
final class Square implements Shape{};

public class SealedClassesExample {
	
	
	public static void main(String[] args) {
		Shape s = new Polygon();
		System.out.println(s);		
	}

}
