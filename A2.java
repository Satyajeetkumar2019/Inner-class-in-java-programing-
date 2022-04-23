interface Example1{
public abstract void m3();
}//end interface
  class Sample {
int x=20;
Example1 m1(){
class B implements Example1 {

public void m3(){
System.out.println(" B class m3 method");
}//end m3 method
}//end B class

B b=new B();
m2(b);

return b;
}//end m1
void m2(Example1 e){
e.m3();

}//end m2
}//end class A2
class Test { 

	public static void main(String[] args) {
	Sample.B a1=new Sample().new B();
	//Example e=a1.m1();
	//a1.m3();
		System.out.println("Hello World!");
	}
}