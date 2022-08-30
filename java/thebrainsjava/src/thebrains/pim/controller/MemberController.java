package thebrains.pim.controller;

import thebrains.pim.view.TUIView;
import thebrains.pim.service.MemberService;
import thebrains.pim.model.Member;
import thebrains.pim.service.MemberServiceImpl;
import thebrains.pim.view.TUIView;


public class MemberController { // 요청을 제어하는 요소
	/*
	 MVC(Model-View-Controller) 모델 기반 
	 개인정보관리시스템(Personal Information System)
	 C.R.U.D (Create Read Update Delete) : 자료를 처리하는 기본 기능
	 추가 기능 : 정렬, 검색, 페이지
	*/
	
	// MemberView memberView = null;
	// MemberService<Member> memberService = null;
	MemberService<Member> memberService = null;
	public static TUIView tui = new TUIView();
	public  static final String MEMBER_DB="memberdb.txt";
	
	
	
	public MemberController() {
		memberService = new MemberServiceImpl<Member>();
	}
	public void dispatch() { // dispatch : 시작의 의미, 명령을 가져옴
		memberService.readFile();
		boolean isLogin = true;
		boolean isRoot = true;
		int menu = 0;
		do {
		// true,true : root 로그인, true, false : 사용자 로그인, false : 로그인전
		tui.showMenu(isLogin, isRoot);
		menu = tui.inputMenu();
		switch (menu) {
        case 0:// 종료 : 로그아웃, 파일로 저장
            memberService.logout();
            memberService.saveFile();
            break;
        case 1:
            member = new Member();
            member.setId(MemberController.tui.inputId()); // 1001번 증가되지 않는 오류 해결
            boolean isUnique; // 이메일 중복 확인
            String email = MemberController.tui.inputEmail();
            member.setEmail(email);
            member.setPw(MemberController.tui.inputPw());
            member.setName(MemberController.tui.inputName());
            member.setPhone(MemberController.tui.inputPhone());
            member.setAddress(MemberController.tui.inputAddress());
            while (!isValid(member)) //유효성 확인
                ;
            if(memberService.postMember(member) > 0)
                memberService.applyUpdate();
            else
                memberView.printFail("등록 ");
            break;
		}
	}while(menu != 0);
}

}
