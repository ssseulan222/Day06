package com.food; //손님 주문 내역

import java.util.Scanner;

public class FoodInput {

//	int amount;
//	int sell;
//	int save=amount-sell;
	Food food = new Food();
	Food[] foods = new Food[3];
	
	FoodInput fi = new FoodInput();
	FoodInput [] fis=new FoodInput[3];

	int menuSel; // 손님이 선택한 메뉴
	int amountSel; // 선택한 개수
	int saveSel; // 남은 재고량
	
	public FoodInput[] sel(int select) {


		
		Scanner sc=new Scanner(System.in);
		System.out.println(foods[select-1].menu+" 주문 갯수 입력");
		fi.amountSel = sc.nextInt();
		fi.saveSel=foods[select-1].save-fis[select-1].amountSel;
		fis[select-1]=fi;
		return fis;
	}

}
