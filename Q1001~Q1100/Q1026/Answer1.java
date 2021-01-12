package Q1026;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1026
//@How Scanner, Math.pow()
//@Memory 12376, @Time 112

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		
		int first = time.indexOf(':');	// 첫번쨰 :의 index
		int second = time.indexOf(':', first+1);	// 두번째 :의 index
		
		String minute = time.substring(first+1, second);
		// substring에 대한 설명은 Q1018 - Answer1 참고
		
		if (minute.length()==2 && minute.charAt(0)=='0') {
			// 만약 minute가 두자리이고, 첫번째 자리가 0 이라면 0을 제거하라.
			minute = String.valueOf(minute.charAt(1));
		}
		System.out.println(minute);
		sc.close();
	}
}
