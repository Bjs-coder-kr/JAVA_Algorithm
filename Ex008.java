import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		int num = Math.abs(sc.nextInt());
		if(num == 0) num = 1;
		for(int i = num-1; i > 0; i--) num *= i;
		System.out.println(num);
	}

}
