package com.food2;

public class MenuView {

	public void orderView(Food[] foods, int[] counts) { // 영수증 출력

		int sum = 0;

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0) {
				System.out.println("구매내역");
				System.out.println("메뉴명: " + foods[i].name);
				System.out.println("단가 : " + foods[i].price);
				System.out.println("구매수량 : " + counts[i]);
				System.out.println("합계 : " + foods[i].price * counts[i]);
				sum = sum + foods[i].price * counts[i];
				foods[i].count = foods[i].count + counts[i];
				System.out.println("----------------------");
			}
		}
		System.out.println("총합계 : " + sum);

	}

	public void count(Food[] foods) { // 결산출력
		int sum = 0;
		if (foods.counts[i] > 0) {
			for (int i = 0; i < foods.length; i++) {
				System.out.println("메뉴명: " + foods[i].name);
				System.out.println("판매수 : " + foods[i].count);
				System.out.println("판매액 : " + foods[i].count * foods[i].price);
				sum = sum + foods[i].count * foods[i].price;
				System.out.println("------------------------");
			}
			System.out.println("총 판매액 : "+sum);
		}
		System.out.println("결산을 진행합니다.");
	}

}
