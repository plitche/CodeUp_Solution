package Q1230;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1230
//@Memory 11160, @Time 94

public class Answer1 {
	//	어떤 차의 높이가 170cm 이다.
	//  터널 a,b,c의 높이가 공백으로 분리되어 차례대로 3개 입력된다. (정수)
	//	높이가 170인 차가 잘 통과할 수 있으면 PASS를 출력, 170보다 같거나 작으면 CRASH 처음 충돌한 터널 높이를 출력하시오.
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // a, b, c 순서대로 통과 => 순서대로 조건문 작성
        if (a<=170) {
        	sb.append("CRASH ").append(a);
        } else if (b<=170) {
        	sb.append("CRASH ").append(b);
        } else if (c<=170) {
        	sb.append("CRASH ").append(c);
        } else {
        	sb.append("PASS");	//모두 통과하면 pass
        }
        
        System.out.print(sb);
        br.close();
    }

}
