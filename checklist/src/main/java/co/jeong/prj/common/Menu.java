package co.jeong.prj.common;

import java.util.HashMap;
import java.util.Map;

import co.jeong.prj.member.serviceImpl.MemberDelete;
import co.jeong.prj.member.serviceImpl.MemberInsert;
import co.jeong.prj.member.serviceImpl.MemberSelect;
import co.jeong.prj.member.serviceImpl.MemberSelectList;
import co.jeong.prj.member.serviceImpl.MemberUpdate;
import co.jeong.prj.product.serviceImpl.ProductDelete;
import co.jeong.prj.product.serviceImpl.ProductInsert;
import co.jeong.prj.product.serviceImpl.ProductSelect;
import co.jeong.prj.product.serviceImpl.ProductSelectList;
import co.jeong.prj.product.serviceImpl.ProductUpdate;
import co.jeong.prj.purchase.serviceImpl.PurchaseDelete;
import co.jeong.prj.purchase.serviceImpl.PurchaseInsert;
import co.jeong.prj.purchase.serviceImpl.PurchaseSelect;
import co.jeong.prj.purchase.serviceImpl.PurchaseSelectList;
import co.jeong.prj.purchase.serviceImpl.PurchaseUpdate;
import co.jeong.prj.sales.serviceImpl.SalesDelete;
import co.jeong.prj.sales.serviceImpl.SalesInsert;
import co.jeong.prj.sales.serviceImpl.SalesSelect;
import co.jeong.prj.sales.serviceImpl.SalesSelectList;
import co.jeong.prj.sales.serviceImpl.SalesUpdate;



public class Menu {
	private Map<String, Command> map = new HashMap<String, Command>();

	public void Map() {
		map.put("MeberSelectList", new MemberSelectList());
		map.put("MemberSelect", new MemberSelect());
		map.put("MemberInsert", new MemberInsert());
		map.put("MemberUpdate", new MemberUpdate());
		map.put("MemberDelete", new MemberDelete());
		map.put("purchaseSelectList", new PurchaseSelectList());
		map.put("purchaseSelect", new PurchaseSelect());
		map.put("purchaseInsert", new PurchaseInsert());
		map.put("purchaseUpdate", new PurchaseUpdate());
		map.put("purchaseDelete", new PurchaseDelete());
		map.put("SalesSelectList", new SalesSelectList());
		map.put("SalesSelect", new SalesSelect());
		map.put("SalesInsert", new SalesInsert());
		map.put("SalesUpdate", new SalesUpdate());
		map.put("SalesDelete", new SalesDelete());
		map.put("ProductSelectList", new ProductSelectList());
		map.put("ProductSelect", new ProductSelect());
		map.put("ProductInsert", new ProductInsert());
		map.put("ProductUpdate", new ProductUpdate());
		map.put("ProductDelete", new ProductDelete());
	}

	private void menu() {
		while (true) {
			mainMenu();
			int jobNo = GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				if(GB.id.equals("jeonguk")) {
					memberMangement();
				}else {
					System.out.println("권한이 없습니다.");
				}
				break;
			case 2:
				if(!GB.id.equals("jeonguk")) {
					productMangement();
				}else {
					System.out.println("관리자는 데이터베이스에 접근하지 못합니다.");
				}
				break;
			case 3:
				if(!GB.id.equals("jeonguk")) {
				purchaseMangement();
				}else {
				System.out.println("관리자는 데이터베이스에 접근하지 못합니다.");
				}
				break;
			case 4:
				if(!GB.id.equals("jeonguk")) {
				salesMangement();
				}else {
				System.out.println("관리자는 데이터베이스에 접근하지 못합니다.");
				}
				break;
			case 5:	
				System.out.println("프로그램 완전히 종료합니다.");
				GB.scn.close();
				return;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		}
	}
	
