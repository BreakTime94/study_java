package student;

public class StudentMain {
	public static void main(String[] args) {//학생들 성적관리 시스템 진입 시점
		//사용자로부터 문자열 입력을 받고 싶음
//		String str = StudentUtils.nextLine("값을 입력하세요 >");
//		System.out.println(str);
//		
//		//사용자로부터 숫자 입력을 받고 싶음
//		System.out.println(StudentUtils.nextInt("숫자 입력하세요 >")); 
		
		StudentService service = StudentService.getInstance();
		System.out.println("================학생 점수 관리 프로그램================");
		
			
		for(;;) {
			try {
				switch (StudentUtils.nextInt("1. 등록, 2. 조회 3. 수정 4. 삭제 5. 과목별 평균 6. 석차순 조회 7. 종료")) {
				case 1:
					service.register();
					break;
				case 2:
					service.read();
					break;
				case 3:
					service.modify();
					break;
				case 4:
					service.remove();
					break;
				case 5:
					service.allAvg();
					break;
				case 6:
					service.readOrder();
					break;
				case 7:
					System.out.println("bye~!");
					return;
				default:
					System.out.println("지정된 범위의 숫자만 입력해주세요.");
					break;
				}
			} 
			catch(NumberFormatException e) { // swtich nextInt에서 숫자가 아닌 문자가 나오면, catch 구문으로 가게 됨 register에서 점수 기입에 문자를 입력하면, 오류가 나는데 
				// 서비스 클래스에서는 try catch 가 없기 때문에 try catch 가 있는 메인 메서드로 던져버린다.
				System.out.println("정확한 숫자를 입력하세요.");
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} 
	}
}
