package Q1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1753
//@Memory 11180, @Time 62

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int people = Integer.parseInt(br.readLine());
        String line;
        
        // 사람의 숫자만큼 for문 반복
        for (int i=0; i<people; i++) {
        	line = br.readLine();
        	// 문자 개수 -1 부터 for문 반복 : charAt의 인덱스는 0부터 시작임으로
        	for (int j=line.length()-1; j>=0; j--) {
            	sb.append(line.charAt(j));
            }	
        	sb.append("\n");
        }
        
        System.out.println(sb);
	}
    	 
}