package co.jeong.prj.common;

import co.jeong.prj.member.service.MemberService;
import co.jeong.prj.member.service.MemberVO;
import co.jeong.prj.member.serviceImpl.MemberServiceImpl;


public class Login {
	public void run() {
		
			MemberService dao = new MemberServiceImpl();
			MemberVO member;
			
			boolean b = false;
			do {
				member = new MemberVO();
				System.out.println("======로 그 인======");
				System.out.println("아이디를 입력하세요.");
				member.setId(GB.scn.nextLine());
				System.out.println("패스워드를 입력하세요.");
				member.setPassword(GB.scn.nextLine());
				member = dao.memberSelect(member);
				
				if (member != null) {
						GB.name= member.getName();
						GB.id = member.getId();
						GB.password = member.getPassword();
						GB.username = member.getUsername();
						GB.tel= member.getTel();
						GB.address = member.getAddress();
					
						b = true;
						
					} else {
						System.out.println("사용자의 아이디 또는 패스워드가 틀렸습니다.");
					}

			} while (!b);
	}

}
