import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		System.out.print("두 숫자를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		String tc = sc.nextLine();
		String[] num = tc.split(" ");
		int max;
		int min;
		
		if((Integer.parseInt(num[0])) > (Integer.parseInt(num[1]))) {
			max = Integer.parseInt(num[0]);
			min = Integer.parseInt(num[1]);
		}else {
			max = Integer.parseInt(num[1]);
			min = Integer.parseInt(num[0]);
		}
		int gcd = 0;
		for(int i = 1; i < max; i++) {
			if(max % i == 0 && min % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
