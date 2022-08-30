package kr.brains.api;

import java.text.SimpleDateFormat;
import java.util.*;


public class CarExample {
	
	public static void main(String[] args){
		
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow.get(Calendar.YEAR));
		
		Week today = null;
		
		for(Week w : Week.values())
			System.out.println(w);
		


		switch(dow) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.THURSDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
	
		System.out.println("오늘은 : " + today);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 mm월 dd일 hh:mm:ss");
		System.out.println(sdf.format(date));
		
		
		/*Class clazz1 = null;
		try {
			clazz = Class.forName("kr.brians.api.Car");
		}catch (ClassNotFoundEX)
		clazz = Class.forName("kr.brians.api.Car");
		Class clazz1 = Class.forName("kr.brains.api.Car");
		System.out.println(clazz1.getPackageName());
		System.out.println(clazz.);  */
	}

}
