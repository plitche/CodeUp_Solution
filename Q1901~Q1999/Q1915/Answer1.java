package Q1915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1915
//@Memory 11148, @Time 67
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
		} else if (count ==3 ){
			System.out.println(2);
			return;
		}
		
		if (index+4>=count) {
			System.out.println(bef+aft);
		} else {
			loop(index+1, count, aft, bef+aft);
		}
		
	}
    	 
}
