 package student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentService    {// 핵심 로직 클래스 CRUD(create read update delete)
	// student 프로그램 과제
	// 1. 학생정렬 list 활용(comparator 정의) 오버라이딩
	// 별개 과제 
//	 Map을 활용한 문자열 빈도수 체크 Ex250423
	
	private List<Student> students = new ArrayList<Student>();
	private List<Student> sortedStudents;
//	private Student[] students = new Student[4];
//	private Student[] sortedStudents = new Student[students.length];
	
	{
		students.add(Student.builder().no(1).name("개똥이").kor(randomScore()).eng(randomScore()).mat(randomScore()).build());
		students.add(Student.builder().no(2).name("말똥이").kor(randomScore()).eng(randomScore()).mat(randomScore()).build());
		students.add(Student.builder().no(3).name("소똥이").kor(randomScore()).eng(randomScore()).mat(randomScore()).build());
		students.add(Student.builder().no(4).name("돼지똥이").kor(randomScore()).eng(randomScore()).mat(randomScore()).build());
		
//		for(int i = 0; i < count; i++) {
//			students[i].setKor((int)(Math.random() * 41 + 60));
//			students[i].setEng((int)(Math.random() * 41 + 60));
//			students[i].setMat((int)(Math.random() * 41 + 60));
//		} // clone은 기본적으로 protected이기 때문에 override 해서 써야한다. 
		// 리스트는 인터페이스이기 때문에 clone을 하지 못한다. 
//		1. sortedStudents.addAll(students); 방법 0개 짜리 리스트에 4개짜리 리스트를 추가하는 방식
			
		sortedStudents = new ArrayList<Student>(students); // 2번 방법. 생성자를 이용하여 호출을 한다. 
        rank();
	}
	
	private static StudentService studentService = new StudentService();
	
	private StudentService() {
		
	}
	
	public static StudentService getInstance() {
		return studentService;
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
		for (int i = 0; i < students.size(); i++) {
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
//		
		if(!name.matches("[가-힣]{2,4}")) {
			throw new IllegalArgumentException("이름은 2 ~ 4개의 한글로 입력하세요");
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
	
		Student s2 = new Student(no, name, kor, eng, mat); // 각 리스트에서 포함된 객체 값의 주소를 통일하기 위해 임시 변수 생성 및 보관
		
		students.add(s2);
	
		sortedStudents.add(s2);
		
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
		list.forEach(s -> System.out.println(s)); 
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
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
			

			rank();
	}
	//삭제
	public void remove() {// 필드(인스턴스 변수 내 저장된 값을 주소값을 지우는 방법을 모색해보자 by 상현
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("학번 > ");
		Student s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		students.remove(s); // s(student 타입의 객체) 자체를 지워버린다.
		sortedStudents.remove(s);
		
//		rank(); 어차피 사라져도 순위는 그대로 유지가 된다.
	}
	public void allAvg() {
		System.out.println("과목별 평균조회");
//		students.stream().map(s -> s.getKor()); 인티저스트림, 국어 점수만 나열되어 있음. 계속 차원을 줄여서 인티저 단항으로 만드는 것이 목표.
		double avgKor = 0, avgEng = 0, avgMat = 0, avgAll = 0;
		int size = students.size();
		for(int i = 0; i < size; i++) {
			avgKor += students.get(i).getKor();
			avgEng += students.get(i).getEng();
			avgMat += students.get(i).getMat(); 	
		}
		avgKor /=(double)size;
		avgEng /=(double)size;
		avgMat /=(double)size;
		
		avgAll = (avgKor + avgEng + avgMat) / (double) 3;
		System.out.println("총 인원 : " + size);
		System.out.println("국어평균 : " + avgKor);
		System.out.println("영어평균 : " + avgEng);
		System.out.println("수학평균 : " + avgMat);
		System.out.println("총점 평균 : " + avgAll);
	}
	public void rank() {
		Set<Student> set = new TreeSet<>(sortedStudents);
		sortedStudents.clear(); 
		sortedStudents.addAll(set);
		
		// 1. List.sort() 
//		sortedStudents.sort(new Comparator<Student>(){
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return -(o1.total() - o2.total()); // avg로 하면 더블타입이라서 Double.compare(o2.avg(), o1.avg());

//		});
		// 2. TreeSet() 
//		sortedStudents = new ArrayList<>(new TreeSet<>(sortedStudents));
		// 3. Collections (컬렉션을 대상으로 하는 유틸클래스)
//			Collections.sort(sortedStudents, (o1, o2) -> o2,total() - o1.total() );
		
		
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
