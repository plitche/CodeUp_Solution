package Q2417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2417
//@row가 10보다 더 커질 수 있음으로 오류
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int people = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] student = new int[people];
        
        for (int i=0; i<people; i++) {
        	st = new StringTokenizer(br.readLine(), ",");
        	st.nextToken();
        	st.nextToken();
        	st.nextToken();
        	
        	while (st.hasMoreTokens()) {
        		String name = st.nextToken();
        		switch(name) {
        		case "Addison" : student[0] += 1; break;
        		case "Clara" : student[1] += 1; break;
        		case "Anthony" : student[2] += 1; break;
        		case "Andrew" : student[3] += 1; break;
        		case "Mary" : student[4] += 1; break;
        		case "Sharon" : student[5] += 1; break;
        		case "Kimberly" : student[6] += 1; break;
        		case "Kyle" : student[7] += 1; break;
        		case "Brittany" : student[8] += 1; break;
        		case "Joshua" : student[9] += 1; break;
        		}
        	}
        }
        
        int max = 0;
        for (int i=0; i<people; i++) {
        	if (student[i] > max) {
        		max = student[i];
        	}
        }
        
        
        for (int i=0; i<people; i++) {
        	if (max==student[i]) {
        		switch(i) {
                case 0 : sb.append("Addison").append("\n"); break;
                case 1 : sb.append("Clara").append("\n"); break;
                case 2 : sb.append("Anthony").append("\n"); break;
                case 3 : sb.append("Andrew").append("\n"); break;
                case 4 : sb.append("Mary").append("\n"); break;
                case 5 : sb.append("Sharon").append("\n"); break;
                case 6 : sb.append("Kimberly").append("\n"); break;
                case 7 : sb.append("Kyle").append("\n"); break;
                case 8 : sb.append("Brittany").append("\n"); break;
                case 9 : sb.append("Joshua").append("\n"); break;
                }
        	}
        }
        
        System.out.println(sb);
	}
}
 