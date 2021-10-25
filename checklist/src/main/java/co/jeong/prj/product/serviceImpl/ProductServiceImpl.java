package co.jeong.prj.product.serviceImpl;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.jeong.prj.common.DataSource;
import co.jeong.prj.product.service.ProductMapper;
import co.jeong.prj.product.service.ProductService;
import co.jeong.prj.product.service.ProductVO;


public class ProductServiceImpl implements ProductService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private ProductMapper map = sqlSession.getMapper(ProductMapper.class);
	
	@Override
	public List<ProductVO> ProductSelectList() {
		return map.ProductSelectList();
	}

	@Override
	public ProductVO ProductSelect(ProductVO vo) {
		return map.ProductSelect(vo);
	}

	@Override
	public int ProductInsert(ProductVO vo) {
		return map.ProductInsert(vo);
	}

	@Override
	public int ProductUpdate(ProductVO vo) {
		return map.ProductUpdate(vo);
	}

	@Override
	public int ProductDelete(ProductVO vo) {
		return map.ProductDelete(vo);
	}

}
