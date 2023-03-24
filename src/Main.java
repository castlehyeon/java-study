
//추가기능 : 메뉴 안보여주기
import java.util.Scanner;

import kr.or.kosa.Beverage2;
import kr.or.kosa.Payment;
import kr.or.kosa.VendingMachine2;

class Util{

	
}

public class Main {
	public static void main(String[] args) {
		VendingMachine2 vm = new VendingMachine2();

		Beverage2 ame = new Beverage2(1, "아메리카노", 1000);
		Beverage2 latte = new Beverage2(2, "라떼", 1500);
		Beverage2 mango = new Beverage2(3, "망고주스", 2000);

		Scanner scanner = new Scanner(System.in);

		final int menu = 3;
		int control;
		boolean exit = false;

		do {
			System.out.println("1. 음료 구매 2. 재고충전 3. 종료 ");
			System.out.print("메뉴를 선택해주세요. : ");

			control = scanner.nextInt();

			Back:
			switch (control) {
			case 1:// 음료규매
				do {
					System.out.println("금액을 입력해주세요.");
					int inputMoney = scanner.nextInt();

					System.out.println("1. 아메리카노 2. 라떼 3. 망고쥬스 4. 취소");
					System.out.print("메뉴를 선택해주세요. : ");

					control = scanner.nextInt();
					Payment pm = new Payment();

					switch (control) {
					case 1: // 아메리카노
						if (inputMoney >= ame.getPrice()) {
							pm.returnChange(inputMoney - ame.getPrice());
							ame.minusCount();
							System.out.println("아메리카노 나왔습니다~");
						} else {
							pm.returnChange(inputMoney);//돈 반환
							System.out.println("다음에 오세요");
						}
						break Back;
					case 2: // 라떼
						latte.minusCount();
						break Back;
					case 3: // 망고쥬스
						mango.minusCount();
						break Back;
					case 4 : //메인메뉴로 돌아가기
						pm.returnChange(inputMoney);//돈 반환
						break Back;
					}

				} while (exit == false);

			case 2:
			case 3:
				System.out.print("종료합니다.");
				exit = true;
			}

		} while (exit == false);

	}
}
