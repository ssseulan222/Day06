package com.food;

import java.util.Scanner;

public class FoodMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Food food = new Food();
		Food[] foods = new Food[3];

		for (int i = 0; i < foods.length; i++) {
			System.out.println(i+1 + "��° �޴�");
			food.menu = sc.next();
			System.out.println(i+1 + "��° �޴� ����");
			food.price = sc.nextInt();
			System.out.println(i+1 + "��° �޴� ���");
			food.save = sc.nextInt();
			foods[i]=food;
		}

		System.out.println("���� �� ��ȣ �Է�");
		int sel = sc.nextInt();
		boolean check = true;

		while (check) {
			switch (sel) {
			case 1: // �ֹ�
				// ---�ݺ�
				// �޴� ����
				// ���� ���� (��� ����)
				// * ���� �޴� ���� �� ���� �ֹ� �ʱ�ȭ
				// ---�ݺ� ��
				// ����
				// ������ ���
				while (check) {

				}
				break;

			case 2: // ���
				// ��� : �Ǹ� ���� - ���հ�
				// ��� : �Ǹ� ���� - ���հ�
				// ������ : �Ǹ� ���� - ���հ�
				// �� �հ�

				check = !check; // ��� �� ���α׷� ����
				break;

			default:
				System.out.println("�߸��� ��ȣ");
				break;
			}

		}

	}
}
