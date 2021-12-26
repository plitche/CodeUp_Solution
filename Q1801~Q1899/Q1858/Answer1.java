package Q1858;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1858
//@Memory 11188, @Time 70
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int line = Integer.parseInt(st.nextToken());
        int position = Integer.parseInt(st.nextToken());
        
        System.out.println(loop(line, position));
	}
	
	public static int loop(int line, int position) {
		// 위치번호가 1이면 1리턴, 위치번호와 줄번호가 같으면 1 리턴, 줄번호가 1이면 1리턴
		if (position==1 || position==line || line==1 ) {
			return 1;
		} else {
			return loop(line-1, position-1)+loop(line-1, position);
		}
	}
    	 
}
