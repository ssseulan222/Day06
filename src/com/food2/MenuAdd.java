package com.food2;

import java.util.Scanner;

public class MenuAdd {

	public Food[] add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 개수를 입력하세요.");
		int count = sc.nextInt();
		Food[] foods = new Food[count];

		for (int i = 0; i < foods.length; i++) {
			Food food = new Food(); // 반복 돌 동안 새로운 food변수 foods.length만큼 생성, for문 위에 작성 시 하나만 저장됨!!

			System.out.println("음식명 입력");
			food.name = sc.next();
			System.out.println("가격 입력");
			food.price = sc.nextInt();
			System.out.println("판매할 양 (재고) 입력");
			food.amount = sc.nextInt();

			foods[i] = food;
		}
		
		return foods;
	}

}
