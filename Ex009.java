import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		String tc = sc.nextLine();
		String[] num = tc.split("");
		int temp = 0;
		for(int i = 0; i < num.length; i++) {
			temp += Integer.parseInt(num[i]);
		}
		System.out.printf("각 자릿수의 합: %d", temp);
	}

}
