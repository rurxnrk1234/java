package chap4;

public class Hi9 {

	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random() * 6) +1;
			int num2 = (int)(Math.random() * 6) +1;
			System.out.println(num1 + num2);
			
			if(num1 + num2 == 5) {
			break;
			
		}
		

	}
		System.out.println("프로그램 종료");

}
}
