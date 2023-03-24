package kr.or.kosa;

import java.util.Scanner;

public class VendingMachine2 {

	Scanner sc = new Scanner(System.in);

    int capacity =10; // 최대 보유량 (고유정보)

//    public void assignBeverage(Beverage2 beverage) { //초기값 세팅
//        System.out.printf("메뉴이름을 입력해주세요. : ");
//        beverage.setName(sc.nextLine());
//        System.out.printf("메뉴가격을 입력해주세요. : ");
//        beverage.setPrice(Integer.parseInt(sc.nextLine()));
//        beverageHandle(beverage);
//        System.out.println("자판기에 10개 입고 되었습니다.");
//
//    }
    
/*    public String checkQuantity(Ame ame){ //각 음료 수량확인
        return "현재 " + ame.getName() + "의 수량은" + ame.getReserves() + "개 남았습니다.";
    }
    
    public String checkQuantity(Latte ame){ //각 음료 수량확인
        return "현재 " + ame.getName() + "의 수량은" + ame.getReserves() + "개 남았습니다.";
    }
    
    public String checkQuantity(Mango mango){ //각 음료 수량확인
        return "현재 " + mango.getName() + "의 수량은" + mango.getReserves() + "개 남았습니다.";
    }*/

    public String checkQuantity(Beverage2 beverage2){ //각 음료 수량확인
        return "현재 " + beverage2.getName() + "의 수량은" + beverage2.getReserves() + "개 남았습니다.";
    }
    public void beverageHandle(Beverage2 beverage){ //초기 음료 보유수량 10개로 맞추기
        beverage.setReserves(10);
    }
    public int restock(Beverage2 beverage){ //재입고 기능
        System.out.println(beverage.getName()+" 가 재입고 되었습니다.");
        return capacity;
    }
//    
//    public int minusCount(Beverage2 beverage){ //재입고 기능
//        
//    }
}
