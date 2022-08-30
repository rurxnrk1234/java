package chap3;

import java.util.Scanner;

public class Hello6 {

	public static void main(String[] args)throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputDate;
		
		
		System.out.print("첫번째 수: ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수: ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
	    int num2 = Integer.parseInt(strNum2);
	    int result = num1 + num2;
		System.out.println("덧셈 결과 :" + result);
				
				

	}

}
