package service;

import java.util.ArrayList;
import java.util.List;

import domain.Customer;
import utills.BankUtils;

public class CustomerService {
	
	private Customer loginCustomer; // 초기값 null null이 아니면 로그인 중
	private List<Customer> customers = new ArrayList<Customer>();
	
	private static CustomerService customerService = new CustomerService();
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
		String id = BankUtils.nextLine("아이디 > ");
		String pw = BankUtils.nextLine("비밀번호 > ");
		
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
	
	public Customer findById(String s) {
		Customer c = null;
		for(int i = 0 ; i < customers.size(); i++) {
			if ( s == customers.get(i).getId() ) {
				c = customers.get(i);
				break;
			}
		}
		return c;
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
	
	public void register() {
		System.out.println("회원가입");
		String id = BankUtils.nextLine("아이디 > ");
		Customer c = findById(id);
		if(!id.matches("[a-z0-9]*")) {
			System.out.println("ID는 영소문자와 숫자로만 입력하여주세요.");
			return;
		}
		if(c != null) {
			System.out.println("이미 등록된 ID입니다.");
			return;
		}
		String pw = BankUtils.nextLine("비밀번호 > ");
		String tel = BankUtils.nextLine("연락처 > ");
		if(!tel.matches("0\\d{2}(\\d{3,4})(\\d{4})")) { // 자바의 정석!
			System.out.println("연락처를 올바르게 기입하여주세요.");
			return;
		}
		c = findByTel(tel);
		if(c != null) {
			System.out.println("이미 등록된 연락처입니다.");
			return;
		}
		String email = BankUtils.nextLine("이메일 > ");
		if(!email.matches("([a-z0-9]*)@([a-z]*).([a-z]{3})")) { // 자바의 정석!
			System.out.println("이메일을 올바르게 기입하여주세요.");
			return;
		}
		c = findByEmail(email);
		if(c != null) {
			System.out.println("이미 등록된 이메일입니다.");
			return;
		}
		String name = BankUtils.nextLine("이름 > ");
		
		customers.add(new Customer(count++, name, tel, email, id, pw));
	}
	
	public void check() {
		System.out.println("내 정보 조회");
		System.out.println("이름 :" + loginCustomer.getName());
		System.out.println("아이디 :" + loginCustomer.getId());
		System.out.println("연락처 :" + loginCustomer.getTel());
		System.out.println("이메일 : " + loginCustomer.getEmail());
	}
	
	public void modify() { // 연락처 이메일, 비밀번호까지 중복체크 
		System.out.println("내 정보 수정");
		String pw = BankUtils.nextLine("비밀번호 > ");
		
		if(pw.equals(loginCustomer.getPw())) {			
			loginCustomer.setPw(BankUtils.nextLine("비밀번호 수정> "));
			loginCustomer.setTel(BankUtils.nextLine("연락처 수정 > "));
			loginCustomer.setEmail(BankUtils.nextLine("이메일 수정 > "));
			return;
		} 
		else {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}
	}
	
	public void remove() {//count가 아니라 들어온 정보로 삭제처리 비밀번호 기입으로해서 
		String pw = BankUtils.nextLine("비밀번호 > ");
		if(pw.equals(loginCustomer.getPw())) {	
			customers.remove(customers.indexOf(loginCustomer)); 
			loginCustomer = null;
		} 
		else {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}
//		customers.remove(count-1);
		count--;
		System.out.println("회원정보가 삭제되었습니다.");
		return;
	}
	
}
