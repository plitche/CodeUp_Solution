package Q2414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2414
//@Memory 11280, @Time 63
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        StringTokenizer st;

        String[] name = new String[people];
        int[] age = new int[people];

        for (int i=0; i<people; i++) {
        	st = new StringTokenizer(br.readLine(), ",");
        	name[i] = st.nextToken();
        	st.nextToken();
        	age[i] = Integer.parseInt(st.nextToken());
        }
        
        String target = br.readLine();
        for (int i=0; i<people; i++) {
        	if (name[i].equals(target)) {
        		System.out.println(age[i]);
        	}
        	
        }
	}
}
 