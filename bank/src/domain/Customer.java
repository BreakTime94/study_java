package domain;

public class Customer {
	//이름, 연락처, 이메일, 회원번호, 아이디, 비밀번호
	private int no; // 회원번호
	private String name; // 이름
	private String tel; 
	private String email;
	private String id;
	private String pw;
	
	
	public Customer() {}

	public Customer(int no, String name, String tel, String email, String id, String pw) {
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.id = id;
		this.pw = pw;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return String.format("[회원번호 = %s, 이름 = %s, 연락처 = %s, 이메일 = %s, 아이디 = %s, ", no, name, tel, email, id);
	}
	
	
	
	//기본생성자
	//모든 필드 사용 생성자
	
	
	
}
