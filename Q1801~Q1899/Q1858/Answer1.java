package Q1858;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1858
//@Memory 11172, @Time 79
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int line = Integer.parseInt(st.nextToken());
        int position = Integer.parseInt(st.nextToken());
        
        System.out.println(loop(line, position));
	}
	
	public static int loop(int line, int position) {

		if (position==1 || position==line || line==1 ) {
			return 1;
		} else {
			return loop(line-1, position-1)+loop(line-1, position);
		}
	}
    	 
}
