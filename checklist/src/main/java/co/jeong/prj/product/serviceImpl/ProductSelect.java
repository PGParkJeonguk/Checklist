package co.jeong.prj.product.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.common.GB;
import co.jeong.prj.product.service.ProductService;
import co.jeong.prj.product.service.ProductVO;

public class ProductSelect implements Command {
	private ProductService dao = new ProductServiceImpl();

	@Override
	public void execute() {
		ProductVO product = new ProductVO();
		System.out.println("============================");
		System.out.println("조회할 물품의 번호를 입력하세요.");
		product.setProductnum(scn.nextInt());
		product = dao.ProductSelect(product);
		if (product != null) {
			System.out.println("제품번호 : " + product.getProductnum());
			System.out.println("제품종류 : " + product.getProductkind());
			System.out.println("제품이름 : " + product.getProductname());
			System.out.println("제품가격 : " + product.getProductprice());
			System.out.println("제품재고 : " + (product.getProductstock() + GB.purchaseacount - GB.salesacount));
			product.setProductstock(product.getProductstock()+ GB.purchaseacount - GB.salesacount);
			System.out.println("제품납입회사 : " + product.getProductcompany());
		} else {
			System.out.println("잘못 입력하셨거나 없는 제품입니다.");
		}
	}

}
