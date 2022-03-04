package Q2055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2052
//@Memory 11264, @Time 69
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken()); // 두개의 숫자 입력 받기
        int b = Integer.parseInt(st.nextToken());
        
        List<Integer> list = new ArrayList<Integer>(); // 공통 약수를 저장할 list 선언

    	for (int i=1; i*i<=b; i++) { // 1부터 b의 제곱근까지 반복(문제 조건에서 a<=b임으로)
    		if (a%i == 0) { // 해당 숫자가 나누어 떨어질 때 
    			list.add(i); // 리스트에 해당 숫자와 몫을 add 한다.
    			list.add(a/i);
    		}
    		if (b%i == 0) { // a와 동일하게 해당 숫자로 나누어 떨어 질 때 리스트에 해당 숫자와 몫을 저장 
    			list.add(i);
    			list.add(b/i);
    		}
    	}
    	
    	Collections.sort(list); // 리스트 정렬
    	
    	int pre = list.get(0); // 첫번째 숫자 선언
    	sb.append(pre + " "); // 첫번째 숫자는 일단 먼저 sb에 저장
    	for (int i=1; i<list.size(); i++) { // 해당 리스트의 사이즈(길이)만큼 반복
    		int after = list.get(i); // 그 다음 숫자 꺼내기
    		if (pre==after) { // 꺼내어 처음 숫자와 동일하면 넘어감
    			continue;
    		} else { // 동일하지 않으면 sb에 넣어준 다음 처음 숫자를 다음 숫자로 바꿔줌
    			sb.append(after + " ");
    			pre=after;
    		}
    	}
        
    	System.out.println(sb);	
	}
}
