package chap2;

public class Hello2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	byte byteValue = 10;
	int intValue = byteValue;
	System.out.println("intValue: " + intValue);
	
	char charValue = '가';
	intValue = charValue;
	System.out.println("가의 유니코드: " + intValue);
	
	intValue = 50;
	long longValue = intValue;
	System.out.println("longValue: " + intValue);
	
	longValue = 100;
	float floatValue = longValue;
	System.out.println("floatValue: " + longValue);
	
	floatValue = 100.5F;
	double doubleValue = floatValue;
	System.out.println("doubleValue:" + floatValue);

	}
}