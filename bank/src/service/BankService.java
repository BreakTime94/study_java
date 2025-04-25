package service;

import domain.Customer;
import utills.BankUtils;

public class BankService {
	
	private static BankService bankService = new BankService();
	public BankService() {
	}
	public static BankService getInstance() {
		return bankService;
	}
	
	private CustomerService customerService = CustomerService.getInstance();
	
	public void menu() {
		if(customerService.getLoginCustomers() == null) {	
			int no = BankUtils.nextInt("1. 회원가입 2. 로그인 3. 종료");
			switch(no) {
				case 1 : 
					customerService.register(); break;
				case 2 :
					customerService.login(); break;
				case 3 :
					System.out.println("다음에 만나요~!");
			}
		}
		else {
			System.out.println("현재 로그인 중입니다.");
			int no = BankUtils.nextInt("1. 로그아웃");
			switch(no) {
				case 1 : 
					customerService.logout(); break;
			}
		}
	}
}
