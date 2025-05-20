package innerclass;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int liv = outerIv;
		int liv2 = outerCv;
	}
	static class StaticInner {
//		int siv = outerIv; static class는 외부 인스턴스 변수 접근 불가
		int siv = outerCv;
		static int scv = outerCv;
	}
	void myMethod() {
		int lv = 0;
		final int Lv = 0;
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = Lv;
		}
		System.out.println(new LocalInner().liv);
	}
	
}
