package Q1857;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1857
//@Memory 11184, @Time 73
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int total = Integer.parseInt(st.nextToken());
        int many = Integer.parseInt(st.nextToken());
        
        System.out.println(loop(total, many));
	}
	
	public static int loop(int total, int many) {

		if (total<many) {
			return 0;
		} else if (total==many) {
			return 1;
		} else if (many==1) {
			return total;
		} else {
			return loop(total-1, many-1) + loop(total-1, many); 
		}
		
	}
    	 
}
