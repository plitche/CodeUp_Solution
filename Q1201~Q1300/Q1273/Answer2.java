package Q1273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1273
//@Memory 11220, @Time 61

public class Answer2 {
	//	자연수 N이 주어지면 N의 약수를 오름차순으로 모두 출력하시오.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<Integer>();
		
		// 풀이 1과 비슷하지만 n의 제곱근까지만 반복
		for (int i=1; i<=Math.sqrt(n); i++) {
			if (n%i==0) {
				list.add(i); // 나누어 떨어지는 i를 list에 저장
				if (i!=n/i) {	// i가 n/i가 같지 않아야 sb에 저장 (ex 9인경우 3)
					list.add(n/i);  // 나누어 떨어진 i를 n에서 나눈 값을 list	
				}
			}
		}
		
		// list 정렬
		Collections.sort(list);
		
		// list의 사이즈만큼 반복
		for (int i=0; i<list.size(); i++) {
			sb.append(list.get(i) + " ");
		}			
		
		System.out.println(sb);
		br.close();
	}
	
}