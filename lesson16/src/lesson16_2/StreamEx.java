package lesson16_2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		//1. 스트림 생성 방법
		// of(), builder(), generate(), 배열로부터(Arrays.stream), collection(list.stream)으로부터
		
		//2. 스트림의 종류
		//Stream<T>, IntStream, DoubleStream, LongStream
		
		//3. 스트림의 연산
		//최종연산
		// forEach(), 
		// 중간연산
		// filter(), distinct(), map(), flatMap(), peek()
		
		List<Integer> list = IntStream.rangeClosed(1, 10).boxed().sorted((o1, o2)->o2-o1).collect(Collectors.toList()); // boxed는 기본형을 제네릭에 넣을 수 있는 타입으로 변환해주는 역할
		// 가운데에 sorted().를 붙이고 아무것도 하지 않으면 기본적으로 설정된 오름차순을 따라간다. 그게 싫다면 새로 바꿔야 함.
		
		List<Integer> list2 = new Random().ints(10, 0, 10).boxed().peek(System.out :: println).collect(Collectors.toList());
		System.out.println(list2);
		
		boolean result = Stream.of(1, 3, 5, 8).allMatch(i -> i % 2 == 1);
		
		System.out.println(result);
		
		result = Stream.of(1, 3, 5, 8).anyMatch(i -> i % 2 == 1);
		
		System.out.println(result);
		
		
		
		 
	}
}
