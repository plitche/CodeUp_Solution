package Q1228;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1228
//@Memory 11252, @Time 96

public class Answer2 {
	//  희윤이의 키와 몸무게가 공백을 기준으로 입력된다.(실수)
	//  표준몸무게 = (실제 키 - 100) * 0.9
	//	비만도 = (실제 몸무게 - 표준몸무게)  * 100 / 표준 몸무게
	//	10 이하	정상
	//	10~20 이하	과체중
	//	20 초과	비만
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        double height = Double.parseDouble(st.nextToken());
        double weight = Double.parseDouble(st.nextToken());

        // 표준 몸무게
        double stanWeight = (height-100) * 0.9;
        // 비만도
        double bmi = (weight-stanWeight) * 100 / stanWeight;
        
        if (bmi<=10) {
        	sb.append("정상");
        } else if(bmi<=20) {
        	sb.append("과체중");
        } else {
        	sb.append("비만");
        }
        
        System.out.println(sb);
        br.close();
    }

}
