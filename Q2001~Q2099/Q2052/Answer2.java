package Q2052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2052
//@Memory 11208, @Time 78
public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i=0; i<5; i++) {
        	int total = 0;
        	int number = Integer.parseInt(st.nextToken());
        	
        	for (int j=1; j<Math.sqrt(number); j++) {
        		if (number%j == 0) {
        			total+=j;
        			total+=number/j;
        		}
        	}
        	
        	if (total-number == number) {
        		sb.append("yes");
        	} else {
        		sb.append("no");
        	}
        	sb.append("\n");
        }
        
    	System.out.println(sb);	
	}
}
