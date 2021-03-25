package Q1165;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1165
//@Memory 11224, @Time 93

public class Answer1 {
	// 지금 1반과 2반이 축구를 하고있다.
	// 축구경기 타임은 총 90분이고, 현재 1반이 0점, 2반이 2점인 상황에서, 1반은 경남정보고 최고의 스트라이커인 성익이를 투입하기로 결정했다.
	// 성익이는 5분마다 골을 넣을 수 있는 능력을 가지고 있다.
	// 만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.
	// 현재 경기타임과 우리팀의 득점이 입력으로 주어 질때, 성익이를 투입하면 우리팀의 최종 득점은 몇 점인지 출력하시오.
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lestTime = 90 - Integer.parseInt(st.nextToken());	// 남은 시간
        int currentGoalScore = Integer.parseInt(st.nextToken());	// 현재 골 수

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (lestTime%5==0) {
            currentGoalScore += lestTime/5;
        } else {
            currentGoalScore += lestTime/5 +1;
        }

        bw.append(String.valueOf(currentGoalScore));
        bw.flush();
        bw.close();

    }

}