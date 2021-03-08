package Q1108;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1107
//@Memory 11024, @Time 63

public class Answer1 {
	// ﻿hello를 20번 연속출력한 다음 한 칸을 띄우고(공백 한칸(줄바꿈 아님)) world를 연속 30번 출력하시오.
	
	public static void main(String[] args) {
		for (int i=0; i<20; i++) {	// hello 20번 출력
			System.out.print("hello");
		}
		System.out.print(" "); // 한칸 띄우기
		for (int i=0; i<30; i++) {	// world 30번 출력
			System.out.print("world");
		}
	}

}
