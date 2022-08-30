package kr.brains02;

import kr.brains.ModCalculator;

public class GugugudanExample {
	public static void main(String[] args) {
		// 클래스의 생성자를 호출하여 객체를 생성하고, gugudan 참조변수에 할당
		// 참조 변수도 참조하는 클래스와 같은 클래스 유형(또는 상위클래스 형)
		Gugudan gugudan = new Gugudan(2);
		//gugudan.printOne(9);
		//gugudan.printAll();
		//gugudan.printFrom(7);
		
		ModCalculator nc = new ModCalculator(10, "*", 20);
		
		SubGugudan subRef  = new SubGugudan(2);
		subRef.printOne(0);
		subRef.printFrom(5);
		subRef.printFrom(5, "down");
	}
}

