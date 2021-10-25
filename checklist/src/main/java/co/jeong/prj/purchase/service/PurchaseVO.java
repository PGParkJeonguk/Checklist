package co.jeong.prj.purchase.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PurchaseVO {
	int purchasenum;
	Date purchasedate;
	String purchasecompany;
	String purchasekind;
	String purchasename;
	int purchaseprice;
	int purchaseacount;
	String username;
	
}
