package kr.brains.api;

public class APIExample {

	public static void main(String[] args) {
		Overriding over = new Overriding();
		Integer i1 = Integer.valueOf(100);
		Integer i2 = Integer.valueOf(100);
		if(i1 == i2) // 두 참조변수가 참조하는 객체는 같은가?
			System.out.println("true");
		else
			System.out.println("false");
			
			
		String s1 = "비즈니스 분석가";
		String s2 = "비즈니스 분석가";
		if(s1 == s2) // 두 참조변수가 참조하는 객체는 같은가?
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());		
		over.testEquals(s1, s2);
		Object o1 = new Object();
		Object o2 = new Object();
		if(o1 == o2)
			System.out.println("true");
		else
			System.out.println("false");
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		over.testEquals(o1, o2);
		
		// shift 연산은 비트단위 연산
		// 128을 비트패턴 1000 0000 왼쪽으로 3 밀기
		//			  0 0010 0000
		// 1번 왼쪾으로 밀떄마다 2로 나누는 효과		
		System.out.println(Integer.toBinaryString(128));
		System.out.println(128 >> 3);
		System.out.println(128 << 3);
		
		Integer intRef = new Integer(100);
		try { // 예외처리문장
			Integer infRef2 = Integer.valueOf("100L");
		} catch(NumberFormatException nfe) {
			System.out.println("예외발생 처리 : " + nfe.getMessage());
		}
		Integer intRef3 = (Integer) 100;
		System.out.println("예외처리 후 " + intRef3);
		
		
	}
}
