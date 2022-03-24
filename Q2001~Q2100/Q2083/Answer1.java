package Q2083;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2083
//@Memory 80852, @Time 331
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
        int count = Integer.parseInt(st.nextToken()); // 공백을 사이로 count와 number 입력 받기
        int number = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        boolean isFind = false; // 찾았는지 여부 변수 FALSE로 선언
        for (int i=0; i<count; i++) {
        	int no = Integer.parseInt(st2.nextToken());
        	if (no == number) { // 입력받은 숫자가 일치하면
        		isFind = true;  // TRUE로 변한 후 
        		sb.append(i+1); // 해당 숫자 INDEX + 1 저장
        		break;
        	} 
        }
        
        System.out.println(isFind ? sb : "-1");	
    	
	}
}