package Q1086;

import java.text.DecimalFormat;
import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1086
//@Memory 14472, @Time 120

public class Answer1 {
	// 필요한 저장 공간을 MB 단위로 바꾸어 출력한다. 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long w = sc.nextInt();	// 모두 곱했을 경우 int 범위를 넘어서기 때문에
		int h = sc.nextInt();
		int b = sc.nextInt();
		
		double mb = (w*h*b)/8.0/1024/1024;	// 입력받은 값들을 전부 곱하고
											// MB크기로 나타내야 하는 만큼 나눈다.
											// 나누는 타입을 double타입으로 해야 한다.
		DecimalFormat df = new DecimalFormat("0.00");
		// 0 : 10진수 빈자리는 0으로 채움
		// # : 10진수 빈자리는 채우지 않음.
		
		System.out.println(df.format(mb) + " MB");
		sc.close();
	}
}

