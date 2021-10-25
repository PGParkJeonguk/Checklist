package co.jeong.prj.purchase.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.purchase.service.PurchaseService;
import co.jeong.prj.purchase.service.PurchaseVO;

public class PurchaseDelete implements Command {
	private PurchaseService dao = new PurchaseServiceImpl();

	@Override
	public void execute() {
		PurchaseVO purchase = new PurchaseVO();
		System.out.println("=========================");
		System.out.println("삭제할 제품번호를 입력하세요.");
		purchase.setPurchasenum(scn.nextInt());
		
		int n = dao.purchaseDelete(purchase);
		if (n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("입고제품 삭제에 실패하였습니다.");
		}		
		
	}

}
