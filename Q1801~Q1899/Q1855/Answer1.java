package Q1855;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1855
//@Memory 11156, @Time 88
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        loop(0, count, 1, 2);
	}
	
	public static void loop(int index, int count, int bef, int aft) {
		if (count==1 || count==2) {
			System.out.println(1);
			return;
		}
		
		if (index+4>=count) {
			System.out.println(bef+aft);
		} else {
			loop(index+1, count, aft, bef+aft);
		}
		
	}
    	 
}
