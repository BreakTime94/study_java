package lesson04;

public class OpEx7 {

	 public static void main(String[] args) {
		
		 int score = 80;
		 
		 String pass = score >= 60 ? "합격" : "불합격" ; 
				 
		 System.out.println(pass);
		 
		 // 연산자 우선 순위 
		 
		 // --var 이건 증감 처리 됨 (char)(-var) - 는 부호 부정, char 형변환 연산자 , 부호 부정부터 var은 피연산자 이므로.
		 
		 // = >> 대입연산자
		 // 복합 대입 연산자
		 
		 // += -= *= /= %= 
		 
		 // += 특히 문자열 계산할 때, 많이 사용함.
		 
		 String str = "";
		 System.out.println(str);
		 str += "추가되는 문자열\n";
		 System.out.println(str);
		 str += "추가되는 문자열\n";
		 System.out.println(str);
	}
}
