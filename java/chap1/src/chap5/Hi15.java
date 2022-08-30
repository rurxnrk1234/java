package chap5;

public class Hi15 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		
		int sum2 = add(new int[] {83, 90, 87} );
		System.out.println("총합: " + sum2);
		System.out.println();
		System.out.println("add 한번 더 사용: " + sum2);
	}
	public static int add(int[] scores) {
		int sum = 0;
		int num = scores.length;
		System.out.println("length: " + num);
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
