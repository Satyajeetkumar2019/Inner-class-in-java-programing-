class A { 

//private static class P{}
//public static class P{}
//protected static class P{}
//final static class P{}
//abstract static class P{}
//strictfp static class P{}
private static class P{
//static veriable 
static int x=90;
int y=20;
static{
System.out.println("inner SB");
}//static b
	{
	System.out.println("inner NSB");
	}//NSB
	static void m1(){
	System.out.println("SM  m1()");
	}//end SM
	void m2(){
	System.out.println("NSM m2()");
	}//end NSM
	public static void main(String[] args){
	System.out.println("inner main method ");
	}//end inner main method
P	(){
System.out.println("inner constructor ");}
}//end inner class P




	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
