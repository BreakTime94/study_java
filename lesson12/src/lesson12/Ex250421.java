package lesson12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
		
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=f5k44u30";
		// 프로토콜://도메인/파일명?쿼리스트링(웹상의 파라미터)
		// 1. 위 항목에 맞춰서 문자열 자르기 작업 
		
		// 쿼리스트링의 규칙 (키 = 값) 한쌍임 그런 쌍들이 & 으로 구분이 되어 있다. 
		
		// 쿼리스트링의 자리를 잘라서 표시하자. 값의 쌍은 &로 구분, 키와 값은 =로 구분/ 전부 구분을 해보자.
		
		int quest = url.indexOf("?"); 
//		System.out.println(quest); // 37
//		System.out.println("쿼리 전 값 : " + url.substring(0, quest));
		
		String notQue = url.substring(0, quest);
		String que = url.substring(quest + 1, url.length());
		
//		System.out.println("notQue : " + notQue);
//		System.out.println("que : " + que);
		
		String[] nq = notQue.split(":"); 
		notQue = String.join("", nq);
//		System.out.println(notQue);// https//search.naver.com/search.naver
		
		nq = notQue.split("/");
		
//		System.out.println(Arrays.toString(nq));// [https, , search.naver.com, search.naver]
		
		for(String s : nq) {
			if(s != "") {
				System.out.println(s);
			}
		}
		String[] qu = que.split("&");
		
//		System.out.println(Arrays.toString(qu));
		
		for(int i = 0; i < qu.length; i++) {
			System.out.println((i + 1) + "번째 키 : " + qu[i].split("=")[0] + ", " + (i + 1) + "번째 값 : " + qu[i].split("=")[1]);
		}	
	}
}

