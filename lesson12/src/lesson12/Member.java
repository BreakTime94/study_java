package lesson12;

public class Member implements Cloneable{
	String name; 
	String tel;
	
	Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String tostring() {
		return"name :" + name + "tel : " + tel;
	}
	
	public boolean equals(Object obj) {
		return obj != null && obj instanceof Member && ((Member)obj).tel.equals(this.tel);
	}
	
	public Member clone() {// 원래는 Object 이지만 Member로 진행할 수 있다. 왜냐 Object 클래스는 최상위니까!
		Member member = null; 
		try {
			member = (Member)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return member;
//        try{
//            return super.clone();
//        } catch (CloneNotSupportedException e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }
//        return null;
	}
}
	
