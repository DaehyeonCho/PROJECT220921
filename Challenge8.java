import java.util.Scanner;
import java.util.Random;

public class practice1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 몇 개?>>");
		int a = scanner.nextInt();
		int [] intArray = new int[a];
		
		Random r = new Random();
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = r.nextInt(100) + 1;
			
			for(int j = 0; j < i; j++) {
				if(intArray[i] == intArray[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");
		
		scanner.close();
	}

}
