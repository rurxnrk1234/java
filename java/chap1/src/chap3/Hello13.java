package chap3;

import java.util.Scanner;

public class Hello13 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();
		
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java") & password == 12345) {
			System.out.println("로그인 성공");			
		}else {
			System.out.println("로그인 실패");
		}
		
		
		
			

		}

}
