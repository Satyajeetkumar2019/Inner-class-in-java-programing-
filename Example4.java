class Example4 {
static class A {
private int x=20;
static void m1(){
System.out.println("INNER  STATIC M1 METHOD ");
}//end m1
void m2(){System.out.println("inner class non-static method m2");
}//end m2
}//end class
public static void main(String[] args){
A.m1();
A a1=new A();
a1.m2();
System.out.println(a1.x);


}//end mm of outers






}//end outer class
