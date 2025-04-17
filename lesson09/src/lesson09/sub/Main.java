package lesson09.sub;

public class Main {
	public static void main(String[] args) {
//		Animal animals2 = new Animal();
		Animal[] animals = new Animal[10];
		animals[0] = new Human();
		animals[1] = new Human();
		animals[2] = new Dog();
		animals[3] = new Parrot();
		
		Talkable[] talkables = new Talkable[3];
		
		talkables[0] = new Human();
		talkables[1] = new Parrot();
		talkables[2] = new Speaker();
		for(Talkable t : talkables) {
			t.talk();
			
		}
		
		Human human = new Human();
		Dog dog = new Dog();
		System.out.println(human instanceof Human); 
		System.out.println(human instanceof Animal); // Animal을 상속 받았기 때문에 참 
		System.out.println(human instanceof Talkable); // 휴먼 객체를 Talkable의 객체가 될 수 있는가?
		System.out.println(dog instanceof Talkable); // false 
		 
	}
}
