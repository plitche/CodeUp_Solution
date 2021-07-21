package Q2502;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2502
//@Memory 17892, @Time 131
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for (int i=0; i<count; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int n = Integer.parseInt(st.nextToken());
        	int k = Integer.parseInt(st.nextToken());
        	
        	if (k<n) {
        		sb.append("2\n");
        	} else {
        		if (k*2%n==0) {
            		sb.append(k*2/n).append("\n");
            	} else {
            		sb.append(k*2/n+1).append("\n");
            	}	
        	}
        }
        
        System.out.print(sb);
        
	}
    	 
}

