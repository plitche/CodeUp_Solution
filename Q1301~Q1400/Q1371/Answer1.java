package Q1371;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1371
//@Memory 11820, @Time 66

public class Answer1 {
	//	이번엔 마름모를 출력해보자. 
	//	n이 입력되면 대각선 2개의 길이가 2n인 마름모를 출력하시오.
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                sb.append(" ");
            }
            sb.append("*");

            for (int j=2*(n-i); j<2*n; j++) {
                sb.append(" ");
            }
            sb.append("*");
            sb.append("\n");
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                sb.append(" ");
            }
            sb.append("*");
            for (int j=2; j<2*(n-i); j++) {
                sb.append(" ");
            }
            sb.append("*");
            sb.append("\n");
        }
        System.out.println(sb);
    }
	
}