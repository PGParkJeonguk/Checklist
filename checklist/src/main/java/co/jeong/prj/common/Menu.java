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
					System.out.println("????????? ????????????.");
				}
				break;
			case 2:
				if(!GB.id.equals("jeonguk")) {
					productMangement();
				}else {
					System.out.println("???????????? ????????????????????? ???????????? ????????????.");
				}
				break;
			case 3:
				if(!GB.id.equals("jeonguk")) {
				purchaseMangement();
				}else {
				System.out.println("???????????? ????????????????????? ???????????? ????????????.");
				}
				break;
			case 4:
				if(!GB.id.equals("jeonguk")) {
				salesMangement();
				}else {
				System.out.println("???????????? ????????????????????? ???????????? ????????????.");
				}
				break;
			case 5:	
				System.out.println("???????????? ????????? ???????????????.");
				GB.scn.close();
				return;
			default:
				System.out.println("????????? ?????? ?????????????????????.");
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
				System.out.println("?????????????????? ???????????????.");
				b = true;
				break;
			default:
				System.out.println("????????? ?????? ?????????????????????.");
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
				System.out.println("?????????????????? ???????????????.");
				b = true;
				break;
			default:
				System.out.println("????????? ?????? ?????????????????????.");
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
				System.out.println("?????????????????? ???????????????.");
				b = true;
				break;
			default:
				System.out.println("????????? ?????? ?????????????????????.");
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
				System.out.println("?????????????????? ???????????????.");
				b = true;
				break;
			default:
				System.out.println("????????? ?????? ?????????????????????.");
			}
		} while (!b);

	}

	private void mainMenu() {
		System.out.println("====================================");
		System.out.println("?????? ????????? ???????????? " + GB.id + " ?????????.");
		System.out.println("?????? ????????? ???????????? ????????? " + GB.name + " ?????????.");
		System.out.println("?????? ????????? ???????????? " + GB.username + " ?????????.");
		System.out.println("====================================");
		
		System.out.println("==================");
		System.out.println("=== 1. ?????? ?????? ===");
		System.out.println("=== 2. ?????? ?????? ===");
		System.out.println("=== 3. ?????? ?????? ===");
		System.out.println("=== 4. ?????? ?????? ===");
		System.out.println("====5. ???    ??? ====");
		System.out.println("==================");
		System.out.println("??????????????? ???????????????");
	}

	private void purchaseTitle() {
		System.out.println("====================");
		System.out.println("=== 1. ???????????? ?????? ===");
		System.out.println("=== 2. ???????????? ?????? ===");
		System.out.println("=== 3. ???????????? ?????? ===");
		System.out.println("=== 4. ???????????? ?????? ===");
		System.out.println("=== 5. ???????????? ?????? ===");
		System.out.println("=== 6. ???????????? ?????? ===");
		System.out.println("====================");
		System.out.println("??????????????? ???????????????");

	}

	private void memberTitle() {
		System.out.println("=====================");
		System.out.println("=== 1. ???????????? ?????? ===");
		System.out.println("=== 2. ???????????? ?????? ===");
		System.out.println("=== 3. ???????????? ?????? ===");
		System.out.println("=== 4. ???????????? ?????? ===");
		System.out.println("=== 5. ???????????? ?????? ===");
		System.out.println("=== 6. ???????????? ?????? ===");
		System.out.println("=====================");
		System.out.println("??????????????? ???????????????");
	}
	
	private void salesTitle() {
		System.out.println("=====================");
		System.out.println("=== 1. ???????????? ?????? ===");
		System.out.println("=== 2. ???????????? ?????? ===");
		System.out.println("=== 3. ???????????? ?????? ===");
		System.out.println("=== 4. ???????????? ?????? ===");
		System.out.println("=== 5. ???????????? ?????? ===");
		System.out.println("=== 6. ???????????? ?????? ===");
		System.out.println("=====================");
		System.out.println("??????????????? ???????????????");
	}

	private void productTitle(){
		System.out.println("????????????????????? ???????????? ?????? ????????????????????? ????????????????????? ???????????????.");
		System.out.println("=====================");
		System.out.println("=== 1. ???????????? ?????? ===");
		System.out.println("=== 2. ???????????? ?????? ===");
		System.out.println("=== 3. ???????????? ?????? ===");
		System.out.println("=== 4. ???????????? ?????? ===");
		System.out.println("=== 5. ???????????? ?????? ===");
		System.out.println("=== 6. ???????????? ?????? ===");
		System.out.println("=====================");
		System.out.println("??????????????? ???????????????");
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
