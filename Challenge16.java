import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		String str [] = {"가위", "바위", "보"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user = scanner.next();
			int n = (int)(Math.random() * 3);
			String com = str[n];
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			if(user.equals("가위")) {
				if(com.equals("가위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 비겼습니다.");
				else if(com.equals("바위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 졌습니다.");
				else if(com.equals("보"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 이겼습니다.");
			}
			else if(user.equals("바위")) {
				if(com.equals("가위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 이겼습니다.");
				else if(com.equals("바위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 비겼습니다.");
				else if(com.equals("보"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 졌습니다.");
			}
			else if(user.equals("보")) {
				if(com.equals("가위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 졌습니다.");
				else if(com.equals("바위"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 이겼습니다.");
				else if(com.equals("보"))
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 비겼습니다.");
			}
		}
		
		scanner.close();
	}

}
