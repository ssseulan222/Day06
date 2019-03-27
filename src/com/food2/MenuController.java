package com.food2;

import java.util.Scanner;

public class MenuController {

	public void start() { // 처음 메뉴 선택
		// 1. 메뉴 등록
		MenuAdd menuAdd = new MenuAdd();
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		MenuView menuCount = new MenuView();

		Food[] foods = menuAdd.add();
		int[] counts = new int[foods.length];

		while (check) {
			System.out.println("1. 음식주문");
			System.out.println("2. 최종결산");
			int select = sc.nextInt();

			if (select == 1) {
				while (check) {
					for (int i = 0; i < foods.length; i++) {
						System.out.println(i + 1 + ". " + foods[i].name + " : " + foods[i].price);
					}
					System.out.println(foods.length + 1 + ". 주문하기");
					select = sc.nextInt();
					if (select <= foods.length) {
						System.out.println("주문 수량 입력.");
						counts[select - 1] = sc.nextInt(); // 같은 주문 또 하면 수량 초기화
					} else {
						//영수증 출력
						menuCount.orderView(foods, counts);
						break;
					}
				}
			} else {
				menuCount.count(foods);
				break; // check=!check; , check=false
			}
		}

	}
}
