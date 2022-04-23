class Test1 {
 int x=20;
class inner{
 int x=21;
	class nestinner{
 int x=30;
public void m1(){
int x=40;
nestinner s=new nestinner();
System.out.println("next inner method "+s.x);
System.out.println("next inner method "+this.x);
System.out.println("next inner method "+inner.x);
System.out.println("next inner method "+Test1.inner.x);
}//end m1 method 
	}//next inner 
}//end inner 

	public static void main(String[] args) {
		Test1.inner.nextinner obj=new Test1().new inner().nestinner();
		obj.m1();
	
		System.out.println("Hello World!");
	}
}
