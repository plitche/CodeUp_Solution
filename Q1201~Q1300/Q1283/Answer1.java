package Q1283;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1283
//@Memory 11244, @Time 69

public class Answer1 {
	//	이 사람이 투자한 돈의 액수와, 그 주식의 하루간의 변동을 퍼센트로 알 때, 이 사람의 순수익과 이득/손해 판단을 출력하세요.
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double money = Integer.parseInt(br.readLine());	//돈 입력
        int days = Integer.parseInt((br.readLine()));	//일수 입력
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        
        double input=money;
        for (int i=0; i<days; i++) { // 입력받은 일 수 만큼 for문 반복
            int percent = Integer.parseInt(st.nextToken()); // st에서 토큰을 차례로 꺼내어 계산
            money = money*(1+percent/100.0);
        }
        
        bw.append(String.valueOf(Math.round(money-input)));
        bw.newLine();

        if (money-input>0) {
            bw.append("good");
        } else if(money-input<0) {
            bw.append("bad");
        } else {
            bw.append("same");
        }
        
        bw.flush();
        bw.close();
	}
	
}