package CodingAttack191209;

public class study {
	public static void main(String[] args) {
		C c = new C();
		B b = new B();
		A a = new B();

		a.print();
		
		System.out.println(a.i);
		
		b = c;
		
		b.print();
		
		System.out.println(b.i);

		a = b;
		a.print();
		
		
		System.out.println(a.i);
	}
}