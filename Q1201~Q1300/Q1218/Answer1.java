package Q1218;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1218
//@Memory 11176, @Time 67

public class Answer1 {
	//  삼각형의 3변의 길이 a, b, c가 입력으로 주어진다.
	//	여기서 입력되는 변의 관계는 a ≤ b ≤ c 이다. 
	//	그 삼각형이 무슨 삼각형인지 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a+b <= c) {
        	sb.append("삼각형아님");
        } else {
        	if (a==b && b==c) {
            	sb.append("정삼각형");
            } else if ( (a==b && b!=c) || (b==c && c!=a) || (a==c && a!=b) ) {
            	sb.append("이등변삼각형");
            } else if ( a*a + b*b == c*c ) {
            	sb.append("직각삼각형");
            } else {
            	sb.append("삼각형");
            }
        }
        
        System.out.println(sb);
        br.close();
	}

}
