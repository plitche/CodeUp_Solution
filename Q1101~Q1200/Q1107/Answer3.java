package Q1107;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1107
//@Memory 10972, @Time 56

public class Answer3 {
	// ﻿print 단어를 연속으로 50번 출력하시오.(띄어쓰기 없음)
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<50; i++) {
			sb.append("print");
		}
		System.out.println(sb);
	}

}
