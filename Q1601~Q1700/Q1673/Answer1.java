package Q1673;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1673
//@Memory 11180, @Time 64

public class Answer1 {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); 

        int lock1 = Integer.parseInt(st.nextToken());
        int lock2 = Integer.parseInt(st.nextToken());
        int lock3 = Integer.parseInt(st.nextToken());

        for (int i=lock1; i>0; i--) {
        	if (lock1%i==0 && lock2%i==0 && lock3%i==0) {
        		sb.append(i);
        		break;
        	}
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}