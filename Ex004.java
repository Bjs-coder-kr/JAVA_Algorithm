import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수로 변환할 10진수 값을 입력하세요: ");
		int num = Integer.parseInt(sc.nextLine());
		int mod = 0;
		String result = "";
		
		while (num > 0) {
            mod = num % 2;
            result += mod; 
            num /= 2;
        }
		System.out.print("2진수 변환 결과: ");
		for(int i = result.length()-1; i >= 0; i--)
			System.out.print(result.charAt(i));
	}
}