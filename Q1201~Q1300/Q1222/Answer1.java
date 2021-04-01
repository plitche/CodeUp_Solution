package Q1222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1222
//@Memory 11208, @Time 109

public class Answer1 {
	//  축구경기 타임은 총 90분이고, 성익이는 5분마다 골을 넣을 수 있는 능력을 가지고 있다.
	//	현재 경기타임에 축구의 신 성익이를 투입하여 1반이 이길 수 있으면 "win", 동점이 되면 "same", 투입해도 이기지 못하면 "lose"를 출력하시오.
	// (성익이는 해당 시간에 1반에만 투입되며, 성익이가 투입되면 성익이 외에는 양팀 모두 골을 넣지 못한다.)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int time = Integer.parseInt(st.nextToken());
        int goal1 = Integer.parseInt(st.nextToken());
        int goal2 = Integer.parseInt(st.nextToken());

        // 추가 골 숫자를 0으로 초기화
        int addGoal = 0;
        
        if ((90-time)%5==0) {
        	addGoal = (90-time)/5; 
        } else {
        	addGoal = (90-time)/5+1;        	
        }
        
        // 3항 연산자 이용
        sb.append(addGoal>(goal2-goal1) ? "win" : addGoal<(goal2-goal1) ? "lose" : "same");
        
        System.out.println(sb);
        br.close();
	}

}
