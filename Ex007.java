import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		System.out.print("소수 판별을 위해 숫자를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 2; i <= num; i++) {
			if(num % i == 0)
				count++;
		}
		
		if(count == 1) {
			System.out.printf("%d은(는) 소수입니다.", num);
		}else
			System.out.printf("%d은(는) 소수가 아닙니다.", num);
	}

}
