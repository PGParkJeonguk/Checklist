package co.jeong.prj.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.jeong.prj.common.DataSource;
import co.jeong.prj.member.service.MemberMapper;
import co.jeong.prj.member.service.MemberService;
import co.jeong.prj.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	@Override
	public List<MemberVO> MemberSelectList() {
		return map.MemberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return map.MemberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.MemberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return map.MemberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		return map.MemberDelete(vo);
	}

}
