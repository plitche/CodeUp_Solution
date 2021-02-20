package Q1079;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1079
//@Memory 14296, @Time 116

public class Answer1 {
	// 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letters = sc.nextLine();
		String[] letter = letters.split(" ");	
		// 입력받은 문자열을 띄어쓰기 기준으로 분리하여 String배열에 저장한다. 
		
		for (int i=0; i<letter.length; i++) { //배열의 길이 만큼
			if (letter[i].equals("q")) {
				System.out.println(letter[i]);
				return;
			} else {
				System.out.println(letter[i]);
			}
		}
		
		sc.close();
	}
}

