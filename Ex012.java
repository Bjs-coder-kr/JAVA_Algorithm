import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int x = 0; x < num; x++) {
			System.out.print(++count + "\t");
			int col = count + num;
			for(int y = 0; y < num; y++) {
				System.out.print(col + "\t");
				col += num;
			}
			System.out.println();
		}
		
		int n = 4;
		// method: 2중 for문 
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", (i + 4 * j));
			}
			System.out.println();	
		}

	}

}