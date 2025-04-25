package lesson16_2;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {
		Optional<Integer> optional = Optional.ofNullable(null); // Null 처리의 추가연산용 리스트
		
		System.out.println(optional.orElse(20)); // orElse null이었을 때, 대체 값을 이것으로 쓰겠다.
		System.out.println(optional.orElseGet(() -> 30)); 
		
		if(optional.isPresent()) { // 이게 or Else get이랑 같은거임
			System.out.println(optional.get());
		}
		else {
			System.out.println(50);
		}
		
		
		System.out.println(optional.isPresent());
		System.out.println(optional.isEmpty());
		
		optional.ifPresent(System.out :: println); // 존재한다면, 할 일을 진행하라
		
		optional.orElseThrow(() -> new RuntimeException("값 없다 임마")); // 예외상황 발생시 처리 가능
	}
}
