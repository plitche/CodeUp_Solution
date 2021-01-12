package Q1027;

import java.util.Scanner;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1027
//@How Scanner, indexOf(), substring()
//@Memory 12348, @Time 110

public class Answer1 {

	public static void main(String[] args) {
		// Scanner에 대한 설명은 Q1009 - Answer1 참고
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		
		int first = date.indexOf('.');	// 첫번째 '.'의 index
		int second = date.indexOf('.', first+1);	// 두번째 '.'의 index
		
		String year = date.substring(0, first);
		String month = date.substring(first+1, second);
		String day = date.substring(second+1);
		// substring에 대한 설명은 Q1018 - Answer1 참고
		
		System.out.println(day + "-" +  month + "-" + year);
		sc.close();
	}
}
