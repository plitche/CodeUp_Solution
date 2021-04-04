package Q1251;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1251
//@Memory 11052, @Time 66

public class Answer2 {
	//	반복문 연습용 예제입니다. 입력은 없습니다.
	//	1부터 100까지 공백으로 띄워 하나씩 출력하세요.

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int i=0;
		while (i++<100 ) {
			sb.append(i+" ");
		}
		System.out.println(sb);
	}

}