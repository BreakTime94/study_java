package lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(10, 30, 40, 20, 20, 40, 50, 10, 20);
		// of 이후 들어간 값에 의해서 결정이 된다. l을 붙이면, Number형태로 바뀜
		stream.forEach(i -> System.out.println(i)); // for Each는 최종연산자, 내부반복용으로 사용 이렇게 진행한 경우 스트림을 소비했다고 말함.
		stream = Stream.of(10, 30, 40, 20, 20, 40, 50, 10, 20); // 또 쓰고 싶으면 다시 정의해서 사용해야함.
		stream.forEach(i -> System.out.println(i));
		//배열 스트림화 방법
		int [] arr = {1, 2, 3, 4, 5};
		IntStream is = Arrays.stream(arr);
		
		List<String> list = List.of("새똥이", "개똥이");
		//배열은 . stream();
		Stream<String> stream2 = list.stream();
		stream2.forEach(s -> System.out.println(s));
		
		Stream <Object> stream3 = Stream
			.builder()
			.add("가")
			.add("나")
			.add("다")
			.build();
		stream3.forEach(s -> System.out.println(s));
		
		
		Stream<String> stream4 = Stream.generate(() -> "abcd").limit(10); //얘는 스트림 길이가 무제한이다. .limit을 걸어서 갯수 제한을 둬야 함
		stream4.forEach(s -> System.out.println(s));
		Stream<Integer> stream5 = Stream.iterate(1, i -> i + 1).limit(10);
		stream5.forEach(s -> System.out.println(s)); 
		
	}
}
