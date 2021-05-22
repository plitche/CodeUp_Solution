package Q1298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1298
//@Memory 11180, @Time 100

public class Answer1 {
	//	첫째 줄에 방정식 Ax+By=C를 만족하는 정수 x, y의 값을 아무거나 공백으로 구분하여 출력한다.
	//	만약 Ax+By=C를 만족하는 정수 x, y가 존재하지 않는다면 "Not Exist"를 출력한다.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		boolean isExist = false;
		
		int x = 0;
		int y = 0;
		
		for(int i=Integer.MIN_VALUE; i<=Integer.MAX_VALUE; i++) {
			x = i;
			for(int j=Integer.MIN_VALUE; j<=Integer.MAX_VALUE; j++) {
				y = j;
				if(c==(a*i)+(b*j)) {
					isExist = true;	
					break;
				}
			}
			if (isExist) {
				break;
			}
			
		}
		
		System.out.println(isExist ? x+" "+y : "Not Exist");
		br.close();
	}
	
}
