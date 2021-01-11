package Q1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1019
//@How BufferedReader, StringBuilder, indexOf(), subString()
//@Memory 11124, @Time 84

public class Answer2 {

	public static void main(String[] args) throws IOException {
		// BufferedReader, StringBuilder에 대한 설명은 Q1009 - Answer2 참고
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		
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

		// year(년), month(월), day(일) 자리수가 부족한 만큼 0을 붙여라.
		if (String.valueOf(year).length() != 4) {	
			for (int i=0; i<4-String.valueOf(year).length(); i++) {
				// year(4자리)보다 부족한 만큼 0을 반복해서 붙여라.
				sb.append("0");
			}
		}
		sb.append(year + ".");

		if (String.valueOf(month).length() == 1) {	
			// length()메소드는 문자열의 길이를 int타입으로 반환한다.
			sb.append("0");
		} 
		sb.append(month + ".");
		
		if (String.valueOf(day).length() == 1) {	
			sb.append("0");
		}
		sb.append(day);
		
		System.out.println(sb);
		
		// 입력 받은 그대로 출력해도 무관하나, 문제의 취지와 어긋난다.
		
		br.close();
	}
}
