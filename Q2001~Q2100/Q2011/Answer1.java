package Q2011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2011
//@Memory 56160, @Time 280
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int first = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        
        for (int i=first; i<=end; i++) {
        	int count = 0;
        	
        	for (int j=0; j<String.valueOf(i).length(); j++) {
        		char index = String.valueOf(i).charAt(j); // j번째 자리의 숫자가
    			if (index == '3' || index == '6' || index == '9') { // 3의 배수일떄 count++
    				count++;
    			}
    		}
        	
        	if (count == 0) { // count가 0 이면 i숫자를 그대로 출력
        		sb.append(i).append("\n");
        	} else {
        		for(int j=0; j<count; j++) { // count만큼(3의 배수만큼) K찍기
        			sb.append("K");
        		}
        		sb.append("\n");
        	}
    	}
        
        System.out.println(sb);
	}
    	 
}
