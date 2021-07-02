package Q2417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2417
//@row가 10보다 더 커질 수 있음으로 오류
class People {
	List<Map<Integer, String>> person;
	int index;
	int max;
	
	public void friend(String[] personInfo) {
		for (int i=3; i<personInfo.length; i++) {
			
			for (int j=0; j<person.size(); j++) {
				if (person.get(j).get(personInfo) == null) {
					
				} else {
					
				}
			}
		}
	}
}

public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        String[] person = br.readLine().split(",");
        
        People people = new People();
        
        for (int i=0; i<number; i++) {
        	people.friend(person);
        }
        
        
        System.out.println(sb);
	}
}
 