	private void productMangement() {
		boolean b = false;
		do {
			productTitle();
			int jobNo = GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				executRun("ProductSelectList");
				break;
			case 2:
				executRun("ProductSelect");
				break;
			case 3:
				executRun("ProductInsert");
				break;
			case 4:
				executRun("ProductUpdate");
				break;
			case 5:
				executRun("ProductDelete");
			case 6:
				System.out.println("메뉴화면으로 돌아갑니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		} while (!b);

	}

	private void purchaseMangement() {
		boolean b = false;
		do {
			purchaseTitle();
			int jobNo = GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				executRun("purchaseSelectList");
				break;
			case 2:
				executRun("purchaseSelect");
				break;
			case 3:
				executRun("purchaseInsert");
				break;
			case 4:
				executRun("purchaseUpdate");
				break;
			case 5:
				executRun("purchaseDelete");
				break;
			case 6:
				System.out.println("메뉴화면으로 돌아갑니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		} while (!b);
	}

	private void memberMangement() {
		boolean b = false;
		do {
			memberTitle();
			int jobNo = GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				executRun("MeberSelectList");
				break;
			case 2:
				executRun("MemberSelect");
				break;
			case 3:
				executRun("MemberInsert");
				break;
			case 4:
				executRun("MemberUpdate");
				break;
			case 5:
				executRun("MemberDelete");
			case 6:
				System.out.println("메뉴화면으로 돌아갑니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		} while (!b);

	}
	
	private void salesMangement() {
		boolean b = false;
		do {
			salesTitle();
			int jobNo = GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				executRun("SalesSelectList");
				break;
			case 2:
				executRun("SalesSelect");
				break;
			case 3:
				executRun("SalesInsert");
				break;
			case 4:
				executRun("SalesUpdate");
				break;
			case 5:
				executRun("SalesDelete");
			case 6:
				System.out.println("메뉴화면으로 돌아갑니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		} while (!b);

	}

	private void mainMenu() {
		System.out.println("====================================");
		System.out.println("지금 접속한 아이디는 " + GB.id + " 입니다.");
		System.out.println("지금 접속한 아이디의 이름은 " + GB.name + " 입니다.");
		System.out.println("지금 접속한 회사명은 " + GB.username + " 입니다.");
		System.out.println("====================================");
		
		System.out.println("==================");
		System.out.println("=== 1. 멤버 관리 ===");
		System.out.println("=== 2. 제품 관리 ===");
		System.out.println("=== 3. 입고 관리 ===");
		System.out.println("=== 4. 출고 관리 ===");
		System.out.println("====5. 종    료 ====");
		System.out.println("==================");
		System.out.println("작업번호를 넣어주세요");
	}

	private void purchaseTitle() {
		System.out.println("====================");
		System.out.println("=== 1. 입고물품 목록 ===");
		System.out.println("=== 2. 입고물품 조회 ===");
		System.out.println("=== 3. 입고물품 등록 ===");
		System.out.println("=== 4. 입고물품 수정 ===");
		System.out.println("=== 5. 입고물품 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("====================");
		System.out.println("작업번호를 넣어주세요");

	}

	private void memberTitle() {
		System.out.println("=====================");
		System.out.println("=== 1. 회원목록 조회 ===");
		System.out.println("=== 2. 회원정보 조회 ===");
		System.out.println("=== 3. 회원정보 등록 ===");
		System.out.println("=== 4. 회원정보 수정 ===");
		System.out.println("=== 5. 회원정보 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("=====================");
		System.out.println("작업번호를 넣어주세요");
	}
	
	private void salesTitle() {
		System.out.println("=====================");
		System.out.println("=== 1. 출고목록 조회 ===");
		System.out.println("=== 2. 출고정보 조회 ===");
		System.out.println("=== 3. 출고정보 등록 ===");
		System.out.println("=== 4. 출고정보 수정 ===");
		System.out.println("=== 5. 출고정보 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("=====================");
		System.out.println("작업번호를 넣어주세요");
	}

	private void productTitle(){
		System.out.println("제품정보조회를 하시려면 먼저 입고정보조회와 출고정보조회를 먼저하세요.");
		System.out.println("=====================");
		System.out.println("=== 1. 제품목록 조회 ===");
		System.out.println("=== 2. 제품정보 조회 ===");
		System.out.println("=== 3. 제품정보 등록 ===");
		System.out.println("=== 4. 제품정보 수정 ===");
		System.out.println("=== 5. 제품정보 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("=====================");
		System.out.println("작업번호를 넣어주세요");
	}
	
	private void executRun(String str) {
		Command command = map.get(str);
		command.execute();
	}

	public void run() {
		Map();
		menu();
	}
}
