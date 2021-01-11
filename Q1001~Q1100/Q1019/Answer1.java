package Q1019;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1019
//@How Scanner, indexOf(), subString()
//@Memory 12408, @Time 112

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();	// 2021.1.11
		
		int position1 = line.indexOf('.'); 
		// line에서 '.'의 첫번째 index위치를 찾아라.
		int position2 = line.indexOf('.', position1+1);
		// line에서 position1 이후에 '.'의 index위치를 찾아라.
		
		int year = Integer.parseInt(line.substring(0, position1));
		// year은 시작부터 '.'가 나오기 전까지의 사이의 숫자들
		int month = Integer.parseInt(line.substring(position1+1, position2));
		// month은 시작부터 '.'사이의 숫자들
		int day = Integer.parseInt(line.substring(position2+1));
		// day는 '.'뒤부터 끝까지의 숫자들

		// year(년), month(월)과 day(일)이 한자리라면 앞에 0을 붙여라
		if (String.valueOf(year).length() != 4) {	
			for (int i=0; i<4-String.valueOf(year).length(); i++) {
				// year(4자리)보다 부족한 만큼 0을 반복해서 붙여라.
				System.out.print("0");
			}
		}
		System.out.print(year + ".");

		if (String.valueOf(month).length() == 1) {	
			// length()메소드는 문자열의 길이를 int타입으로 반환한다.
			System.out.print("0");
		} 
		System.out.print(month + ".");
		
		if (String.valueOf(day).length() == 1) {	
			System.out.print("0");
		}
		System.out.print(day);
		
		// 물론 입력받은 그대로 출력해도 무관하지만, 문제의 취지와는 어긋난다.
		
		sc.close();
	}
}
