package co.jeong.prj.member.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.member.service.MemberService;
import co.jeong.prj.member.service.MemberVO;

public class MemberInsert implements Command {
	private MemberService dao = new MemberServiceImpl();
	
	@Override
	public void execute() {
		MemberVO member = new MemberVO();
		System.out.println("=========================");
		System.out.println("생성하고자하는 아이디를 입력하세요.");
		member.setId(scn.nextLine());
		System.out.println("비밀번호를 입력하세요.");
		member.setPassword(scn.nextLine());
		System.out.println("이름을 입력하세요.");
		member.setName(scn.nextLine());
		System.out.println("전화번호를 입력하세요.");
		member.setTel(scn.nextLine());
		System.out.println("주소를 입력하세요.");
		member.setAddress(scn.nextLine());
		System.out.println("회사명을 입력하세요.");
		member.setUsername(scn.nextLine());
		
		int n = dao.memberInsert(member);
		
		if( n != 0 ) {
			System.out.println("정상적으로 생성되었습니다.");
		}else {
			System.out.println("생성에 실패하였습니다.");
		}
		
	}

}
