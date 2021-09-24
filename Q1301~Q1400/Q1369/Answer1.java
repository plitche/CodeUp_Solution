package Q1369;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1369
//@Memory 11904, @Time 68

public class Answer1 {
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i=1; i<=n; i++) {
        	for (int j=1; j<=n; j++) {
        		// 첫줄이나 마지막줄인경우 *찍기
        		if (i==1 || j==1 || i==n || j==n) sb.append("*");
        		// 간격이 1인경우 모두 *찍기
        		else if (k==1) sb.append("*");
        		// 합을 간격으로 나누었을때 2인경우 *찍기
        		else if ((i+j)%k == 1) sb.append("*");
        		// 나머지는 공백
        		else sb.append(" ");
        	}
        	sb.append("\n");
        }
        
        System.out.print(sb);
	}
	
}