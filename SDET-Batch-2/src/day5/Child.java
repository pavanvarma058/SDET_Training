package day5;

class Child extends Parent {
	void marry() {
		System.out.println("Not ready to marry");
	}
	public static void main(String[] args) {
		Child ch = new Child();	
		ch.property();
		ch.marry();
		Parent p = new Parent();
		p.property();
		p.marry();

	}

}
