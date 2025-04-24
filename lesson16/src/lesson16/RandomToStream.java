package lesson16;

import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.stream.IntStream;

public class RandomToStream {
	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println("인트형 난수");
		
		IntStream intStream = random.ints(3);
		
//		intStream.forEach(s -> System.out.println(s));
		intStream.forEach(System.out :: println); //람다식에서 대입타입과 출력타입이 같은 경우는 저렇게도 생략이 가능한다. 인스턴스 메서드 참조
		
//		Math.max(10d, 5d);
		
//		DoubleBinaryOperator dbo = (x, y) -> Math.max(x, y);
		DoubleBinaryOperator dbo = Math::max;
		
		System.out.println(dbo.applyAsDouble(10, 20));
		
//		BiPredicate<String, String> pre = (s1, s2) -> s1.equals(s2); 
		BiPredicate<String, String> pre = String::equals; // 매개변수 매서드 참조
		
		System.out.println(pre.test("what", "the"));
		
		Function<String, Integer> fn = s -> Integer.parseInt(s);
//		Function<String, Data> fn2 = s -> new Data(s);
		Function<String, Data2> fn2 = Data2 :: new ; //생성자 참조
		
//		System.out.println(fn.apply("a"));
		
		System.out.println("================");
		
		IntStream is = random.ints(10, 0, 3);
		is.forEach(System.out :: println); 
		
		System.out.println("long형 난수");
		
		random.longs(3, 0, 10).forEach(System.out :: println);
		
		System.out.println("double형 난수");
		
		random.doubles(3).forEach(System.out :: println);
		
		"ABCD".chars().forEach(i -> System.out.println((char)i)); //  스트림화 char타입을 바로 스트림 할 수 없어서, int로 하고 다시 char로 형 변환		
	}
}

class Data2 {
	String name;
	public Data2(String name) {
		this.name = name;
	}
}
