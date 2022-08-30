package kr.brains.interf;

// Java 클래스 단일 상속 - <서브클래스> extends <수퍼클래스> 
// 인터페이스 다중 상속 - <서브인터페이스> extends <수퍼인터페이스>[, <수퍼인터페이스>] 다수
// 인터페이스 다중 구현 - <클래스> implements <인터페이스>[, <인터페이스>] 다수
// 다중 구현 
public class SmartPhone implements CameraPhone, Phone,Messenger, Timer {
	String phoneNumber;
	
	@Override
	public void sendMsg(String phoneNumber, String msg) {
		System.out.printf("[%s]로 %S메시지 전송]\n", phoneNumber, msg);
		// TODO Auto-generated method stub
	}
	@Override
	public void receiveMsg() {
		System.out.println("메세지가 도착했습니다.");
		// TODO Auto-generated method stub
	}
	@Override
	public void playBeep() {
		System.out.println("알람 : 비프음 재생.");
		// TODO Auto-generated method stub		
	}
	@Override
	public void playMusic(String title) {
		System.out.printf("알람 : %s 음악 재생.", title);
		// TODO Auto-generated method stub		
	}
	@Override
	public void call(String phoneNumber) {
		System.out.println(phoneNumber + "에 전화를 겁니다.");
		// TODO Auto-generated method stub	
	}
	@Override
	public void receive() {
		System.out.println("전화를 받습니다");
		// TODO Auto-generated method stub		
	}
	@Override
	public void takeaPicture() {
		System.out.println("사진을 촬영한다");
		// TODO Auto-generated method stub
		
	}
}
