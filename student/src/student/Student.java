package student;

//Data class 학생들의 개별정보 입력 (대부분 인스턴스 변수) 학번의 목적 = 구별
public class Student implements Comparable<Student> { //수욱제에에
	// 1. StudentMain의 나머지 기능 구현(메시지 출력)
	// 2. Student의 생성자 구현
	// 기본생성자 + (학번, 이름), (다섯개의 필드를 다 사용)
	
	//학생 1인의 총점, 평균을 계산 한다면? 
	// 어떻게 처리 할 것인가?
	// 클래스 내에 getter or setter를 선언할 위치 
	// 1. 필드
	// 2. 생성자
	// 3. getter/setter 순서는 상관없으나, 일반적으로 이런 순서대로 작성을 한다. 
	// 4. 추가적인 메서드
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	//int total = (kor + eng + mat) / 3; 도 방법이지만 좋지 않다.
	 public Student(){
		
	}
	 public Student(int no, String name){
		this.no = no;
		this.name = name;
	}
	 public Student(int no, String name, int kor, int eng, int mat){
		this(no, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	 
	 // 
	 // no , name, kor, eng, mat boolean type은 getter를 is라고 표시 get이라고 붙이지 않음
	 public int getNo() {
		 return no;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public int getKor() {
		 return kor;
	 }
	 
	 public int getEng() {
		 return eng;
	 }
	 
	 public int getMat() {
		 return mat;
	 }
	 public void setNo(int no) {
		 this.no = no;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setKor(int kor) {
		 this.kor = kor;
	 }
	 public void setEng(int eng) {
		 this.eng = eng;
	 }
	 public void setMat(int mat) {
		 this.mat = mat;
	 }
	 
	 
	 public int total() {
		
		return kor+eng+mat;
	}
	 public double avg() {
		
		return total()/ 3d;
	}
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no, name, kor, eng, mat, avg(), total());  
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return -(this.total() - o.total()); // name.compareTo(o.name);
	}
	
	public static Builder builder(){
		return new Builder() ;
	}
	static class Builder{
		private int no;
		private String name;
		private int kor;
		private int eng;
		private int mat;
		
		public Builder no(int no) {
			this.no = no;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder kor(int kor) {
			this.kor = kor;
			return this;
		}
		public Builder eng(int eng) {
			this.eng = eng;
			return this;
		}
		public Builder mat(int mat) {
			this.mat = mat;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}
	
	private Student(Builder builder) {
		this.no = builder.no;
		this.name = builder.name;
		this.kor = builder.kor;
		this.eng = builder.eng;
		this.mat = builder.mat;
	}
	
	public static void main(String[] args) { //빌더는 new 연산자 대신에 
		Student student = Student.builder().no(1).name("새똥이").kor(90).build(); // 스태틱메서드로서의 builder가 필요하고 반환했을 때, 학생타입을 반환해야함.
		student = Student.builder().no(3).name("염병이").eng(77).build();
		System.out.println(student);
	}
	//메서드 체이닝이란 체인을 계속 진행하면서 자기 자신의 주소값(참조값)을 반환한다.
	
}
