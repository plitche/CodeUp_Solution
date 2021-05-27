package Q1672;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1672
//@Memory 14032, @Time 82

public class Answer1 {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); 

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (n/k>9999) {
        	sb.append("번호 초과 오류");
        } else {
            for (int i=1; i<=n/k; i++) {
            	sb.append("F-");
            	for (int j=0; j<4-String.valueOf(i).length(); j++) {
            		sb.append("0");
            	}
            	sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
    	 
}