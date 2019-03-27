package com.food;

import java.util.Scanner;

public class FoodMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		Food food = new Food();
//		Food[] foods = new Food[3];
//		
//		FoodInput fi = new FoodInput();
//		FoodInput [] fis=new FoodInput[3];

		Food[] foods = new Food[3];
		int[] amount = new int[3];
		int[] price = new int[3];
		int[] totalPrice = new int[3];

		for (int i = 0; i < foods.length; i++) {
			Food food = new Food();
			System.out.println(i + 1 + "번째 메뉴");
			food.menu = sc.next();
			System.out.println(i + 1 + "번째 메뉴 가격");
			food.price = sc.nextInt();
			System.out.println(i + 1 + "번째 메뉴 재고");
			food.save = sc.nextInt();
			foods[i] = food;
		}
		for (int i = 0; i < foods.length; i++) {
			System.out.println("메   뉴 : " + foods[i].menu);
			System.out.println("가   격 : " + foods[i].price);
			System.out.println("재고량 : " + foods[i].save);
		}

		System.out.println("주문하시겠습니까?");
		System.out.println("1-주문 / 2-결산");
		int sel = sc.nextInt();
		boolean check = true;

		if (sel == 1) {
			while (check) {
				System.out.println("1-" + foods[0].menu);
				System.out.println("2-" + foods[1].menu);
				System.out.println("3-" + foods[2].menu);
				System.out.println("4-종료");

				sel = sc.nextInt();

				switch (sel) {

				case 1:
					System.out.println(foods[0].menu + " 주문");
					System.out.println("개수 : ");
					amount[0] = sc.nextInt();
					totalPrice[0] = amount[0] * foods[0].price;
					break;
				case 2:
					System.out.println(foods[1].menu + " 주문");
					System.out.println("개수 : ");
					amount[1] = sc.nextInt();
					totalPrice[1] = amount[1] * foods[1].price;
					break;
				case 3:
					System.out.println(foods[2].menu + " 주문");
					System.out.println("개수 : ");
					amount[2] = sc.nextInt();
					totalPrice[2] = amount[2] * foods[2].price;
					break;	 
				default:
					// 영수증
					if (amount[0] != 0) {
						System.out.println(foods[0].menu + " : " + amount[0] + "--" + totalPrice[0]);
					}
					if (amount[1] != 0) {
						System.out.println(foods[1].menu + " : " + amount[1] + "--" + totalPrice[1]);
					}
					if (amount[2] != 0) {
						System.out.println(foods[2].menu + " : " + amount[2] + "--" + totalPrice[2]);
					}
					check = !check;
					break;

				}

			}
		} else if (sel == 2) {
			System.out.println("결산내역");

		}

//			switch (sel) {
//			case 1: // 주문
//				// ---반복
//				// 메뉴 선택
//				// 개수 선택 (재고 개수)
//				// * 같은 메뉴 선택 시 이전 주문 초기화
//				// ---반복 끝
//				// 종료
//				// 영수증 출력
//				while (check) {
//
//					System.out.println("1-" + foods[0].menu);
//					System.out.println("2-" + foods[1].menu);
//					System.out.println("3-" + foods[2].menu);
//					System.out.println("4-종료");
//					int select = sc.nextInt();
//					switch (select) {
//					case 1:
//						fi.sel(select);
//						System.out.println(fis);
//						break;
//					case 2:
//						break;
//					case 3:
//						break;
//					case 4:
//						break;
//					default:
//						break;
//					}
//
//				}
//				break;
//
//			case 2: // 결산
//				// 라면 : 판매 개수 - 소합계
//				// 김밥 : 판매 개수 - 소합계
//				// 떡볶이 : 판매 개수 - 소합계
//				// 총 합계
//
//				check = !check; // 결산 후 프로그램 종료
//				break;
//
//			default:
//				System.out.println("잘못된 번호");
//				break;
//			}
//
//		}

	}
}