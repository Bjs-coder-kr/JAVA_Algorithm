import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 1;
		for(int x = 0; x < num; x++) {
			for(int y = 0; y < num; y++) {
				System.out.print(count++ + "\t");
			}
			System.out.println();
		}

	}

}
