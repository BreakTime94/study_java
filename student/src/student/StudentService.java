package student;

import java.util.Arrays;

public class StudentService {// 핵심 로직 클래스 CRUD(create read update delete)
	// student 프로그램 과제
	//1. 모든 필드, 메서드, 생성자 > 접근제한자
	// 1-1. 필드 private, 메서드 public, 생성자 public 
	// 1-2. getter, setter
	//2. 어떤 값을 입력하더라도 예외 처리 (프로그램 종료는 정상종료)
	//3. 점수값 입력의 범위 0 ~ 100사이만 인정 예외로도 가능!
	//4. 이름 입력은 한글만 인정, 2글자 ~ 4글자 예외로도 가능!
	//5. 임시데이터의 점수값을 랜덤으로 배정 (60 ~ 100)
	// lesson 8.shape 과제
	// 2차원 도형 직각삼각형 추가(길이, 넓이 그대로), 3차원은 원기둥, 육면체, 삼각기둥 추가하면서, (겉넓이 부피도 추가)
	
	Student[] students = new Student[4];
	Student[] sortedStudents = new Student[students.length];
	int count = 0;
	
	{
		students[count++] = new Student (1, "개똥이", 90, 80, 90);
		students[count++] = new Student (2, "말똥이", 80, 60, 50);
		students[count++] = new Student (3, "소똥이", 40, 90, 70);
		students[count++] = new Student (4, "돼지똥이", 100, 70, 80);
		
		sortedStudents = students.clone();
        rank();
	}
	//Student는 타입이 참조자료형이기 때문에 일단 null 이다. type은 student type 이고, 이는 student class에서 만든 필드를 요소로 구성한다?
	
	// null pointer 오류. 위의 생성한 students 배열을 초기화 해주지 않으면 생기는 오류다.
	// students의 기본 값은 전부 null 이지만, 이는 전부 주소 값이 없기에 공간 자체가 없다고 본다.
	
	// 수정 및 삭제 구현 (학번 불가, 이름 점수 가능), 평균 기능 추가 
	// 추가 입력하고자 할 때, 배열을 먼저 늘리는 기능도 추가
	
	//입력: 학번으로
	//출력: 학생 타입(이름, 점수 등등)
	
	Student findBy(int no) {
		Student student = null;
		for (int i = 0; i < count; i++) {
			if(students[i].no == no) {
				break;
			}
		}
		return student;
	}
	//등록
	 void register() {
		System.out.println("등록 기능");
		int no = StudentUtils.nextInt("학번(1부터 자연수로) > ");
		
		Student s = findBy(no);
		
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다.");
			return;
		}
		
//		for (int i = 0; i < count; i++) {
//			if(students[i].no == no) {
//				System.out.println("이미 등록된 학번입니다.");
//				System.out.println("메인 메뉴로 돌아갑니다.");
//				return;
//			}
//		}	
		String name  = StudentUtils.nextLine("이름 > ");
		int kor = StudentUtils.nextInt("국어점수 > ");
		int mat = StudentUtils.nextInt("영어점수 > ");
		int eng = StudentUtils.nextInt("수학점수 > ");
		if(count == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
			System.out.println(Arrays.toString(students));
		}
		students[count++] = new Student(no, name, kor, eng, mat);
		
		sortedStudents = Arrays.copyOf(students,students.length);
		rank();
	}
	//조회
	 void read() {
		System.out.println("조회 기능"); // 등록 학생 전체 조회
		for(int i = 0; i < count; i++) {
//			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].total() + ", " + students[i].avg());
			print(students);
		}
	}
	 void readOrder() {
		System.out.println("석차순 조회 기능");
		print(sortedStudents);
	}
	
	 void print(Student[] stu) {
		for (int i = 0; i < count; i++) {
			System.out.println(stu[i]);
		}
	}
	//수정
	 void modify() {
		System.out.println("수정 기능"); // 개별 수정
		//학생들 배열에서 입력받은 학번과 일치하는 학생 
		int no = StudentUtils.nextInt("학번 > ");
		Student s = findBy(no);
		
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
			s.name  = StudentUtils.nextLine("이름 > ");
			s.kor = StudentUtils.nextInt("국어점수 > ");
			s.eng = StudentUtils.nextInt("영어점수 > ");
			s.mat = StudentUtils.nextInt("수학점수 > ");
			
			sortedStudents = Arrays.copyOf(students,students.length);
			rank();
			
		
	}
	//삭제
	 void remove() {// 필드(인스턴스 변수 내 저장된 값을 주소값을 지우는 방법을 모색해보자 by 상현
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("학번 > ");
		for (int i = 0; i < count; i++) {
			if(students[i].no == no) {
				System.arraycopy(students, i + 1, students, i, count - 1 - i); // 여기 행에 count--를 넣어도 됨
				count--;
				break;
			}
		}
		sortedStudents = Arrays.copyOf(students,students.length);
		rank();
	}
	 void allAvg() {
		System.out.println("과목별 평균조회");
		double korSum = 0, engSum = 0, matSum = 0, avgSum = 0;
		for(int i = 0; i < count; i++) {
			korSum += students[i].kor;
			engSum += students[i].eng;
			matSum += students[i].mat; 	
		}
		avgSum = (korSum + engSum + matSum) / (double) count;
		System.out.println("총 인원 : " + count);
		System.out.println("국어평균 : " + korSum/(double)count);
		System.out.println("영어평균 : " + engSum/(double)count);
		System.out.println("수학평균 : " + matSum/(double)count);
		System.out.println("총점 평균 : " + avgSum);
	}
	 void rank() {
		System.out.println("총점 석차 조회");
		for(int i = 0; i < count - 1; i++) { 
			int idx = i;
			for(int j = i + 1; j < count; j++) {
				if(sortedStudents[idx].total() < sortedStudents[idx].total()) {
					idx = j;
				}
			}
			Student tmp = sortedStudents[idx];
			sortedStudents[i] = sortedStudents[idx];
			sortedStudents[idx] = tmp;
			System.out.println(Arrays.toString(students));
		}	
		sortedStudents = Arrays.copyOf(students,students.length);
		rank();
		
	}
//	250417 과제 1. 중복학번 학생 등록 방지
	// 2. 점수당 평균값 출력 ex) 국어점수 평균, 수학점수 평균 + 총평균 (신규 메뉴)
	// 3. 석차순 정렬(신규 메뉴) ex) 총점 기준 고득점자 순으로
	// 4. Student 클래스의 toString 재정의 (마트 예제) 기존에 toString은 주소가 나온다. 
	public static void main(String[] args) {
		int[] arr = {5, 3, 2, 1, 4};
		
		// 탐색 n 번 -> 최솟값을 찾는다. 
		// 1, 3, 2, 5, 4 1회차 후 0번 인덱스 고정
		// 1, 2, 3, 5, 4 2회차 0번 1번 인덱스 고정
		// 1, 2, 3, 5, 4 3회차 결과 동일, 0, 1, 2 인덱스 고정
		// 1, 2, 3, 4, 5 4회차 결과 0, 1, 2, 3, 4 번 인덱스 자연스럽게 고정
		
		
		
	}
}
