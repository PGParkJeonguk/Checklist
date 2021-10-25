package co.jeong.prj.member.service;

import java.util.List;

public interface MemberMapper {
	List<MemberVO> MemberSelectList();
	MemberVO MemberSelect(MemberVO vo);
	int MemberInsert(MemberVO vo);
	int MemberUpdate(MemberVO vo);
	int MemberDelete(MemberVO vo);
}
