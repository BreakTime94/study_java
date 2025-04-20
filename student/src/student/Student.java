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
	//int total = (kor + eng + mat) / 3; 도 방법이지만 좋지 않다.
	 Student(){
		
	}
	 Student(int no, String name){
		this.no = no;
		this.name = name;
	}
	 Student(int no, String name, int kor, int eng, int mat){
		this(no, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	 int total() {
		
		return kor+eng+mat;
	}
	 double avg() {
		
		return total()/ 3d;
	}
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no, name, kor, eng, mat, avg(), total());  
	}
		
	
}
