package service;

import domain.Customer;
import utills.BankUtils;

public class BankService {
	
	public BankService() {
	}
	public static BankService getInstance() {
		return bankService;
	}
	
	private static BankService bankService = new BankService();
	private CustomerService customerService = CustomerService.getInstance();
//	private AccountService accountService = AccountService.getInstance();
	public void menu() throws Exception {
		if(customerService.getLoginCustomers() == null) {	
			int no = BankUtils.nextInt("1. 회원가입 2. 로그인 3. 종료");
			switch(no) {
				case 1 : 
					customerService.register(); break;
				case 2 :
					customerService.login(); break;
				case 3 :
					throw new Exception ("다음에 만나요~!");
				default : System.out.println("정확한 숫자를 눌러주세요."); break;
			}
		}
		else {
			System.out.println("현재 로그인 중입니다."); //이름에 뜨게 하려면 인스턴스 생성?
			int no = BankUtils.nextInt("1. 정보조회 2. 정보수정 3. 회원탈퇴 4. 개설 5. 입금 6. 출금 7. 이체 8. 해지 9. 로그아웃");
			switch(no) {
				case 1 : 
					customerService.check(); break;
				case 2 :
					customerService.modify(); break;
				case 3 :
					customerService.remove(); break;
				case 4 : 
					AccountService.getInstance().open(); break;
				case 5 : 
					AccountService.getInstance().deposit(); break;
				case 6 : 
					AccountService.getInstance().withdraw(); break;
				case 7 : 
					AccountService.getInstance().transfer(); break;
				case 8 : 
					AccountService.getInstance().close(); break;
				case 9 : 
					customerService.logout(); break;
				default : 
					System.out.println("정확한 숫자를 눌러주세요."); break;
			}
		}
	}
}
