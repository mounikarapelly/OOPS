package javaopps.basic;

public class MethodOverloading {
	
	public static void meth1() {
		System.out.println("meth1 exected"+10);
		
		
	}
	public int  meth1(int a) {
		System.out.println("meth1 executed==>"+20);
		return a ;
		
	}
	
	
	public static void main(String[] args) {
		MethodOverloading aobj = new MethodOverloading();
		aobj.meth1();
		aobj.meth1(10);
		
	}

}
