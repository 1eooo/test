package CodingAttack191209;

public class A {

	String s = "A 클래스";
	int i = 2012;

	public void print() {
		System.out.println(this.s);
	}
}

class B extends A {
	String s = "B 클래스 ";
	int i = 2013;

	public void print() {
		System.out.println("this.i : "+this.i);
		System.out.println("super.i : "+super.i);
		
		super.i = (++this.i) + 1;

		System.out.println("this.i : "+this.i);
		System.out.println("super.i : "+super.i);
		
		System.out.println(this.s + " + " + i);
	}
}

class C extends B {
	String s = "C 클래스";
	int i = 2014;

	public void print() {
		System.out.println("this.i : "+this.i);
		System.out.println("super.i : "+super.i);
		
		super.i = this.i++;
		
		System.out.println("this.i : "+this.i);
		System.out.println("super.i : "+super.i);
		System.out.println(this.s + " + " + i);
	}
}
