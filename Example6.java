
class Example6 { 
	static {
	System.out.println("outer class load");}
static class A {
	static {
	System.out.println("inner class load");}
public static void main(String[] args){
System.out.println("inner main ");
}//end inner main
}//end inner class




	public static void main(String[] args) {
	A.main(new String[]{"skaj"});
		System.out.println("outter main !");
	}
}
