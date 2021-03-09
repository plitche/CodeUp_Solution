package Q1109;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1109
//@Memory 14692, @Time 119

public class Answer1 {
	// ① 첫째 줄에 이름을 입력한다.(영문자 20 문자이내)
	// ② 다음 줄에 나이를 입력한다.(정수)
	// ③ 다음 줄에 부서코드 A, B, C 중 하나를 입력한다.(영문자)
	// ④ 다음 줄에 보안키를 입력한다.(실수)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String code = sc.nextLine();
		double key = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(code);
		System.out.println(key);
		
		sc.close();
	}

}
