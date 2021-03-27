package Q1171;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1170
//@Memory 11252, @Time 104

public class Answer1 {
	//  학번을 입력 받아 다음 형식으로 출력하시오.
	//	학번은 학년, 반, 번호로 입력된다.
	//	이번에는 학년은 한자리, 반은 두자리, 번호는 세자리로 출력한다.
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 순서대로 입력 될 학년은 바로 더해준다.
		bw.append(st.nextToken());
		String classes = st.nextToken();
		String number = st.nextToken();
		
		if (classes.length()<2) {	// 자리수가 2자리보다 낮으면 앞에 0 붙이기
			bw.append("0" + classes);
		} else {	// 자리수가 2자리이면 그대로 저장
			bw.append(classes);
		}
		
		if (number.length()<3) {	// 번호의 자리수가 3보다 낮으면
			for (int i=0; i<3-number.length(); i++) {	//낮은만큼 for문 돌리기
				bw.append("0");
			}
		}
		bw.append(number);
		
		bw.flush();
		br.close();
		bw.close();
	}

}
