package Q1018;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1018
//@How Scanner + System.out.prinln()
//@Memory 12404, @Time 146

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();	//3:15 형태로 되어있는 한줄을 입력받아라.
		
		int position = line.indexOf(':'); // line에서 :의 위치를 찾아라.
		int hour = Integer.parseInt(line.substring(0, position));
		// hour은 시작부터 ':'가 나오기 전까지의 사이의 숫자들
		int minute = Integer.parseInt(line.substring(position+1));
		// minute는 ':'뒤부터 끝까지의 숫자들
		
		// subString()은 특정 문자열에서 원하는 부분을 자를 때(추출) 사용한다.
		// subString(n) : index n부터 끝까지 추출(인자값을 하나만 가지는 경우)
		// subString(n, m) : index n부터 m까지 추출(인자값을 두개 가지는 경우)
		/**** 시작 인덱스는 0값부터 시작한다. 첫 번째 문자라고 1이라고 생각하면 안된다! ****/
		
		System.out.println(hour + ":" + minute);
		// 물론 입력받은 그대로 출력해도 무관하지만, 문제의 취지와는 어긋난다.
		// System.out.println(sc.nextLine());
		
		sc.close();
	}
}
