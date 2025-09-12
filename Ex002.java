public class Ex002 {
	public static void main(String[] args) {
		int[] An = new int[100];
		for(int i = 0; i < 100; i++) {
			if(An[i] == 0)
				An[i] = 1;
			if(i >= 2)
			An[i] = (An[i-1] + An[i-2]);
			
			System.out.print(An[i] + "\t");
		}
	}
}