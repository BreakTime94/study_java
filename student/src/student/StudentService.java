package student;

import java.util.Arrays;

public class StudentService {// 핵심 로직 클래스 CRUD(create read update delete)
	Student[] students = new Student[2];

	int count = 0;
	
	{
		students[count++] = new Student (1, "개똥이", 90, 80, 90);
		students[count++] = new Student (2, "말똥이", 80, 60, 50);
	}
	//Student는 타입이 참조자료형이기 때문에 일단 null 이다. type은 student type 이고, 이는 student class에서 만든 필드를 요소로 구성한다?
	
	// null pointer 오류. 위의 생성한 students 배열을 초기화 해주지 않으면 생기는 오류다.
	// students의 기본 값은 전부 null 이지만, 이는 전부 주소 값이 없기에 공간 자체가 없다고 본다.
	
	// 수정 및 삭제 구현 (학번 불가, 이름 점수 가능), 평균 기능 추가 
	// 추가 입력하고자 할 때, 배열을 먼저 늘리는 기능도 추가
	
	//등록
	void register() {
		System.out.println("등록 기능");
		int no = StudentUtils.nextInt("학번(1부터 자연수로) > ");
		for (int i = 0; i < count; i++) {
			if(students[i].no == no) {
				System.out.println("이미 등록된 학번입니다.");
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			}
		}	
		String name  = StudentUtils.nextLine("이름 > ");
		int kor = StudentUtils.nextInt("국어점수 > ");
		int mat = StudentUtils.nextInt("영어점수 > ");
		int eng = StudentUtils.nextInt("수학점수 > ");
		if(count == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
			System.out.println(Arrays.toString(students));
		}
		students[count++] = new Student(no, name, kor, eng, mat);
	}
	//조회
	void read() {
		System.out.println("조회 기능"); // 등록 학생 전체 조회
		for(int i = 0; i < count; i++) {
//			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].total() + ", " + students[i].avg());
			System.out.println(students[i]);
		}
	}
	//수정
	void modify() {
		System.out.println("수정 기능"); // 개별 수정
		//학생들 배열에서 입력받은 학번과 일치하는 학생 
		int no = StudentUtils.nextInt("학번 > ");
		Student s = null;
		for(int i = 0; i < count ; i++) {
			if(students[i].no == no) {
				s = students[i]; // no 값도 같이 복사가 된다. 
				break;
			}
		}
			s.name  = StudentUtils.nextLine("이름 > ");
			s.kor = StudentUtils.nextInt("국어점수 > ");
			s.eng = StudentUtils.nextInt("영어점수 > ");
			s.mat = StudentUtils.nextInt("수학점수 > ");
			
		
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
	}
	void subavg() {
		System.out.println("과목별 평균조회");
		double korsum = 0, engsum = 0, matsum = 0, avgsum = 0;
		for(int i = 0; i < count; i++) {
			korsum += students[i].kor;
			engsum += students[i].eng;
			matsum += students[i].mat; 	
			avgsum += students[i].avg();
		}
		System.out.println("총 인원 : " + count);
		System.out.println("국어평균 : " + korsum/(double)count);
		System.out.println("영어평균 : " + engsum/(double)count);
		System.out.println("수학평균 : " + matsum/(double)count);
		System.out.println("총 평균 : " + avgsum/(double)count);
	}
	void rank() {
		System.out.println("총점 석차 조회");
		Student[] total = new Student[count];
		total = Arrays.copyOf(students, count);
		for(int i = 0; i < count - 1; i++) { // i + 1회차, 비교하는 회수는 전체 배열길이 - 1 (여기서는 count) 그리고 끝까지 가게되면, 어차피 하나는 끝에서 고정이 되게 되어있다.
			for(int j = 0; j < count - 1 - i; j++) {
				if(total[j].total() < total[j + 1].total()) {
					total[j] = 	students[j + 1];	
					total[j + 1] = students[j];
				}
				
			}
		}
		for(int i = 0; i < count; i++) {
			System.out.println(i + 1 + "등 : " + total[i].name + ", " + "총점 : " +total[i].total());
		}
	}
//	250417 과제 1. 중복학번 학생 등록 방지
	// 2. 점수당 평균값 출력 ex) 국어점수 평균, 수학점수 평균 + 총평균 (신규 메뉴)
	// 3. 석차순 정렬(신규 메뉴) ex) 총점 기준 고득점자 순으로
	// 4. Student 클래스의 toString 재정의 (마트 예제) 기존에 toString은 주소가 나온다. 
}
