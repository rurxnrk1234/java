package chap4;

public class Hi4 {

	public static void main(String[] args) {
		for(int m=1; m<=20; m++) {
			System.out.println("*** "+ m + "단 ***");
			for(int n=1; n<=20; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}

	}

}
