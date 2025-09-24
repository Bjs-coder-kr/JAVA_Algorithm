import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j < num + 1; j++) {
					System.out.printf("%4d", (j + num * i));
				}
			} else {
				for (int j = num; j > 0; j--) {
					System.out.printf("%4d", (j + num * i));
				}
			}
			System.out.println();
		}

	}

}
