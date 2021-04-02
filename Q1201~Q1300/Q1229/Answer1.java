package Q1229;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1229
//@Memory 11244, @Time 96

public class Answer1 {
	//  희윤이의 키와 몸무게가 공백을 기준으로 입력된다.(실수)
	//	* 표준몸무게
	//	키에 따른 표준몸무게	공식
	//	키가 150 미만일 때	(실제 키 - 100)
	//	키가 150이상 160미만일 때	(실제 키 - 150) /2 + 50
	//	키가 160 이상일 때	(실제 키 - 100) * 0.9
	//
	//	* 비만도 계산 공식
	//	비만도 = (실제 몸무게 - 표준몸무게)  * 100 / 표준 몸무게
	//
	//	* 비만도에 따른 등급 판정
	//	등급	비만도 수치
	//	10 이하	정상
	//	10~20 이하	과체중
	//	20 초과	비만
	 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        double height = Double.parseDouble(st.nextToken());
        double weight = Double.parseDouble(st.nextToken());

        // 표준 몸무게를 0으로 초기화 선언
        double stanWeight = 0;
        // 키에 따른 표준 몸무게 계산
        if (height<150) {
        	stanWeight = height-100;
        } else if (height<160) {
        	stanWeight = (height-150)/2+50;
        } else {
        	stanWeight = (height-100)*0.9;
        }

        // 비만도
        double bmi = (weight-stanWeight) * 100 / stanWeight;

        // 계산한 bmi에 따른 출력 저장
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
