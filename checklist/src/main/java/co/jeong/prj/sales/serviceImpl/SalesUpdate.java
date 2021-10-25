package co.jeong.prj.sales.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.sales.service.SalesService;
import co.jeong.prj.sales.service.SalesVO;

public class SalesUpdate implements Command {
	private SalesService dao = new SalesServiceImpl();

	@Override
	public void execute() {
		SalesVO sales = new SalesVO();
		System.out.println("=============================");
		System.out.println("변경할 제품번호를 입력하세요.");
		sales.setSalesnum(scn.nextInt());
		scn.nextLine();
		System.out.println("변경할 납품한 제품의 종류를 입력하세요.");
		sales.setSaleskind(scn.nextLine());
		System.out.println("변경할 납품한 제품의 이름을 입력하세요.");
		sales.setSalesname(scn.nextLine());
		System.out.println("변경할 납품회사명을 입력하세요.");
		sales.setSalescompany(scn.nextLine());
		System.out.println("변경할 납품한 제품의 가격을 입력하세요.");
		sales.setSalesprice(scn.nextInt());
		System.out.println("변경할 납품한 제품의출고수량을 입력하세요.");
		sales.setSalesacount(scn.nextInt());
		scn.nextLine();
		System.out.println("변경해야하는 납품날짜를 입력하세요.");
		sales.setSalesdate(scn.nextLine());
		
		int n = dao.salesSelectUpdate(sales);
		if (n != 0) {
			System.out.println("정상적으로 변경되었습니다.");
		} else {
			System.out.println("변경에 실패하였습니다.");
		}
	}

}
