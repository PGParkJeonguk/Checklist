package co.jeong.prj.product.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.common.GB;
import co.jeong.prj.product.service.ProductService;
import co.jeong.prj.product.service.ProductVO;

public class ProductInsert implements Command {
	private ProductService dao = new ProductServiceImpl();
	
	@Override
	public void execute() {
		ProductVO product = new ProductVO();
		System.out.println("============================");
		System.out.println("추가할 물품의 종류을 입력하세요.");
		product.setProductkind(scn.nextLine());
		System.out.println("추가할 물품의 이름을 입력하세요.");
		product.setProductname(scn.nextLine());
		System.out.println("추가할 물품의 가격을 입력하세요.");
		product.setProductprice(scn.nextInt());
		scn.nextLine();
		System.out.println("추가할 물품의 재고를 입력하세요.");
		product.setProductstock(scn.nextInt());
		scn.nextLine();
		System.out.println("추가할 물품이 들어오는 회사를 입력하세요.");
		product.setProductcompany(scn.nextLine());
		product.setProductname(GB.username);
		
		int n = dao.ProductInsert(product);
		
		if( n != 0 ) {
			System.out.println("정상적으로 생성되었습니다.");
		}else {
			System.out.println("생성에 실패하였습니다.");
		}
	}

}
