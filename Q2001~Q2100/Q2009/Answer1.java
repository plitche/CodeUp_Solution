package Q2009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2009
//@Memory 11160, @Time 69
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int coupone = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        
        int coffee = 0;
        while (coupone>=count) {
        	int share = 0;
        	coffee += coupone/count;
        	share = coupone/count;
        	coupone = coupone%count+share;
        }
        
        System.out.println(coffee);
	}
    	 
}
