package Q1618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1618
//@Memory 11192, @Time 109

public class Answer1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int[] weight = new int[3];
        for (int i=0; i<3; i++) {
        	weight[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(weight);
        for (int i : weight) {
        	sb.append(i).append(" ");
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}