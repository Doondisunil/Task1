package Inheritance;
class A{
	int a=10;
	int b=20;
	public void sum() {
		System.out.println(a+b);
	}
}
class B extends A{
	int c=30;
	public void add() {
		System.out.println(a+b+c);
	}
}
public class Inheritance{
	public static void main(String[] args) {
		B ob1=new B();
		ob1.sum();
		ob1.add();		
	}
}