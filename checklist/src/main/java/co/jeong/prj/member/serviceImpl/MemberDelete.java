package co.jeong.prj.member.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.member.service.MemberService;
import co.jeong.prj.member.service.MemberVO;

public class MemberDelete implements Command {
	private MemberService dao = new MemberServiceImpl();
	
	@Override
	public void execute() {
		MemberVO member = new MemberVO();
		System.out.println("삭제하고 싶은 아이디를 입력하세요.");
		member.setId(scn.nextLine());
		
		int n = dao.memberDelete(member);
		if (n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("아이디 삭제에 실패하였습니다.");
		}		
	}

}
