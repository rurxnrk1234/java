package kr.brains06;

public class Square extends Polygon {
	public Square(int height, int width) {
		super(height, width);
	}
	
	
	// annotation : 컴파일러에게 컴파일을 잘 할 수 있도록 정보를 제공
	// 재정의 : 메소드 이름, 매개변수 갯수, 타입 동일
	public int evaluate() { 
		return(getHeight() * getWidth());
	}

}
