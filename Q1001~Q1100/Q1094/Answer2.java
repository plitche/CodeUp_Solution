package Q1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1094
//@Memory 13528, @Time 96

public class Answer2 {
	// 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
    	// 총 출석을 부를 숫자만큼 배열 길이 선언
        int[] a = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=a.length-1; i>=0; i--) {
            a[i] = Integer.parseInt(st.nextToken()); // idx마지막부터 출석 부른 숫자를 배열에 저장
        }
        for (int i : a) { // 향상 for문
            sb.append(i).append(" ");
        }
        System.out.print(sb);
    }

}
