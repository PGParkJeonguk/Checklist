package co.jeong.prj.member.service;

import java.util.List;

public interface MemberService {
	List<MemberVO> MemberSelectList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
}
