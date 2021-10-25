package co.jeong.prj.product.service;

import java.util.List;



public interface ProductService {
	List<ProductVO> ProductSelectList();
	ProductVO ProductSelect(ProductVO vo);
	int ProductInsert(ProductVO vo);
	int ProductUpdate(ProductVO vo);
	int ProductDelete(ProductVO vo);
}
