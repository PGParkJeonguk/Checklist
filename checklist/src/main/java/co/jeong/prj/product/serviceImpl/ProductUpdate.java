package co.jeong.prj.product.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.product.service.ProductService;
import co.jeong.prj.product.service.ProductVO;

public class ProductUpdate implements Command {
	private ProductService dao = new ProductServiceImpl();
	
	@Override
	public void execute() {
		ProductVO product = new ProductVO();
		System.out.println("===========================");
		System.out.println("변경할 물품번호를 입력하세요.");
		product.setProductnum(scn.nextInt());
		scn.nextLine();
		System.out.println("어떤 종류로 변경시킬지 입력하세요.");
		product.setProductkind(scn.nextLine());
		System.out.println("어떤 이름으로 변경시킬지 입력하세요.");
		product.setProductname(scn.nextLine());
		System.out.println("어떤 가격으로 변경시킬지 입력하세요.");
		product.setProductprice(scn.nextInt());
		scn.nextLine();
		System.out.println("변경된 재고량을 입력해주세요.");
		product.setProductstock(scn.nextInt());
		scn.nextLine();
		System.out.println("어떤 입고회사로 변경시킬지 입력하세요.");
		product.setProductcompany(scn.nextLine());
		
		int n = dao.ProductUpdate(product);
		
		if (n != 0) {
			System.out.println("정상적으로 변경되었습니다.");
		} else {
			System.out.println("변경에 실패하였습니다.");
		}

	}

}
