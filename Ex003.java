import java.util.Random;

public class Ex003 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int num = 0;
		int count = 0;
		
		Random r = new Random();

		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(9) + 1;
			System.out.print(arr[i] + "\t");
		}
		
		int[] temp = new int[10];
		
		for(int j = 0; j < arr.length; j++) {
			temp[arr[j]]++;
		}
		
		for(int k = 0; k < temp.length; k++) {
			if(count < temp[k]) {
				count = temp[k];
				num = k;
			}
		}
		
		System.out.println("\n최빈수: " + num + "\n횟수: " + count);
	}

}
