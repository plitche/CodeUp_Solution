package Q1253;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1253
//@Memory 11284, @Time 71

public class Answer1 {
	//	어떤 두 수 a, b가 있을 때 두 수 사이의 모든 정수를 오름차순으로 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int add =1;
		if (A==B) {	// A와 B가 일치할 때
			bw.append(String.valueOf(A));
		} else if (A>B) { // A가 B보다 클 때
			bw.append(String.valueOf(B)+" ");
			for (int i=1; i<A-B; i++) {	// 반복문을 통해서 반복 저장
				bw.append(String.valueOf(B+add)+" ");
				add++;
			}
			bw.append(String.valueOf(A));
		} else { // B가 A보다 클 때
			bw.append(String.valueOf(A)+" ");
			for (int i=1; i<B-A; i++) {
				bw.append(String.valueOf(A+add)+" ");
				add++;
			}
			bw.append(String.valueOf(B));
		}
		
		bw.flush();
		bw.close();
	}
	
}