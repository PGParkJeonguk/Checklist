package co.jeong.prj.purchase.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.common.GB;
import co.jeong.prj.purchase.service.PurchaseService;
import co.jeong.prj.purchase.service.PurchaseVO;

public class PurchaseInsert implements Command {
	private PurchaseService dao = new PurchaseServiceImpl();
	@Override
	public void execute() {
		PurchaseVO purchase = new PurchaseVO();
		System.out.println("당신의 회사이름을 입력하세요.");
		purchase.setUsername(scn.nextLine());
		if(GB.username.equals(purchase.getUsername())) {
			System.out.println("=========================");
			System.out.println("입고물품종류를 입력하세요..");
			purchase.setPurchasekind(scn.nextLine());
			System.out.println("입고물품이름을 입력하세요.");
			purchase.setPurchasename(scn.nextLine());
			System.out.println("입고물품의 회사를 입력하세요.");
			purchase.setPurchasecompany(scn.nextLine());
			System.out.println("입고물품가격을 입력하세요.");
			purchase.setPurchaseprice(scn.nextInt());
			System.out.println("입고물품갯수를 입력하세요.");
			purchase.setPurchaseacount(scn.nextInt());
			purchase.setUsername(GB.username);
			
			int n = dao.purchaseInsert(purchase);
			
			if( n != 0 ) {
				System.out.println("정상적으로 생성되었습니다.");
			}else {
				System.out.println("생성에 실패하였습니다.");
			}
		}else {
			System.out.println("권한이 존재하지 않습니다.");
		}
		
	}

}
