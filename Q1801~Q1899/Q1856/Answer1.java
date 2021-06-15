package Q1856;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1856
//@Memory 11328, @Time 95
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        System.out.println(loop(count));
	}
	
	public static int loop(int count) {

		if (count==1) {
			return 1;
		} else if (count==2) {
			return 1 + loop(1);
		} else  if (count==3) {
			return 1 + loop(1) + loop(2);
		} else {
			return loop(count-3) + loop(count-2) + loop(count-1);
		}
		
	}
    	 
}
