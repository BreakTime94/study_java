 package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentService {// 핵심 로직 클래스 CRUD(create read update delete)
	// student 프로그램 과제
	// 1. 학생예제의 배열 > 리스트로 교체 (arraylist)
	// 2. 이름 유효성을 정규표현식으로 교체
	
	private List<Student> students = new ArrayList<Student>();
	private List<Student> sortedStudents = new ArrayList<Student>();
//	private Student[] students = new Student[4];
//	private Student[] sortedStudents = new Student[students.length];
	private int count ;
	
	
	{
		students.add(new Student (1, "개똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student (2, "말똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student (3, "소똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student (4, "돼지똥이", randomScore(), randomScore(), randomScore()));
//		students[count++] = new Student (1, "개똥이", randomScore(), randomScore(), randomScore());
//		students[count++] = new Student (2, "말똥이", randomScore(), randomScore(), randomScore());
//		students[count++] = new Student (3, "소똥이", randomScore(), randomScore(), randomScore());
//		students[count++] = new Student (4, "돼지똥이", randomScore(), randomScore(), randomScore());
		
//		for(int i = 0; i < count; i++) {
//			students[i].setKor((int)(Math.random() * 41 + 60));
//			students[i].setEng((int)(Math.random() * 41 + 60));
//			students[i].setMat((int)(Math.random() * 41 + 60));
//		}
		for(Student s : students) {
			sortedStudents.add(s);
			count++;
		}
//		System.out.println(sortedStudents);
//		sortedStudents = students.clone();
        rank();

	}
	public int randomScore() {
		return (int)(Math.random() * 41 + 60);
	}
	//Student는 타입이 참조자료형이기 때문에 일단 null 이다. type은 student type 이고, 이는 student class에서 만든 필드를 요소로 구성한다?
	
	// null pointer 오류. 위의 생성한 students 배열을 초기화 해주지 않으면 생기는 오류다.
	// students의 기본 값은 전부 null 이지만, 이는 전부 주소 값이 없기에 공간 자체가 없다고 본다.
	
	// 수정 및 삭제 구현 (학번 불가, 이름 점수 가능), 평균 기능 추가 
	// 추가 입력하고자 할 때, 배열을 먼저 늘리는 기능도 추가
	
	//입력: 학번으로
	//출력: 학생 타입(이름, 점수 등등)
	
	public Student findBy(int no) {		
		//findBy는 배열이든, 리스트든 그 객체의 주소 값을 가져와서 입히는 것.
		//그렇기에, findBy를 통해 student 의 객체 값(주소값)을 가져와서 findBy를 호출한 메서드나 필드로 이동.
		 Student student = null;
		for (int i = 0; i < count; i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i); 
				break;
			}
		}
		return student;
	}
	
//	public boolean checkRange(String subject, int input, int start, int end) {
//		boolean ret = true;
//		if(input < start || input > end) {
//			System.out.println(subject + "값의 범위가 벗어났습니다." + start + " ~ " + end + "사이의 값을 입력해주세요."););
//			ret = false;
//		}
//		return ret;
//	}
	
	public int checkRange(String subject, int input, int start, int end) {
		if(input < start || input > end) {
			throw new IllegalArgumentException(subject + "값의 범위가 벗어났습니다." + start + " ~ " + end + "사이의 값을 입력해주세요.");
		}
		return input;
	}
	public int checkRange(String subject, int input) {
		return checkRange(subject, input, 0, 100);
	}
	
	public String inputName() {
		String name = StudentUtils.nextLine("이름을 입력하세요 >");
//		if(name.length() < 2 || name.length() > 4) {
//		Pattern p = Pattern.compile("[^A-Za-z]{2,4}");//조건문을 2개 만들 필요가 없다

		Pattern p = Pattern.compile("[A-Za-z]+");
		Matcher m = p.matcher(name);
			if(m.matches()) {
				throw new IllegalArgumentException("이름은 한글로 구성되어야합니다.");
			}
		Pattern p1 = Pattern.compile("[가-힣]{2,4}"); // 범위만 나타나는 것이 아니라, 저 앞에 무엇이 2, 4 인지를 알아야 함.
		m = p1.matcher(name);
			if(!(m.matches())) {
				throw new IllegalArgumentException("이름은 2 ~ 4글자로 입력하세요");
			}
		return name;
	}
	
	//등록 setter가 필요 , 기존의 저장된 값을 가져오는 것은 getter
	public void register() {
		System.out.println("등록 기능");
		int no = StudentUtils.nextInt("학번(1부터 자연수로) > ");
	
		Student s = findBy(no);
		
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다.");
			return;
		}
		
//		if(count == students.size()) { //배열 늘리는 코드 테스트해보고 이상하면 수정해야함.
//			
//			students = Arrays.copyOf(students, students.size() * 2);
//		}
		
//		for (int i = 0; i < count; i++) {
//			if(students[i].no == no) {
//				System.out.println("이미 등록된 학번입니다.");
//				System.out.println("메인 메뉴로 돌아갑니다.");
//				return;
//			}
//		}	
		String name  = inputName();
		
		int kor = StudentUtils.nextInt("국어점수 > "); // 조건식 if( kor < 0 || kor > 100) {}
		checkRange("국어", kor);
		
		int eng = StudentUtils.nextInt("영어점수 > ");
		checkRange("영어", eng);
		  
		int mat = StudentUtils.nextInt("수학점수 > ");
		checkRange("수학", mat);
		
		System.out.println("정보 입력 완료");
	
									
		students.add(new Student(no, name, kor, eng, mat));
		

		sortedStudents.add(count, students.get(count)); 
		count++;
		
		
		rank();			
	}

		
	 //메서드의 객체 생성 가능?
	 
	 
	//조회
	public void read() {
		System.out.println("조회 기능"); // 등록 학생 전체 조회
			print(students);
	}
	public void readOrder() {
		System.out.println("석차순 조회 기능");
		print(sortedStudents);
	}
	
	public void print(List<Student> list) {
//		for (int i = 0; i < count; i++) {
			System.out.println(list);
//		}
	}
	//수정
	public void modify() {
		System.out.println("수정 기능"); // 개별 수정
		//학생들 배열에서 입력받은 학번과 일치하는 학생 
		int no = StudentUtils.nextInt("학번 > ");
		Student s = findBy(no);
		//findBy를 통해 온 student는 인스턴스의 주소값이 담겨져 있다. 그렇기에 직접 
		//접근하여서 대입을 하면 주소 값 내의 인스턴스 값이 직접 수정이 된다.
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다.");
			return;
		}
			String name = inputName();
			s.setName(name);
			s.setKor(checkRange("국어", StudentUtils.nextInt("국어점수 > ")));
			s.setEng(StudentUtils.nextInt("영어점수 > ")); 
			s.setMat( StudentUtils.nextInt("수학점수 > "));
			
//			sortedStudents = students;
//			students.get(0).getNo() == no;
//			students.set(, s)
//			students.set(students.get(no), s);
//			sortedStudents.set(count, s);
			rank();
			
		
	}
	//삭제
	public void remove() {// 필드(인스턴스 변수 내 저장된 값을 주소값을 지우는 방법을 모색해보자 by 상현
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("학번 > ");
		for (int i = 0; i < count; i++) {
				if(students.get(i).getNo() == no) {
					students.remove(i);
					sortedStudents.clear(); 
					sortedStudents.addAll(students);
//				System.arraycopy(students, i + 1, students, i, count - 1 - i); // 여기 행에 count--를 넣어도 됨
				count--;
				break;
			}
		}
		
		rank();
	}
	public void allAvg() {
		System.out.println("과목별 평균조회");
		double avgKor = 0, avgEng = 0, avgMat = 0, avgAll = 0;
		for(int i = 0; i < count; i++) {
			avgKor += students.get(i).getKor();
			avgEng += students.get(i).getEng();
			avgMat += students.get(i).getMat(); 	
		}
		avgKor /=(double)count;
		avgEng /=(double)count;
		avgMat /=(double)count;
		
		avgAll = (avgKor + avgEng + avgMat) / (double) 3;
		System.out.println("총 인원 : " + count);
		System.out.println("국어평균 : " + avgKor);
		System.out.println("영어평균 : " + avgEng);
		System.out.println("수학평균 : " + avgMat);
		System.out.println("총점 평균 : " + avgAll);
	}
	public void rank() {
		for(int i = 0; i < count - 1; i++) { 
			int idx = i;
			for(int j = i + 1; j < count; j++) {
				if(sortedStudents.get(idx).total() < sortedStudents.get(j).total()) {
					idx = j;
				}
			}
			Student tmp = sortedStudents.get(i);
			sortedStudents.set(i, sortedStudents.get(idx)); 
			sortedStudents.set(idx, tmp);
		}	
		
	}
//	250417 과제 1. 중복학번 학생 등록 방지
	// 2. 점수당 평균값 출력 ex) 국어점수 평균, 수학점수 평균 + 총평균 (신규 메뉴)
	// 3. 석차순 정렬(신규 메뉴) ex) 총점 기준 고득점자 순으로
	// 4. Student 클래스의 toString 재정의 (마트 예제) 기존에 toString은 주소가 나온다. 
//	public static void main(String[] args) {
//		int[] arr = {5, 3, 2, 1, 4};
		
		// 탐색 n 번 -> 최솟값을 찾는다. 
		// 1, 3, 2, 5, 4 1회차 후 0번 인덱스 고정
		// 1, 2, 3, 5, 4 2회차 0번 1번 인덱스 고정
		// 1, 2, 3, 5, 4 3회차 결과 동일, 0, 1, 2 인덱스 고정
		// 1, 2, 3, 4, 5 4회차 결과 0, 1, 2, 3, 4 번 인덱스 자연스럽게 고정
		
		
		
//	}
}
