package innerclass;

public class InnerEx1Main {
	public static void main(String[] args) {		
		InnerEx1 ex1 = new InnerEx1();
		
		System.out.println(InnerEx1.InstanceInner.cv); 
		System.out.println(InnerEx1.StaticInner.CONST);
		ex1.myMethod();
	}
	
	
}
