package kr.brains06;

public class Rectangle extends Polygon {
	
	public Rectangle(int height, int width) {
		//컴파일러가 묵시적을 super 클래스의 해당 생성자를 호출
		super(height, width);
	}
	public int evaluate() {
		int area = getHeight() * getWidth() / 2;
		return area;
	}
}

