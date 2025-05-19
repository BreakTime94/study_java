package minireview;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
//	List<Customer> custoemrs = new ArrayList<Customer>();
	UserService userService = new UserService();
	void register() {
		Customer customer = new Customer("3", "새똥이", "3");
		boolean r = userService.register(customer); // boolean 타입
		if(r) {
			System.out.println("등록이 완료되었습니다.");
		}
	}
	Customer findBy(String id) {
		return userService.findBy(id, Customer.class);
	}
	
	List<Customer> customers(){
		return userService.getUsers(Customer.class);
	}
	
	public static void main(String[] args) {
		CustomerService service = new CustomerService();
		service.register();
		System.out.println(service.findBy("1"));
		System.out.println(service.findBy("2"));
		System.out.println(service.findBy("3"));
		
	}
}
