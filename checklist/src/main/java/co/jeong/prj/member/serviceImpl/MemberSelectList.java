package co.jeong.prj.member.serviceImpl;


import java.util.ArrayList;
import java.util.List;

import co.jeong.prj.common.Command;
import co.jeong.prj.member.service.MemberService;
import co.jeong.prj.member.service.MemberVO;

public class MemberSelectList implements Command {

	@Override
	public void execute() {
		MemberService dao = new MemberServiceImpl();
		List<MemberVO> member = new ArrayList<MemberVO>();
		member = dao.MemberSelectList();
		System.out.println("=======================");
		if(member != null) {
			for(MemberVO vo : member) {
				System.out.println(vo.getId());
				System.out.println(vo.getPassword());
				System.out.println(vo.getName());
				System.out.println(vo.getTel());
				System.out.println(vo.getAddress());
				System.out.println(vo.getUsername());
			}
		}
	}

}
