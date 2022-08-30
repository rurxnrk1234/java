package kr.brain04.same;

public class Same {
	private int privateField = 5;
	int defaultField = 6;
	protected int protectedField = 7;
	public int publicField = 8;
	boolean b = true;
	
	void printPrivateField() {
		System.out.println(privateField);
	}
	void setB(boolean bv) {
		b = bv;
	}
	boolean isB() {
		return b;
	}

}
