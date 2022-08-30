package kr.brain04.same;

import kr.brain04.other.Other;
import kr.brain04.other.Protected;

public class SameExample {
	
	public static void main(String[] args) {
		
		
		Protected protect = new Protected();
		
		
		Same same = new Same();
		
		System.out.println("Same Package");
		System.out.println(same.defaultField);
		System.out.println(same.protectedField);
		System.out.println(same.publicField);
		
		Other other = new Other();
		System.out.println("Same Package");
		System.out.println(same.defaultField);
		System.out.println(same.protectedField);
		System.out.println(same.publicField);
	}

}
