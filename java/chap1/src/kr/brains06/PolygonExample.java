package kr.brains06;

public class PolygonExample {
	// 매개변수에 배열을 사용하면 매변변수 개수를 가변적으로 사용할 수 있음
	public static void main(String[] args) {
		// Polygon 형의 poly라는 참조변수를 사용
		// Triangle, Square, Trapeziod ..상속받음, 공통적인 특징을 가짐
		Polygon poly = new Triangle(50, 80);
		System.out.println("넓이는 : " + poly.evaluate());
		poly = new Square(40, 80);
		System.out.println("넓이는 : " + poly.evaluate());
		poly = new Trapezoid(50, 80, 60);
		System.out.println("넓이는 : " + poly.evaluate());
	}
}