package lesson11;

public class ExceptionMain {
	//try, catch, finally, throw, throws
	public static void main(String[] args) {
		int i = 1;
		System.out.println(1);
		try {
		System.out.println(2);
		System.out.println(3 / 0); // excepted 예외상황이 발생하면 바로 catch 블록으로 넘어감
		System.out.println(4);
		}
		catch (NullPointerException e){ // Exception e 는 모든 예외의 조상격 클래스
		System.out.println(5);
		System.out.println(6);
		}
		catch (ArithmeticException e){ // Exception e 는 모든 예외의 조상격 클래스
		System.out.println("a");
		}
		catch(RuntimeException e) { //예외처리를 할 때는 상위클래스를 더 아래에 둔다.
			System.out.println("b");
		}
		finally {
			
		}
		
		System.out.println(7);
		
	}
}
