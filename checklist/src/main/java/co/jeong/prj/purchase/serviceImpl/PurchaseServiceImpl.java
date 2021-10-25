package co.jeong.prj.purchase.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.jeong.prj.common.DataSource;
import co.jeong.prj.purchase.service.PurchaseMapper;
import co.jeong.prj.purchase.service.PurchaseService;
import co.jeong.prj.purchase.service.PurchaseVO;

public class PurchaseServiceImpl implements PurchaseService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private PurchaseMapper map = sqlSession.getMapper(PurchaseMapper.class);
	
	@Override
	public List<PurchaseVO> PurchaseSelectList() {
		return map.purchaseSelectList();
	}

	@Override
	public PurchaseVO purchaseSelect(PurchaseVO vo) {
		return map.purchaseSelect(vo);
	}

	@Override
	public int purchaseInsert(PurchaseVO vo) {
		return map.purchaseInsert(vo);
	}

	@Override
	public int purchaseUpdate(PurchaseVO vo) {
		return map.purchaseUpdate(vo);
	}

	@Override
	public int purchaseDelete(PurchaseVO vo) {
		return map.purchaseDelete(vo);
	}

}
