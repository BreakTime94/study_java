package lesson15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsumerEx {
	public static void main(String[] args) {
		List<Integer> list = List.of(5, 4, 1, 3, 2); // 최초 Integer로 제네릭을 정의 했기 때문에 생략이 가능
//		Consumer<Integer> con = t -> System.out.println(t);
		list.forEach(t -> System.out.println(t));
		
		Map<String, Integer> map = new HashMap<>(Map.of("A", 10,"B", 20));
		
		System.out.println(map.getClass().getName());
		
		System.out.println(map);
		
		
		map.forEach((k,v) -> System.out.println(k + " :: " + v));
		
		DoubleConsumer dc = d -> System.out.println(Math.round(d)); // 반올림
		
		dc.accept(10.5);
		
		ObjDoubleConsumer<String> odc = (s, d) -> {};
		
		Supplier<String> supplier = () -> "12345";
		
		System.out.println(supplier.get());
		
		//1 - 100 List 
		
		System.out.println(IntStream.range(1, 101).boxed().collect(Collectors.toList())); // 1부터 100까지 담음 
		System.out.println(IntStream.range(1, 101).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList()));  //1부터 100중 짝수만
		
		
		BiFunction<String, Integer, Boolean> bf = (s, i) -> s.equals(i + "");
		BiPredicate<String, Integer> bp = (s, i) -> s.equals(i + "");
		DoublePredicate dp = d -> d == 0;
		
		UnaryOperator<Integer> uo = i -> i; // 리턴타입도 Integer
		
		
	}
}
