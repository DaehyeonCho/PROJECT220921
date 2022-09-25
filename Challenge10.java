import java.util.Random;

public class practice1 {

	public static void main(String[] args) {
		int [][] arr = new int[4][4];
		Random r = new Random();
		
		int count = 0, n1, n2;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++)
				arr[i][j] = r.nextInt(10) + 1;
		}
		
		while(count < 6) {
			n1 = r.nextInt(4);
			n2 = r.nextInt(4);
			
			if(arr[n1][n2] != 0) {
				arr[n1][n2] = 0;
				count++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

}
