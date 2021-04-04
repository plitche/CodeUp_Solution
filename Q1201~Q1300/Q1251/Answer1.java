package Q1251;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1251
//@Memory 11028, @Time 61

public class Answer1 {
	//	반복문 연습용 예제입니다. 입력은 없습니다.
	//	1부터 100까지 공백으로 띄워 하나씩 출력하세요.
	 
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i=1; i<=100; i++) {
			sb.append(i+" ");
		}
		System.out.println(sb);
	}

}
