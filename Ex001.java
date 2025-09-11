import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Student{
	private String name;
	String no;
	private List<String[]> student = new ArrayList<>();
	
	public Student(String name, String no){
		super();
		this.name = name;
		this.no = no;
	}	
}

public class Ex001{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Student> map = new HashMap();
		map.put("김가연", new Student("김가연", "0001"));
		map.put("방성일", new Student("방성일", "0002"));
		map.put("배지수", new Student("배지수", "0003"));

		
		while(true) {
			System.out.println("*************************************");
			System.out.println("검색을 하려면 y, 종료를 원하면 n을 입력해주세요.");
			String input = sc.nextLine();
			if (input.equals("n")) {
				System.out.println("종료합니다.");
				break;
			} else if (input.equals("y")){
				System.out.println("학생 이름을 입력해주세요.");
				String n = sc.nextLine();
				// 학생 이름 있는 경우 그 학생 학번 저장
				if (map.containsKey(n)) {
					// 학번 출력 
					Student sd = map.get(n);
					System.out.println(n + "학생의 학생번호는 " + sd.no + "입니다.");
				}else {
					// 학생 이름 없는 경우 없는 학생 이름이라 출력
					System.out.println("없는 학생 입니다. ");
					
				}
				
			}
		}

	}
	
}
