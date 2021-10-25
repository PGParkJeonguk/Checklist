package co.jeong.prj.product.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.product.service.ProductService;
import co.jeong.prj.product.service.ProductVO;

public class ProductDelete implements Command {
	private ProductService dao = new ProductServiceImpl();
	
	@Override
	public void execute() {
		ProductVO product = new ProductVO();
		
		System.out.println("===========================");
		System.out.println("삭제할 물품번호를 입력하세요.");
		product.setProductnum(scn.nextInt());
		
		int n = dao.ProductDelete(product);
		
		if (n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("입고제품 삭제에 실패하였습니다.");
		}		
	}

}
