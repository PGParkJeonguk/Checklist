package co.jeong.prj.sales.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.common.GB;
import co.jeong.prj.sales.service.SalesService;
import co.jeong.prj.sales.service.SalesVO;

public class SalesInsert implements Command {
	private SalesService dao = new SalesServiceImpl();
	
	@Override
	public void execute() {
		SalesVO sales = new SalesVO();
		System.out.println("=========================");
		System.out.println("종류를 입력하세요.");
		sales.setSaleskind(scn.nextLine());
		System.out.println("제품이름을 입력하세요.");
		sales.setSalesname(scn.nextLine());
		System.out.println("납품회사를 입력하세요.");
		sales.setSalescompany(scn.nextLine());
		sales.setSalesclass(0);
		System.out.println("제품납품가격을 입력하세요.");
		sales.setSalesprice(scn.nextInt());
		scn.nextLine();
		System.out.println("제품납품갯수를 입력하세요.");
		sales.setSalesacount(scn.nextInt());
		sales.setUsername(GB.username);
		scn.nextLine();	
		System.out.println("납품날짜를 입력하세요.");
		sales.setSalesdate(scn.nextLine());

		int n = dao.salesSelectInsert(sales);
		
		if (n != 0) {
			System.out.println("정상적으로 생성되었습니다.");
		} else {
			System.out.println("생성에 실패하였습니다.");
		}
	}

}
