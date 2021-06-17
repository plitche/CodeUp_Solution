package Q1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1904
//@Memory 11176, @Time 65
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        loop(a, b);
	}
	
	public static void loop(int a, int b) {
		
		if (a <= b) {
			if (a%2 == 1) {
				System.out.print(a + " ");
			} 
			loop(a+1, b);
		} else {
			return;
		}
		
	}
    	 
}
