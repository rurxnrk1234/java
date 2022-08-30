package chap3;

public class Hello7 {

	public static void main(String[] args)throws Exception {
		String name = "감자바";
		int age =  25;
		
		String tel1="010", tel2 = "123", tel3= "4567";
		
		System.out.println("이름:" + name);
		System.out.print("이름: " + age + "\n");
	    System.out.printf("전화: %1$s - %2$s - %3$s", tel1, tel2, tel3);

}
}

