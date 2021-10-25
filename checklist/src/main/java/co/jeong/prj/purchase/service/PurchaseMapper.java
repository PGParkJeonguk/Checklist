package co.jeong.prj.purchase.service;

import java.util.List;

public interface PurchaseMapper {
	List<PurchaseVO> purchaseSelectList();
	PurchaseVO purchaseSelect(PurchaseVO vo);
	int purchaseInsert(PurchaseVO vo);
	int purchaseUpdate(PurchaseVO vo);
	int purchaseDelete(PurchaseVO vo);
	
}
