package Q1167;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1167
//@Memory 11244, @Time 113

public class Answer1 {
	// 세 개의 숫자가 주어질 때 두번째로 작은 수를 출력해보자.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 3개의 숫자 입력 받기
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if (a>b) {	// a가 b보다 클 때
			if (b>c) {	// b가 c보다 클 때 = a > b > c
				bw.append(String.valueOf(b));
			} else { 	// c가 b보다 클 때
				if (a>c) {	// a가 c보다 클 때 = a > c > b
					bw.append(String.valueOf(c));
				} else {	// c가 a보다 클 때 = c > a > b
					bw.append(String.valueOf(a));
				}
			} 
		} else {	// b가 a보다 클 때
			if (a>c) {	// a가 c보다 클 때 = b > a > c
				bw.append(String.valueOf(a));
			} else {	// c가 a보다 클 때
				if (b>c) {	// b가 c보다 클 때 = b > c > a
					bw.append(String.valueOf(c));
				} else {	// c가 b보다 클 때 = c > b > a
					bw.append(String.valueOf(b));
				}
			} 
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
