import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int [] cost = new int[8];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		
		if(money / 50000 != 0) {
			cost[0] = money / 50000;
			money = money - cost[0] * 50000;
		}
		if(money / 10000 != 0) {
			cost[1] = money / 10000;
			money = money - cost[1] * 10000;
		}
		if(money / 1000 != 0) {
			cost[2] = money / 1000;
			money = money - cost[2] * 1000;
		}
		if(money / 500 != 0) {
			cost[3] = money / 500;
			money = money - cost[3] * 500;
		}
		if(money / 100 != 0) {
			cost[4] = money / 100;
			money = money - cost[4] * 100;
		}
		if(money / 50 != 0) {
			cost[5] = money / 50;
			money = money - cost[5] * 50;
		}
		if(money / 10 != 0) {
			cost[6] = money / 10;
			money = money - cost[6] * 10;
		}
		cost[7] = money;
		
		for(int i = 0; i < unit.length; i++) {
			if(cost[i] == 0)
				continue;
			else 
				System.out.println(unit[i] + "원 짜리 : " + cost[i] + "개");
		}
		
		scanner.close();
	}

}
