package Q2008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2008
//@Memory 11160, @Time 65
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 첫 숫자
        int first = Integer.parseInt(st.nextToken());
        // 경로(오름차순 or 내림차순)
        String path = null;
        for (int i=0; i<count-1; i++) {
        	int number = Integer.parseInt(st.nextToken()); // 다음 숫자 입력받기

        	if (path == null) {
        		if (number > first) {
        			path = "오름차순";
        		} else if (number < first) {
        			path = "내림차순";
        		}
        	}
        	
        	else if (path.equals("오름차순")) { // 이미 오름차순 인 경우 섞임 판단
        		if (number >= first) {

        		} else {
        			path = "섞임";
        		}
        	}
        	
        	else if (path.equals("내림차순")) {  // 이미 내림차순 인 경우 섞임 판단
        		if (number <= first) {

        		} else {
        			path = "섞임";
        		}
        	}
        	first = number;
        }
        
        System.out.println(path==null ? "섞임" : path);
	}
    	 
}
