package Q1409;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1409
//@Memory 11108, @Time 92

public class Answer1 {
	//	첫째 줄에 숫자 10개가 차례대로 입력된다.
	//	둘째 줄에 k값이 입력된다. 
	 
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder sb = new StringBuilder();
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         int number = Integer.parseInt(br.readLine());

         Map<Integer, Object> map = new HashMap<Integer, Object>();
         
         int index = 1;
         while(st.hasMoreTokens()) {
        	 // 토큰을 하나씩 map에 put
        	 map.put(index, st.nextToken());
        	 // index 하나씩 증가
        	 index++;
         }

         // 3항 연산자 이용
         sb.append(map.get(number) == null ? "0" : map.get(number));
         
         System.out.println(sb);
         br.close();
    }
	
}