package service;

import java.util.ArrayList;
import java.util.List;

import domain.Customer;
import static utills.BankUtils.*;

public class CustomerService {
	
	private Customer loginCustomer; // 초기값 null null이 아니면 로그인 중
	private List<Customer> customers = new ArrayList<Customer>();
	
	private static CustomerService customerService = new CustomerService();
//	private AccountService accountService = AccountService.getInstance();
	int count = 0;
	public CustomerService() {
	
	}
	public static CustomerService getInstance() {
		return customerService;
	}
	
	{
		customers.add(new Customer(1, "새똥이", "010-1111-2222", "ssa@gmail.com", "ssa", "1234"));
		count++;
	}
	
	
	// loginCustomer의 getter
	public Customer getLoginCustomers() {
		return loginCustomer;
	}
	
	public void login() {
		String id = nextLine("아이디 > ");
		String pw = nextLine("비밀번호 > ");
		
		boolean flag = false;
		System.out.println("로그인");
		for(Customer c : customers) {
			if(c.getId().equals(id) && c.getPw().equals(pw)) {
				flag = true;
				loginCustomer = c;
				System.out.println("로그인이 완료되었습니다.");
				break;
			}
		}
		if(!flag) {
			System.out.println("아이디 또는 비밀번호가 틀렸거나 없는 계정입니다.");
		}
	}
	public void logout() {
		loginCustomer = null;
		System.out.println("로그아웃 되었습니다.");
	}
	
	public Customer findById(String id) {
		for(Customer c : customers) {
			if(c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
	
	public Customer findByTel(String s) {
		Customer c = null;
		for(int i = 0 ; i < customers.size(); i++) {
			if ( s == customers.get(i).getTel() ) {
				c = customers.get(i);
				break;
			}
		}
		return c;
	}
	
	public Customer findByEmail(String s) {
		Customer c = null;
		for(int i = 0 ; i < customers.size(); i++) {
			if ( s == customers.get(i).getEmail() ) {
				c = customers.get(i);
				break;
			}
		}
		return c;
	}
	public Customer findBy(int no) {
		for(Customer c : customers) {
			if(c.getNo() == no) {
				return c;
			}
		}
		return null;
	}
	
	
	public void register() {
		System.out.println("회원가입");
		String name = nextLine("이름 > ");
		String tel = nextLine("전화번호(ex : 010-1111-2222 > ");
		if(!tel.matches("0\\d{2}(\\d{3,4})(\\d{4})")) { // 자바의 정석!
			System.out.println("연락처를 올바르게 기입하여주세요.");
			return;
		}
		String email = nextLine("이메일 > ");
		if(!email.matches("([a-z0-9]*)@([a-z]*).([a-z]{3})")) { // 자바의 정석!
			System.out.println("이메일을 올바르게 기입하여주세요.");
			return;
		}
		String id = nextLine("아이디 > ");
		Customer c = findById(id);
		if(!id.matches("[a-z0-9]*")) {
			System.out.println("ID는 영소문자와 숫자로만 입력하여주세요.");
			return;
		}
		if(c != null) {
			System.out.println("이미 등록된 ID입니다.");
			return;
		}
		String pw = nextLine("비밀번호 > ");
		c = findByTel(tel);
		if(c != null) {
			System.out.println("이미 등록된 연락처입니다.");
			return;
		}
		c = findByEmail(email);
		if(c != null) {
			System.out.println("이미 등록된 이메일입니다.");
			return;
		}
		int no = customers.isEmpty() ? 1 : customers.get(customers.size() -1).getNo() + 1; //{1, 3, 4} 라고 치면 2번 인덱스의 값인 4번 + 1번 인 5번을 부여한다.
		customers.add(new Customer(no, name, tel, email, id, pw));
		
		System.out.println("가입을 축하드립니다.");
	}
	
	public void check() {
		System.out.println("내 정보 조회");
		System.out.println(loginCustomer);
		System.out.println("계좌 정보 조회");
		AccountService.getInstance().print(AccountService.getInstance().findAccountsBy(loginCustomer));
	}
	
	public void modify() { // 연락처 이메일, 비밀번호까지 중복체크 
		System.out.println("내 정보 수정");
		String pw = nextLine("비밀번호 > ");
		
		if(pw.equals(loginCustomer.getPw())) {			
			loginCustomer.setPw(nextLine("비밀번호 수정> "));
			loginCustomer.setTel(nextLine("연락처 수정 > "));
			loginCustomer.setEmail(nextLine("이메일 수정 > "));
			return;
		} 
		else {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}
	}
	
	public void remove() {//count가 아니라 들어온 정보로 삭제처리 비밀번호 기입으로해서 
		System.out.println("탈퇴하기");
		//계좌 존재 경우
		if(!AccountService.getInstance().findAccountsBy(loginCustomer).isEmpty()) {
			System.out.println("계좌가 존재합니다. 해지 후 탈퇴 진행하세요.");
			return;
		}
		
		String pw = nextLine("비밀번호 > ");
		if(pw.equals(loginCustomer.getPw())) {
			if(!nextConfirm("탈퇴하시겠습니까?")) {
				return;
			}
			else {
				customers.remove(loginCustomer); // 만약 계좌가 존재한다면 어떻게 처리할 것인가? 
				loginCustomer = null;
			}
		} 
		else {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}
		System.out.println("회원정보가 삭제되었습니다.");
	}
	
}
