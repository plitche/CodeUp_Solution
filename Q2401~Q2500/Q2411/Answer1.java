package Q2411;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2411
//@Memory 11312, @Time 70
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int people = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int male = 0;
        for (int i=0; i<people; i++) {
        	st = new StringTokenizer(br.readLine(), ",");
        	st.nextToken();
        	String gender = st.nextToken();
        	if (gender.equals("M")) {
        		male++;
        	}
        }
        sb.append(male).append("\n").append(people-male);
        
        System.out.println(sb);
	}
}
 