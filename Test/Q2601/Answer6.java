package Q2601;

import java.util.ArrayList;
import java.util.Scanner;

class MemberVO{
	private String id;
	private String pw;
	private String name;
	private String date;
	private String phone;
	private int memberNumber;
	
	MemberVO(String id, String pw, String name, String date, String phone, int memberNumber){
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.date=date;
		this.phone=phone;
		this.memberNumber =memberNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getmemberNumber() {
		return memberNumber;
	}
	
	public void setmemberNumber(int memberNumber) {
		this.memberNumber=memberNumber;
	}
	
	public void setString() {
		System.out.println("회원번호: #"+memberNumber);
		System.out.println("아이디: "+id);
		System.out.println("비밀번호: "+pw);
		System.out.println("이름: "+name);
		System.out.println("날짜: "+date);
		System.out.println("폰 번호: "+phone);
		
	}

public static class Answer1 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<MemberVO> list1 = new ArrayList<MemberVO>();
	
	public static void main(String[] args) {
		System.out.println("<<<회원 데이터 관리 프로그램>>>");
		boolean loop = true;
		while(loop) {
			int menuNum = showMenu();
			
			switch(menuNum) {
			case 1: 
				System.out.println("종료합니다.");
				loop = false;
				break;
			case 2:
				insertNewMember();
				break;
			case 3:
				searchMemberByName();
				break;
			case 4:
				deleteMemberById();
				break;
			case 5:
				showAllMembers();
				break;
			}
			
		}
		
	}
	static int showMenu() {
		System.out.println("----------");
		System.out.println("1.종료");
		System.out.println("2.회원 데이터 추가");
		System.out.println("3.회원 데이터 검색");
		System.out.println("4.회원 데이터 삭제");
		System.out.println("5.전체 회원 데이터 보기");
		System.out.println("----------");
		System.out.print("입력> ");
		
		int menu = sc.nextInt();
		return menu;
	}
	
	static void insertNewMember() {
		System.out.print("<회원 데이터 추가>");
		System.out.print("아이디 입력: ");
		String id = sc.next();
		System.out.print("비밀번호 입력: ");
		String pw = sc.next();
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("생년월일(yymmdd) 입력: ");
		String date = sc.next();
		System.out.print("폰 번호 입력: ");
		String phone = sc.next();
		
		list1.add(new MemberVO(id,pw,name,date,phone,list1.size()+1));
		System.out.println("추가되었습니다.");
	}
	
	static void searchMemberByName() {
		System.out.print("검색할 이름을 입력하세요: ");
		String name = sc.next();
		boolean result=false;
		
		for(int i=0; i<list1.size(); i++) {
			if(list1.get(i).getName().equals(name)) {
				result = true;
				System.out.println(list1.get(i));
			}
		} if(result) {
			System.out.println(name+"은(는) 존재하는 회원입니다.");
		} else {
			System.out.println(name+"은(는) 존재하지 않는 회원입니다.");
		}
	}
	
	static void deleteMemberById(){
		System.out.print("삭제할 아이디를 입력하세요: ");
		String id = sc.next();
		
		for(int i=0; i<list1.size(); i++) {
			if(list1.get(i).getId().equals(id)) {
				list1.remove(i);
			} System.out.println("삭제되었습니다.");
		}
	}
	
	static void showAllMembers() {
		for(MemberVO memberVO : list1) {
			System.out.println(memberVO);
		}
	sc.close();	
	}
	
}