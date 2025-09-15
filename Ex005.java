import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		//65 97
		System.out.print("문자를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		String tc = sc.nextLine();
		char[] ap;
		ap = tc.toCharArray();
		for(int i = 0; i < ap.length; i++) {
			if(ap[i] < 97) {
				ap[i] += 32;
			}else {
				ap[i] -= 32;
			}
			System.out.print(ap[i]);
		}
	}
}
