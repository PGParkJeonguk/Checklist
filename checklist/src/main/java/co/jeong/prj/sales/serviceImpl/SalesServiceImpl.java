package co.jeong.prj.sales.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.jeong.prj.common.DataSource;
import co.jeong.prj.sales.service.SalesMapper;
import co.jeong.prj.sales.service.SalesService;
import co.jeong.prj.sales.service.SalesVO;

public class SalesServiceImpl implements SalesService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private SalesMapper map = sqlSession.getMapper(SalesMapper.class);

	@Override
	public List<SalesVO> salesSelectList() {
		return map.SalesSelectList();
	}

	@Override
	public SalesVO salesSelect(SalesVO vo) {
		return map.SalesSelect(vo);
	}

	@Override
	public int salesSelectInsert(SalesVO vo) {
		return map.SalesInsert(vo);
	}

	@Override
	public int salesSelectUpdate(SalesVO vo) {
		return map.SalesUpdate(vo);
	}

	@Override
	public int salesSelectDelete(SalesVO vo) {
		return map.SalesDelete(vo);
	}

}
