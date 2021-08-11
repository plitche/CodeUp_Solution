package Q1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1212
//@Memory 11144, @Time 61

public class Answer1 {
	//	세 개의 직선이 있다. 숫자의 의미는 직선의 길이를 말한다.
	//	이 직선으로 삼각형을 만들 수 있는지 판단하는 프로그램을 작성하시오.
	//	삼각형의 성립 조건)
	//	a, b, c 가 변의 길이이고 c가 제일 긴 길이라고 한다면 c < a + b 이면 삼각형이 성립됨.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 삼각형이 맞는지 아닌지 판단 먼저 false로 초기화
        boolean yesno = false;
        
        // 가장 큰 변의 길이가 나머지 두변의 길이의 합보다 작은지 판단
        if (a>b) {
            if (a>c) {
                if (a<b+c) {
                    yesno = true;
                }
            } else {
                if (c<a+b) {
                    yesno = true;
                }
            }
        } else {
            if (b>c) {
                if (b<a+c) {
                    yesno = true;
                }
            } else {
                if (c<a+b) {
                    yesno = true;
                }
            }
        }

        System.out.println(yesno ? "yes" : "no");
	}

}
