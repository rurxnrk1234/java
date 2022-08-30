package kr.brains06;

public class Trapezoid extends Polygon {
	private int upper; // 윗변
	
	public Trapezoid(int height, int width, int upper) {
		super(height, width); // 수퍼클래스의 생성자를 호출, width : 아랫변
		this.upper = upper;
	}
	public int getUpper() {
		return upper;
	}
	
	public int evaluate() {
		int area = (getWidth() + getUpper()) * getHeight() / 2;
		return area;
	}

}
