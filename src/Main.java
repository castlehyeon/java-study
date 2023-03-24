import java.util.Scanner;

import kr.or.kosa.Beverage2;
import kr.or.kosa.Payment;

class Util {
	// 음료구매 함수
	public void buy(int inputMoney, Beverage2 beverage) {
		if (inputMoney >= beverage.getPrice()) {
			System.out.printf("%s 나왔습니다~\n\n", beverage.getName());
			beverage.minusCount();
			returnChange(inputMoney - beverage.getPrice());
		} else {
			returnChange(inputMoney);// 돈 반환
			System.out.println("돈이 부족합니다. 나중에 다시 방문해주세요!");
		}
	}

	// 잔돈반환 함수
	public void returnChange(int money) {
		Payment pm = new Payment();
		System.out.print("< 거스름돈 > \n");
		pm.returnChange(money);
		System.out.println("=================");
		
	}

	public String setMenu(int inputMoney, Beverage2 beverage) {
		final String red = "\u001B[31m";
		final String exit = "\u001B[0m";

		String str = "";
		str += beverage.getControl() + ". " + beverage.getName() + "[" + beverage.getPrice() + "]\t\t";
		if (inputMoney < beverage.getPrice()) {
			str = red + str + exit;
		}
		return str;
	}
}

public class Main {
	public static void main(String[] args) {
		Util util = new Util();
		Scanner scanner = new Scanner(System.in);

		int control;
		boolean exit = false;

		Beverage2 ame = new Beverage2(1, "아메리카노", 1000);
		Beverage2 latte = new Beverage2(2, "라떼", 1500);
		Beverage2 mango = new Beverage2(3, "망고주스", 2000);

		do {

			System.out.println("1. 음료 구매 2. 재고충전 3. 종료 ");
			System.out.print("메뉴를 선택해주세요. : ");

			control = scanner.nextInt();

			Back: switch (control) {
			case 1:// 음료구매
				do {
					System.out.println("금액을 입력해주세요.");
					int inputMoney = scanner.nextInt();

					// 메뉴판
					String menuStr = "";
					menuStr += util.setMenu(inputMoney, ame);
					menuStr += util.setMenu(inputMoney, latte);
					menuStr += util.setMenu(inputMoney, mango);
					menuStr += "0. 취소";
					System.out.println(menuStr);

					// System.out.println("1. 아메리카노[1000원] 2. 라떼[1500원] 3. 망고쥬스[2000원] 0. 취소");
					System.out.print("메뉴를 선택해주세요. : ");

					control = scanner.nextInt();

					switch (control) {
					case 1: // 아메리카노
						util.buy(inputMoney, ame);
						break Back;
					case 2: // 라떼
						util.buy(inputMoney, latte);
						break Back;
					case 3: // 망고쥬스
						util.buy(inputMoney, mango);
						break Back;
					case 0: // 메인메뉴로 돌아가기
						util.returnChange(inputMoney);// 돈 반환
						break Back;
					}

				} while (exit == false);

			case 2: // 재고충전
			case 3:
				System.out.print("종료합니다.");
				exit = true;
			}

		} while (exit == false);
	}

}
