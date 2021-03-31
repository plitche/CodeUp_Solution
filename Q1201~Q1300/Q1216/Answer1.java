package Q1216;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1216
//@Memory 11176, @Time 89

public class Answer1 {
	//  입력으로 세 정수가 입력된다. 첫번째 정수는 홍보를 하지 않을 경우 수입, 두번째 정수는 홍보를 할 경우의 수입, 세번째 정수는 홍보비용을 의미한다.
	//	홍보를 하는 경우가 유리하면 "advertise"
	//	그렇지 않은 경우가 유리하면 "do not advertise"
	//	그것도 아니면 홍보를 하든 안 하든 별 관계가 없으면 "does not matter"를 출력하시오.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int adIncome1 = Integer.parseInt(st.nextToken());
        int adIncome2 = Integer.parseInt(st.nextToken());
        int adCost = Integer.parseInt(st.nextToken());

        // 홍보 안했을때 - 홍보 했을때 수익
        int result = adIncome1 - (adIncome2-adCost);
        
        // 3항 연산자 사용
        sb.append(result>0 ? "do not advertise" : result<0 ? "advertise" : "does not matter");
        
        System.out.println(sb);
        br.close();
	}

}
