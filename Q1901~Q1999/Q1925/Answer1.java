package Q1925;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1925
//@Memory 11204, @Time 69
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        System.out.println(loop(n, r));
	}
	
	public static int loop(int n, int r) {
		if (r==0 || r==n) {
			return 1;
		} else {
			return loop(n-1, r-1) + loop(n-1, r);
		}
	}
    	 
}
