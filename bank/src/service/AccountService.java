package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static utills.BankUtils.*;

import domain.Account;
import domain.Customer;

public class AccountService {
	private List<Account> accounts = new ArrayList<Account>();
	
	private static AccountService accountService = new AccountService();
	private AccountService() {
	}
	public static AccountService getInstance() {
		return accountService;
	}
	private CustomerService customerService = CustomerService.getInstance();
	
	//개설
	public void open()	{
//		Account account = new Account();
		int no = accounts.isEmpty() ? 1 : accounts.get(accounts.size() -1).getNo() + 1;
		accounts.add(new Account(no,customerService.getLoginCustomers(), nextLine("비밀번호를 입력하여주십시오 > ")));
	}
	//출력 
	public void print(List<Account> list) {
		for(Account a : list) {
			System.out.println(a);
		}
	}
	//입금
	public void deposit() {
		List<Account> myAccounts = findAccountsBy(customerService.getLoginCustomers());
		print(myAccounts);
		int no = nextInt("입금할 계좌를 입력하세요.");
		Account account = findBy(no);
		if(account == null) {
			System.out.println("없는 계좌번호입니다.");
			return;
		}
		account.setAmount(account.getAmount() + nextLong("입금할 금액을 입력하세요 > "));
	}
	//출금
	public void withdraw() {
		List<Account> myAccounts = findAccountsBy(customerService.getLoginCustomers());
		print(myAccounts);
		int no = nextInt("출금할 계좌를 입력하세요.");
		Account account = findBy(no);
		if(account == null) {
			System.out.println("없는 계좌번호입니다.");
			return;
		}
		long amount = nextLong("출금할 금액을 입력하세요 > ");
		if(account.getAmount() < amount) {
			System.out.println("잔고가 부족합니다.");
			return;
		}
		account.setAmount(account.getAmount() - amount);
	}
	//이체
	public void transfer(){
		List<Account> myAccounts = findAccountsBy(customerService.getLoginCustomers());
		print(myAccounts);
		int no = nextInt("출금할 계좌를 입력하세요.");
		Account account = findBy(no);
		if(account == null) {
			System.out.println("없는 계좌번호입니다.");
			return;
		}
		long amount = nextLong("이체할 금액을 입력하세요 > ");
		if(account.getAmount() < amount) {
			System.out.println("잔고가 부족합니다.");
			return;
		}
		int targetNo = nextInt("이체 대상 계좌번호를 입력하세요 > ");
		Account targetAccount = findBy(targetNo);
		if(targetAccount == null) {
			System.out.println("없는 계좌번호입니다.");
			return;
		}
		String targetName = targetAccount.getCustomer().getName();
		if(!nextConfirm("보내시는 분이 " + targetName + "님이 맞으십니까?")) {
			System.out.println("입금이 취소되었습니다.");
			return;
		}
		account.setAmount(account.getAmount() - amount);
		targetAccount.setAmount(targetAccount.getAmount() + amount);
	}
	//해지
	public void close() {
		List<Account> myAccounts = findAccountsBy(customerService.getLoginCustomers());
		print(myAccounts);
		int no = nextInt("해지할 계좌를 입력하세요.");
		Account account = findBy(no);
		if(account == null) {
			System.out.println("없는 계좌번호입니다.");
			return;
		}
		if(!nextConfirm("삭제하시겠습니까? (남은 잔고는 사라집니다.)")) {
			return;
		}
		accounts.remove(account);
	}
	// 계좌정보조회 customer로 입력 출력 : 리스트<계좌>
	public List<Account> findAccountsBy(Customer c) {
		
//		List<Account> tmp = new ArrayList<>();
//		for(Account a : accounts) {
//			if(customerService.getLoginCustomers() == c) {
//				tmp.add(a);				
//			}
//		}
//		return tmp;
		return accounts.stream().filter(a -> a.getCustomer() == c).collect(Collectors.toList());
	}
	//findBy -- 예시 : 입금을 할 때 어느 계좌에 입금을 할 것인가?
	
	public Account findBy(int no) {
		for(Account a : accounts) {
			if(no == a.getNo()) {
				return a;
			}
		}
		return null;
	}
	
	
	
}
