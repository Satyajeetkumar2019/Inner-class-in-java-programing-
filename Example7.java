class Example7 { 
static { System.out.println("outer class static block");}
Example7(){System.out.println("outer constructor ");}

static class A{
static{System.out.println("innere static block");}
A(){System.out.println("inner constructor");}
static void m1(){System.out.println("inner claas static method");}
void m2(){System.out.println("inner class non static method");}
public static void main(String[] args){
System.out.println("inner class main method ");
//Example7.A.m1();
//Example7 e=new Example7();
//Example7.e.m1();

}//inner main 
}//end inner class

static void m3(){System.out.println("outer static m3 method");}
void m4(){System.out.println("outer non static m4 method");}
	public static void main(String[] args) {
		System.out.println("outer class main method");
A.m1();
A a=new A();
Example7 ex=new Example7();
ex.m4();
//  Example7.A.m4();


	}//end out main
}//end out class
