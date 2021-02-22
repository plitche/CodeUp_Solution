package Q1085;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1085
//@Memory 14448, @Time 117

public class Answer1 {
	// 필요한 저장 공간을 MB 단위로 바꾸어 출력한다. 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();	// 모두 곱했을 경우 int 범위를 넘어서기 때문에
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();
		
		double mb = (h*b*c*s)/8.0/1024/1024;	// 입력받은 값들을 전부 곱하고
												// MB크기로 나타내야 하는 만큼 나눈다.
												// 나누는 타입을 double타입으로 해야 한다.
		mb = Math.round(mb*10);	// 첫째자리까지 반올림하기 위해
		
		System.out.println(mb/10 + " MB");
		sc.close();
	}
}

