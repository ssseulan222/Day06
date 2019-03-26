package com.food;

import java.util.Scanner;

public class FoodMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Food food=new Food();
		Food[]foods=new Food[3];
		
		System.out.println("첫번째 메뉴");
		foods[0]
		
		System.out.println("실행 할 번호 입력");
		int sel = sc.nextInt();
		boolean check = true;

		while (check) {
			switch (sel) {
			case 1:	//주문
				//---반복
				//메뉴 선택
				//개수 선택 (재고 개수)
				// * 같은 메뉴 선택 시 이전 주문 초기화
				//---반복 끝
				//종료
				//영수증 출력
				while(check) {
					
				}
				break;
				
			case 2:	//결산
				//라면 : 판매 개수 - 소합계
				//김밥 : 판매 개수 - 소합계
				//떡볶이 : 판매 개수 - 소합계
				//총 합계
				
				check=!check;	//결산 후 프로그램 종료
				break;
				
			default:
				System.out.println("잘못된 번호");
				break;
			}

		}
		
		
	}
}
