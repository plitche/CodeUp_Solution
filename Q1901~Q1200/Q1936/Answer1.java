package Q1936;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1936
//@Memory 11164, @Time 67
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(loop(a, b));
	}
	
	public static int loop(int a, int b) {
		if (a==b) {
			return 0;
		} else if(a>b) {
			return loop(a/2, b)+1;
		} else {
			return loop(a,b/2)+1;
		}
	}
    	 
}
