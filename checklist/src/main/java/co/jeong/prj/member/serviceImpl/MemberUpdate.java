package co.jeong.prj.member.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.member.service.MemberService;
import co.jeong.prj.member.service.MemberVO;

public class MemberUpdate implements Command {
	private MemberService dao = new MemberServiceImpl();  
	
	@Override
	public void execute() {
		MemberVO member = new MemberVO();
		System.out.println("변경하고자 하는 아이디를 입력하세요.");
		member.setId(scn.nextLine());
		System.out.println("변경하고 싶은 이름을 입력하세요.");
		member.setName(scn.nextLine());
		System.out.println("변경하고 싶은 전화번호를 입력하세요.");
		member.setTel(scn.nextLine());
		System.out.println("변경하고 싶은 주소를 입력하세요.");
		member.setAddress(scn.nextLine());
		System.out.println("변경하고 싶은 회사명을 입력하세요.");
		member.setUsername(scn.nextLine());
		
		int n = dao.memberUpdate(member);
		
		if( n != 0) {
			System.out.println("정상적으로 변경되었습니다.");
		}else {
			System.out.println("변경에 실패하였습니다.");
		}	

	}

}
