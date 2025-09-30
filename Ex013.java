import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int x = 1; x <= num; x++) {
			System.out.print(x + "\t" );
			int count = x;
			for(int y = 1; y < num; y++) {
				System.out.print((count+=x) + "\t");
			}
			System.out.println();
		}

	}

}
