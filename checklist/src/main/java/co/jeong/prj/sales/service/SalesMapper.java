package co.jeong.prj.sales.service;

import java.util.List;

public interface SalesMapper {
	List<SalesVO> SalesSelectList();
	SalesVO SalesSelect(SalesVO vo);
	int SalesInsert(SalesVO vo);
	int SalesUpdate(SalesVO vo);
	int SalesDelete(SalesVO vo);
}
