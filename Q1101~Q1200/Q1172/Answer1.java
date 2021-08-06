package Q1172;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1172
//@Memory 11276, @Time 115

public class Answer1 {
	// 세 수를 오름차순으로 정렬하려고 한다. (낮은 숫자 -> 높은 숫자)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 3개의 숫자를 입력 받았다.
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if (a>b) {
			if (b>c) {
				bw.append(String.valueOf(c)).append(String.valueOf(" "+b)).append(String.valueOf(" "+a));
			} else {
				if (a>c) {
					bw.append(String.valueOf(b)).append(String.valueOf(" "+c)).append(String.valueOf(" "+a));
				} else {
					bw.append(String.valueOf(b)).append(String.valueOf(" "+a)).append(String.valueOf(" "+c));
				}
			}
		} else {
			if (a>c) {
				bw.append(String.valueOf(c)).append(String.valueOf(" "+a)).append(String.valueOf(" "+b));
			} else {
				if (b>c) {
					bw.append(String.valueOf(a)).append(String.valueOf(" "+c)).append(String.valueOf(" "+b));
				} else {
					bw.append(String.valueOf(a)).append(String.valueOf(" "+b)).append(String.valueOf(" "+c));
				}
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
