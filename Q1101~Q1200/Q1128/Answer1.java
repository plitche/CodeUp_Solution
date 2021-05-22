package Q1128;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1128
//@Memory 14356, @Time 107

public class Answer1 {
	// n이 입력되면 n×123456789 의 결과를 출력하시오. (long 사용 금지)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] nth = new int[3];	// 입력받은 숫자의 각 자리 숫자
		int[] multiple = new int[3]; // 그 숫자와 123456789를 곱한 숫자를 저장할 배열
		int[] front = new int[3];
		int[] back = new int[3];
		
		for (int i=0; i<String.valueOf(n).length(); i++) {	
			nth[i] = String.valueOf(n).charAt(i)-48; // 입력받은 숫자의 자리수만큼 배열에 저장
			multiple[i] = nth[i]*123456789;
			
		}
		
		
		
		System.out.println(n*123456789);
		sc.close();
	}

}
