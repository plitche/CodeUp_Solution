package Q2052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2052
//@Memory 11208, @Time 69
public class Answer4 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        while(st.hasMoreTokens()) {
        	int total = 0;
        	int number = Integer.parseInt(st.nextToken());
        	
        	for (int j=1; j*j<number; j++) {
        		if (number%j == 0) {
        			total+=j;
        			total+=number/j;
        		}
        	}
        	if (total-number == number) {
        		sb.append("yes\n");
        	} else {
        		sb.append("no\n");
        	}
        }
        
    	System.out.println(sb);	
	}
}
