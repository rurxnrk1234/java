package kr.brains.interf;

public class Something { 
	// 캡슐화(encapsulation) : 클래스로 필드, 메소드 구성
	// -> 자료추상화(date abstraction) 
	// - 자료를 처리하기 위한 최소한의 정보만을 사용할 수 있도록 함 
	// 정보은닉(information hiding)
	// OOP 주요 특징 : 캡슐화, 상속성, 다형성
	// 자료구조(Date structure) : 재료 
	
	
	private String title;
	private String content;
	private String writer;
	private String regDate;
		
	// 자료구조를 활용하는 메소드 : 가공, 연산
	public void printAllFields() {
		System.out.println(title);
		System.out.println(content);
		System.out.println(writer);
	}

}
