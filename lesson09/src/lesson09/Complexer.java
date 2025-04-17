package lesson09;

public class Complexer implements ComplexerInter {
	@Override
	public void send(String tel) {
		// TODO Auto-generated method stub
		System.out.println(FAX_NUMBER+ "에서 " + tel + "로 FAX 전송");
	}
	
	@Override
	public void receive(String tel) {
		// TODO Auto-generated method stub
		System.out.println(tel + "에서 " + FAX_NUMBER + "로 FAX 수신");
	}
	@Override
	public void scan() {
		System.out.println("스캔실행");
	}
	
	@Override
	public void print() {
		System.out.println("출력실행");
	}
	
}
