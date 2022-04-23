class A1 {
int x=20;
class B {
int x=50;
void m1(){

System.out.println(x);
System.out.println(this.x);
System.out.println(A1.this.x);
}//end m1
void m2(){
int x=60;
System.out.println(x);System.out.println(this.x);System.out.println(A1.this.x);
}
}//end B
void m3(){
System.out.println(x);
B b=new B();
System.out.println(b.x);
}//end m3
public static void main(String[] args ){
A1  a1=new A1();
a1.m3();

}//end main

}//end out class
