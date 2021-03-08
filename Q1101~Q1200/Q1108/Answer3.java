package Q1108;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1107
//@Memory 11000, @Time 58

public class Answer3 {
	// ﻿hello를 20번 연속출력한 다음 한 칸을 띄우고(공백 한칸(줄바꿈 아님)) world를 연속 30번 출력하시오.
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<20; i++) {
			sb.append("hello");
		}
		sb.append(" ");
		for (int i=0; i<30; i++) {
			sb.append("world");
		}
		System.out.println(sb);
	}

}
