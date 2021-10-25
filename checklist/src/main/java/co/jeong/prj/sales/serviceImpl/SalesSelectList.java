package co.jeong.prj.sales.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.jeong.prj.common.Command;
import co.jeong.prj.sales.service.SalesService;
import co.jeong.prj.sales.service.SalesVO;

public class SalesSelectList implements Command {

	@Override
	public void execute() {
		SalesService dao = new SalesServiceImpl();
		List<SalesVO> sales = new ArrayList<SalesVO>();
		sales = dao.salesSelectList();
		System.out.println("=========================");
		if(sales != null) {
			for(SalesVO vo : sales) {
				System.out.print(vo.getSalesnum()+ " ");
				System.out.print(vo.getSalesdate() + " ");
				System.out.print(vo.getSalescompany()+ " ");
				System.out.print(vo.getSaleskind()+ " ");
				System.out.print(vo.getSalesname()+ " ");
				System.out.print(vo.getSalesprice()+ " ");
				System.out.println(vo.getSalesacount()+ " ");
			}
		}else {
			System.out.println("등록된 납품물품이 없습니다.");
		}
	}
}