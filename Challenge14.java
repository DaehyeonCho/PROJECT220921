import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("과목 이름>>");
			String subject = scanner.next();
			
			if(subject.equals("그만"))
				break;
			
			int i;
			for(i = 0; i < course.length; i++) {
				if(subject.equals(course[i])) {
					System.out.println(subject + "의 점수는 " + score[i]);
					break;
				}
			}
			
			if(i == course.length)
				System.out.println("없는 과목입니다.");
			
		}
		
		scanner.close();
	}

}
