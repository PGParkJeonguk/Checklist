package co.jeong.prj.purchase.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.common.GB;
import co.jeong.prj.purchase.service.PurchaseService;
import co.jeong.prj.purchase.service.PurchaseVO;

public class PurchaseSelect implements Command {
	private PurchaseService dao = new PurchaseServiceImpl();

	@Override
	public void execute() {
		PurchaseVO purchase = new PurchaseVO();
		System.out.println("당신의 회사이름을 입력하세요.");
		purchase.setUsername(scn.nextLine());
		System.out.println("=========================");
		System.out.println("조회할 입고상품을 입력하세요.");
		purchase.setPurchasename(scn.nextLine());
		System.out.println("=========================");
		System.out.println("입고받은 회사명을 입력하세요.");
		purchase.setPurchasecompany(scn.nextLine());
		purchase = dao.purchaseSelect(purchase);

		if (purchase != null) {
			GB.purchaseacount = purchase.getPurchaseacount();
			GB.purchasename = purchase.getPurchasename();
			System.out.print("제품번호 : " + purchase.getPurchasenum() + " ");
			System.out.print("입고날짜 : " + purchase.getPurchasedate() + " ");
			System.out.print("입고회사 : " + purchase.getPurchasecompany() + " ");
			System.out.print("종류 : " + purchase.getPurchasekind() + " ");
			System.out.print("상품이름 : " + purchase.getPurchasename() + " ");
			System.out.print("입고가격 : " + purchase.getPurchaseprice() + " ");
			System.out.println("들어온 양 : " + purchase.getPurchaseacount() + " ");
		} else {
			System.out.println("잘못 입력하셨거나 없는 제품입니다.");
		}

	}

}
