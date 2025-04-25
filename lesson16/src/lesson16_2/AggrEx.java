package lesson16_2;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class AggrEx {
	public static void main(String[] args) {
		//갯수, 합계, 평균, 최대, 최소
		List<Student> list = List.of(new Student("새똥이", 100), new Student("개똥이", 90), new Student("말똥이", 70));
		
		long count = list.stream().filter(s -> s.score >= 80).count(); // .count();는 타입이 long이다.
		
		System.out.println(count); // 80점 넘는 사람의 수 
		
		int sum = list.stream().mapToInt(s -> s.score).sum(); //합계 일반 스트림은 쓰지 못한다. 그래서 기본 자료형으로 변환해주기 위해 mapToInt로 진행한다.
		
		System.out.println(sum);
		
		OptionalDouble od = list.stream().mapToInt(s -> s.score).average();
		
		System.out.println(od.getAsDouble());
		
		Optional<Student> optinal = list.stream().max((o1, o2) -> o1.name.compareTo(o2.name)); 
		
		System.out.println(optinal);
		
		long min = list.stream().mapToLong(s -> s.score).min().getAsLong(); // getAs 는 optinal type을 기본자료형으로 바꿔주는 역할
		
		System.out.println(min);
		
		Stream.concat(null, null); // 문자열 붙이기 같은 느낌.
		"abcd".concat("1234"); // 근데 문자열은 +로 붙이는게 너무 강력함.
	}
}
