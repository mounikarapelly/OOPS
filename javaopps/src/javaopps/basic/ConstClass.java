package javaopps.basic;

public class ConstClass {
	/*
	 * public ConstClass() {// creating constructor System.out.println("hello");
	 * System.out.println("non -parametrized"); System.out.println(new
	 * ConstClass(100));
	 * 
	 * } ConstClass(String s){ System.out.println(s); } ConstClass (int a){
	 * System.out.println("a value=>"+a); System.out.println(new
	 * ConstClass().meth2(11, 12)); }
	 */
	
       void meth1() {
		System.out.println("HII");
		//new ConstClass("java");
		//System.out.println(new meth2 (10,12));
		//.meth2(11,12);
		
		
		
	}
	public int meth2( int a,int b) {
		System.out.println(a+b);
		return a+b+54;
		
	}

	public static void main(String[] args) {
		ConstClass obj= new ConstClass();
		//obj.meth2(12, 10);
          obj.meth1();
		 //new ConstClass().meth1();
	}

}
