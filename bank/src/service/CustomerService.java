package service;

import java.util.ArrayList;
import java.util.List;

import domain.Customer;
import utills.BankUtils;

public class CustomerService {
	
	private Customer loginCustomer; // 초기값 null null이 아니면 로그인 중
	private List<Customer> customers = new ArrayList<Customer>();
	
	private static CustomerService customerService = new CustomerService();
	public CustomerService() {
		
	}
	public static CustomerService getInstance() {
		return customerService;
	}
	
	{
		customers.add(new Customer(1, "새똥이", "010-1111-2222", "ssa@gmail.com", "ssa", "1234"));
	}
	
	
	// loginCustomerd의 getter
	public Customer getLoginCustomers() {
		return loginCustomer;
	}
	
	
	public void register() {
		System.out.println("회원가입");
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
				break;
			}
		}
		if(!flag) {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		}
	}
	public void logout() {
		loginCustomer = null;
		System.out.println("로그아웃 되었습니다.");
	}
	
}
