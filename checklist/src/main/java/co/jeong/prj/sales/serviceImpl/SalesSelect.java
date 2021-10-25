package co.jeong.prj.sales.serviceImpl;

import co.jeong.prj.common.Command;
import co.jeong.prj.common.GB;
import co.jeong.prj.sales.service.SalesService;
import co.jeong.prj.sales.service.SalesVO;

public class SalesSelect implements Command {
	private SalesService dao = new SalesServiceImpl();
	
	@Override
	public void execute() {
		SalesVO sales = new SalesVO();
		System.out.println("=========================");
		System.out.println("조회할 납품상품을 입력하세요.");
		sales.setSalesname(scn.nextLine());
		System.out.println("=========================");
		System.out.println("납품상품이 납품된 회사명을 입력하세요.");
		sales.setSalescompany(scn.nextLine());
		sales = dao.salesSelect(sales);
	
		
		if(sales != null) {
			GB.salesacount = sales.getSalesacount();
			GB.salesname = sales.getSalesname();
			System.out.print("제품번호 : " + sales.getSalesnum() + " ");
			System.out.print("납품날짜 : " + sales.getSalesdate());
			System.out.print("종류 : " + sales.getSaleskind()+ " ");
			System.out.print("상품이름 : " + sales.getSalesname()+ " ");
			System.out.print("납품회사 : " + sales.getSalescompany()+ " ");
			System.out.print("납품가격 : " + sales.getSalesprice()+ " ");
			System.out.println("납품한 양 : " + sales.getSalesacount()+ " ");
		}else {
			System.out.println("잘못 입력하셨거나 없는 제품입니다.");
		}
	}

}
