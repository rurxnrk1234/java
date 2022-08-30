package chap3;

import java.util.Scanner; 

public class Hello8 {

	public static void main(String[] args)throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputDate;
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");		
	    String name = scanner.nextLine();
	    System.out.print("2. 주민번호 앞 6자리: ");
	    String code = scanner.nextLine();
	    System.out.print("3. 전화번호: ");
	    String phone = scanner.nextLine();
	    
	    System.out.println("[입력한 내용]");
	    System.out.printf("%1s\n%2s\n%3s\n",name, code, phone);

	}

}
