package Q1368;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1369
//@Memory 11860, @Time 73

public class Answer1 {
	//	이번엔 공백의 방향까지 정하여 평행사변형을 만들자.
	//	L=왼쪽 아래에 공백 / R=오른쪽 아래에 공백
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int h = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String d = st.nextToken();

        for (int i=0; i<h; i++) {
            if (d.equals("L")) {
                for (int j=0; j<i; j++) {
                    sb.append(" ");
                }
            } else {
                for (int j=i; j<h-1; j++) {
                    sb.append(" ");
                }
            }
            for (int j=0; j<k; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
	
}