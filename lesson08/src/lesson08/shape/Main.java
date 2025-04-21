package lesson08.shape;

public class Main { // 꼭 복습을 하자 인터페이스와 추상클래스를 같이 복습하는 아주 좋은 예제
	public static void main(String[] args) {
		Circle circle = new Circle(3);
//		System.out.println(circle.area());
//		System.out.println(circle.circum());
		
		Rect rect = new Rect(4, 5);
//		System.out.println(rect.area());
//		System.out.println(rect.circum());
		
		Cylinder cylinder = new Cylinder(new Circle(4), 5);
		
		Shape[] shapes = {circle, rect, cylinder}; // 조상 타입으로 자손 인스턴스 들어가는 것 문제 없음.
		// 배열을 편하게 관리하기 위해서는 조상 타입을 주석처리하면 안됨.
		// shape를 가지고 인스턴스를 만든적이 없기 때문에 조상타입에 있는 return 값 0이 나오지 않는다. override의 특징을 통해 개별 자손타입들을 편하게 움직이게 함.
		for(int i = 0; i <shapes.length; i++) {
			System.out.println("=====================" + shapes[i].getClass().getSimpleName() + "==================="); //소속 클래스 표시 동적 바인딩을 통해서 진행 가능
			System.out.println("넓이 : " + shapes[i].area());
			if(shapes[i] instanceof Shape2D) { // 2차원 도형일 때,
				System.out.println("둘레 : " + ((Shape2D)shapes[i]).circum());
			}
			else if(shapes[i] instanceof Shape3D) {
				System.out.println("둘레 : " + ((Shape3D)shapes[i]).volume());
				
			}
		}
		
		System.out.println("=========================");
		for(Shape s : shapes) {
			System.out.println(s);
		}
		System.out.println("=========================");
		System.out.println(circle);
	}
}
