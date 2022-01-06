package Q2412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2412
//@Memory 14272, @Time 104
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        Double total = 0.0;
        for (int i=0; i<people; i++) {
        	st = new StringTokenizer(br.readLine(), ",");
        	st.nextToken();
        	st.nextToken();
        	double age = Double.parseDouble(st.nextToken());
        	total += age;
        }
        
        System.out.println(String.format("%.2f", total/people));
	}
}
 