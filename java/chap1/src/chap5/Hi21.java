package chap5;

public class Hi21 {

	public static void main(String[] args) {
		int javaScores[][] = {{88,95,80},{92,96,81}};
		int sum = 0;
		for(int x=0; x<javaScores.length; x++) {
			for(int y=0; y<javaScores[x].length; y++)
				sum += javaScores[x][y];				
		}
			System.out.println("sum: " + sum);
	}
}
