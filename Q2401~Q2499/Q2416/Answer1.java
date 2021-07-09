package Q2416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2416
//@Memory 11420, @Time 68
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        StringTokenizer st;

        String[] student = new String[people];

        for (int i=0; i<people; i++) {
        	student[i] = br.readLine();
        }
        
        String target = br.readLine();
        int male = 0;
        int female = 0;
        for (int i=0; i<people; i++) {
        	st = new StringTokenizer(student[i], ",");
        	if (target.equals(st.nextToken())) {
        		st.nextToken();
        		st.nextToken();
        		
        		while (st.hasMoreTokens()) {
        			String friend = st.nextToken();
        			for (int j=0; j<people; j++) {
        				StringTokenizer st1 = new StringTokenizer(student[j], ",");
        				
        				String name = st1.nextToken();
        				if (friend.equals(name)) {
        	        		String gender = st1.nextToken();
        	        		if ("M".equals(gender)) {
        	        			male++;
        	        		} else {
        	        			female++;
        	        		}
        				}
        			}
        			
        		}
        		
        		break;
        	}
        	
        }
        
        System.out.println(male);
        System.out.println(female);
	}
}
 