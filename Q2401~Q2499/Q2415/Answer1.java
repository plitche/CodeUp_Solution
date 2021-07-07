package Q2415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2415
//@Memory 11324, @Time 70
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int people = Integer.parseInt(br.readLine());
        StringTokenizer st;

        String[] student = new String[people];

        for (int i=0; i<people; i++) {
        	student[i] = br.readLine();
        }
        
        String target = br.readLine();
        for (int i=0; i<people; i++) {
        	st = new StringTokenizer(student[i], ",");
        	if (target.equals(st.nextToken())) {
        		st.nextToken();
        		st.nextToken();
        		
        		while (st.hasMoreTokens()) {
        			sb.append(st.nextToken()).append("\n");
        		}
        		
        		break;
        	}
        	
        }
        
        System.out.println(sb);
	}
}
 