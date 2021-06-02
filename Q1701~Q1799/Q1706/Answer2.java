package Q1706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1706
//@Memory 11152, @Time 92

public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        String[] arr = new String[5];
        for (int i=0; i<5; i++) {
        	arr[i] = st.nextToken();
        }

        for (int i=4; i>=0; i--) {
        	sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb);
    }
    	 
}