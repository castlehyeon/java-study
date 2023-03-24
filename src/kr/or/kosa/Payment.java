package kr.or.kosa;

public class Payment {
	int unit = 10000;
	int num = 0;
	int sw = 0;
	int money;

	public void returnChange(int money) {
		while (true) {
			if ((num = (int) money / unit) != 0)
				System.out.printf("%d %d개\n", unit, num);
			if (unit > 1) {
				money -= unit * num;
				switch (sw) {
				case 0:
					unit /= 2;
					sw = 1;
					break;
				default:
					unit /= 5;
					sw = 0;
					break;

				}
			} else {
				break;
			}
		}
	}
	
	
	

}
