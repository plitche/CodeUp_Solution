package Q2601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2601
//@Memory 11156, @Time 70
public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        calc(count, 1, 1);
	}
	public static void calc(int count, int a, int b) {
		if (count == 1 || count == 2) {
			System.out.print(b);
		} else {
			calc(count-1, b, a+b);
		}
	}
}

