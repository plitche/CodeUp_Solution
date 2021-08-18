package Q2608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2607
//@Memory 15180, @Time 3988
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int people = Integer.parseInt(br.readLine());
        
        sb.append(vote(1, people));
        
        
        System.out.print(sb);
	}
	public static String vote(int start, int number) {
		String text = null;
		for (int i=0; i<2; i++) {
			if (i==0) {
				text = "O";
			} else {
				text = "X";
			}
			
			if (start != number) {
				return vote(start+1, number);
			}
		}
		return text;
	}
    	 
}

