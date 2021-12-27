package Q1860;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1860
//@Memory 11924, @Time 70
public class Answer2 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        
        enter(line);
	}
	
	public static void enter(int line) {
		if(line<=0) {
			return;
		}
		
		enter(line-1);
		loop(line);
		System.out.println();
	}
	
	public static void loop(int line) {
		if (line<=0) {
			return;
		}
		
		loop(line-1);
		System.out.print(line + " ");
	}
    	 
}
