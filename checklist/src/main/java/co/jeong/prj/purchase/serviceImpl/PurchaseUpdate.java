package co.jeong.prj.purchase.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.common.GB;
import co.jeong.prj.purchase.service.PurchaseService;
import co.jeong.prj.purchase.service.PurchaseVO;

public class PurchaseUpdate implements Command {
	private PurchaseService dao = new PurchaseServiceImpl();

	@Override
	public void execute() {
		PurchaseVO purchase = new PurchaseVO();
		System.out.println("당신의 회사이름을 입력하세요.");
		purchase.setUsername(scn.nextLine());
		if (GB.username.equals(purchase.getUsername())) {
			System.out.println("=============================");
			System.out.println("변경할 입고물품번호를 입력하세요.");
			purchase.setPurchasenum(scn.nextInt());
			scn.nextLine();
			System.out.println("변경할 입고물품종류를 입력하세요.");
			purchase.setPurchasekind(scn.nextLine());
			System.out.println("변경할 입고물품이름을 입력하세요.");
			purchase.setPurchasename(scn.nextLine());
			System.out.println("변경할 입고회사명을 입력하세요.");
			purchase.setPurchasecompany(scn.nextLine());
			System.out.println("변경할 입고물품가격을 입력하세요.");
			purchase.setPurchaseprice(scn.nextInt());
			System.out.println("변경할 입고물품수량을 입력하세요.");
			purchase.setPurchaseacount(scn.nextInt());

			int n = dao.purchaseUpdate(purchase);
			if (n != 0) {
				System.out.println("정상적으로 변경되었습니다.");
			} else {
				System.out.println("변경에 실패하였습니다.");
			}
		} else {
			System.out.println("계정에 권한이 없습니다.");

		}
	}

}
