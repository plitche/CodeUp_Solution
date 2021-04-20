package Q1380;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1380
//@Memory 11136, @Time 70

public class Answer1 {
	//	이런 주사위 2개를 굴려 합이 k가 나오는 경우를 조사하려고 한다.
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=6; i++) {
            if (n-i>0 && n-i<7) {
                sb.append(i).append(" ");
                sb.append(n-i);
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
	
}