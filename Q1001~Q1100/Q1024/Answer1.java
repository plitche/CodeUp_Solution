package Q1024;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1024
//@How Scanner, charAt()
//@Memory 12376, @Time 114

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		String word = sc.next();	// 단어 1개를 입력 받는다.
		
		for (int i=0; i<word.length(); i++) { // 입력받은 word의 길이만큼 for문 반복
			System.out.println("\'" + word.charAt(i) + "\'");
			//word의 index 0~word.length까지 한줄씩 출력하기
		}
		sc.close();
	}
}
