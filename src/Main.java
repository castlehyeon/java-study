
//추가기능 : 메뉴 안보여주기
import java.util.Scanner;

import kr.or.kosa.Beverage2;
import kr.or.kosa.Payment;
import kr.or.kosa.VendingMachine2;

<<<<<<< HEAD
class Util {

=======
class Util{
	//음료구매 함수
	public void buy(int inputMoney,Beverage2 beverage){
		if (inputMoney >= beverage.getPrice()) {
			System.out.printf("%s 나왔습니다~\n\n",beverage.getName());
			beverage.minusCount();
			returnChange(inputMoney - beverage.getPrice());
		} else {
			returnChange(inputMoney);//돈 반환
			System.out.println("돈이 부족합니다. 나중에 다시 방문해주세요!");
		}
	}
	
	//잔돈반환 함수
	public void returnChange(int money) {
		Payment pm = new Payment();
		pm.returnChange(money);
	}
>>>>>>> b995432d4a6d7e05f3244a7b73432bbe80a0d28b
}

public class Main {
	public static void main(String[] args) {
		Util util = new Util();

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

			Back: switch (control) {
			case 1:// 음료규매
				do {
					System.out.println("금액을 입력해주세요.");
					int inputMoney = scanner.nextInt();

					System.out.println("1. 아메리카노[1000원] 2. 라떼[1500원] 3. 망고쥬스[2000원] 4. 취소");
					System.out.print("메뉴를 선택해주세요. : ");

					control = scanner.nextInt();

					switch (control) {
					case 1: // 아메리카노
<<<<<<< HEAD
						if (inputMoney >= ame.getPrice()) {
							pm.returnChange(inputMoney - ame.getPrice());
							ame.minusCount();
							System.out.println("아메리카노 나왔습니다~");
						} else {
							pm.returnChange(inputMoney);// 돈 반환
							System.out.println("다음에 오세요");
						}
=======
						util.buy(inputMoney,ame);
>>>>>>> b995432d4a6d7e05f3244a7b73432bbe80a0d28b
						break Back;
					case 2: // 라떼
						util.buy(inputMoney,latte);
						break Back;
					case 3: // 망고쥬스
						util.buy(inputMoney,mango);
						break Back;
<<<<<<< HEAD
					case 4: // 메인메뉴로 돌아가기
						pm.returnChange(inputMoney);// 돈 반환
=======
					case 4 : //메인메뉴로 돌아가기
						util.returnChange(inputMoney);//돈 반환
>>>>>>> b995432d4a6d7e05f3244a7b73432bbe80a0d28b
						break Back;
					}

				} while (exit == false);

<<<<<<< HEAD
			case 2:
				do {
					System.out.println("재고를 채울 음료를 선택하십시오");
					System.out.println("1. 아메리카노 2. 라떼 3. 망고쥬스 4. 취소");
					int num = scanner.nextInt();
					boolean exit2 = false;
					Stock:
					switch (num) {
					case 1:
						System.out.printf("아메리카노의 재고는 %d개 입니다.\n", ame.getReserves());
						System.out.println("재고를 채우시겠습니까? 1.채우기  2. 채우지 않기");
						int stock = scanner.nextInt();
						switch (stock) {
						case 1:
							System.out.println("아메리카노의 재고를 채웠습니다.");
							System.out.printf("재고는 %d개 입니다\n", ame.getReserves());
							break Stock;
						case 2:
							break Stock;
						default:
							System.out.println("유효한 값을 입력하세요");
							break Stock;
						}
					case 2:
						System.out.printf("라떼의 재고는 %d개 입니다.\n", latte.getReserves());
						System.out.println("재고를 채우시겠습니까? 1.채우기  2. 채우지 않기");
						int stock1 = scanner.nextInt();
						switch (stock1) {
						case 1:
							System.out.println("라떼의 재고를 채웠습니다.");
							System.out.printf("재고는 %d개 입니다\n", latte.getReserves());
							break Stock;
						case 2:
							break Stock;
						default:
							System.out.println("유효한 값을 입력하세요");
							break Stock;
						}

					case 3:
						System.out.printf("망고주스의 재고는 %d개 입니다.\n", mango.getReserves());
						System.out.println("재고를 채우시겠습니까? 1.채우기  2. 채우지 않기");
						int stock2 = scanner.nextInt();
						switch (stock2) {
						case 1:
							System.out.println("망고주스의 재고를 채웠습니다.");
							System.out.printf("재고는 %d개 입니다\n", mango.getReserves());
							break Stock;
						case 2:
							break Stock;
						default:
							System.out.println("유효한 값을 입력하세요");
							break Stock;
						}
					case 4:
						break Back;
					}
				} while (exit == false);

=======
			case 2:// 재고충전
>>>>>>> b995432d4a6d7e05f3244a7b73432bbe80a0d28b
			case 3:
				System.out.print("종료합니다.");
				exit = true;
			}

		} while (exit == false);

	}

	
}
