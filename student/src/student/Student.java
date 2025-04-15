package student;

//Data class 학생들의 개별정보 입력 (대부분 인스턴스 변수) 학번의 목적 = 구별
public class Student { //수욱제에에
	// 1. StudentMain의 나머지 기능 구현(메시지 출력)
	// 2. Student의 생성자 구현
	// 기본생성자 + (학번, 이름), (다섯개의 필드를 다 사용)
	
	//학생 1인의 총점, 평균을 계산 한다면? 
	// 어떻게 처리 할 것인가?
	
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	Student(){
		
	}
	Student(int n, String na){
		no = n;
		name = na;
	}
	Student(int a, String b, int ko, int en, int ma){
		no = a;
		name = b;
		kor = ko;
		eng = en;
		mat = ma;
	}
	
}
