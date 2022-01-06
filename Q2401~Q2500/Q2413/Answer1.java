package Q2413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2413
//@Memory 14588, @Time 112
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int total = 0;
        for (int i=0; i<people; i++) {
        	st = new StringTokenizer(br.readLine(), ",");
        	st.nextToken();
        	st.nextToken();
        	st.nextToken();
        	
        	while(st.hasMoreTokens()) {
        		st.nextToken();
        		total++;
        	}
        }
        
        System.out.println(String.format("%.2f", total/(double)people));
	}
}
 