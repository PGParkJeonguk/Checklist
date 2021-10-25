package co.jeong.prj.member.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.member.service.MemberService;
import co.jeong.prj.member.service.MemberVO;

public class MemberSelect implements Command {
	private MemberService dao = new MemberServiceImpl();
	
	@Override
	public void execute() {
		MemberVO member = new MemberVO();
		System.out.println("=========================");
		member.setId(scn.nextLine());
		member = dao.memberSelect(member); 
		
		if(member != null) {
			System.out.println("ID : " + member.getId());
			System.out.println("PASSWORD : " + member.getPassword());
			System.out.println("이름 : " + member.getName());
			System.out.println("전화번호 : " + member.getTel());
			System.out.println("주소 : " + member.getAddress());
			System.out.println("회사이름 : " + member.getUsername());
		}else {
			System.out.println("잘못 입력하셨거나 없는 유저입니다.");
		}
		
	}

}
