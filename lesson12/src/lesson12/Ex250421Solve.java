package lesson12;

import java.util.Arrays;

public class Ex250421Solve {
	public static void main(String[] args) {
		
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=f5k44u30";
		//변수명, 클래스명을 identifier(식별자)라고 한다.
		
		//프로토콜 : // 도메인/ 파일명?쿼리스트링 
		// 1. 위 항목에 맞게 자르기 
		
//		String protocol = url.substring(0, url.indexOf("://"));
//		System.out.println(protocol);
//		url = url.substring(url.indexOf("://") + "://".length());
//		System.out.println(url);
//		
//		String domain = url.substring(0, url.indexOf("/"));
//		System.out.println(domain);
//		url = url.substring(url.indexOf("/") + "/".length());
//		System.out.println(url);
//		
//		String fileName = url.substring(0, url.indexOf("?"));
//		System.out.println(fileName);
//		url = url.substring(url.indexOf("?") + "?".length());
//		System.out.println(url);
//		
//		String queryString = url;
//		System.out.println(queryString);
		
		MyUrl myUrl = new MyUrl(url);
		System.out.println(myUrl);
		
		//split에서 ("?") 는 왜 안될까? 정규표현식이 아니다!
	}
}
class MyUrl{
	String protocol;
	String domain;
	String fileName;
	String queryString;
	Param[] params;
	
	public MyUrl(String url) {
	
		protocol = url.substring(0, url.indexOf("://"));
		url = url.substring(url.indexOf("://") + "://".length());
		
		domain = url.substring(0, url.indexOf("/"));
		url = url.substring(url.indexOf("/") + "/".length());
		
		fileName = url.substring(0, url.indexOf("?"));
		url = url.substring(url.indexOf("?") + "?".length());
		
		queryString = url;
		String[] tmps = queryString.split("&");
		params = new Param[tmps.length];
		for(int i = 0; i < tmps.length; i++) {
//			System.out.println(tmps[i]);
			String[] t = tmps[i].split("=");
			params[i] = new Param(url, url);
		}
		
	}
	// code 자주 사용되는 기능 > 자동생성
	// Source에서 generate toString 신세계가 펼쳐짐

	
	
	@Override
	public String toString() {
		return String.format("MyUrl [protocol=%s, domain=%s, fileName=%s, params=%s]", protocol, domain, fileName,
				Arrays.toString(params));
	} // 오버라이드를 한 번만 하면, params의 경우에는 instance 주소가 나온다. 



	class Param{
		String key;
		String value;
		public Param(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return String.format("Param [key=%s, value=%s]", key, value);
		}
		// 그렇기에, Param에도 똑같이 toString 오버라이드를 해주어야 한다.
	}

	
}
