package Q1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer1 {

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
