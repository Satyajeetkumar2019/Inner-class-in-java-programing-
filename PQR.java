class PQR { 
static int a=10;
int b=20;
      void m1(final int c ,int d){
         final int e=10;
                 int f=10;
             class B {
                     void m1(){
                              System.out.println(a);
                              System.out.println(b);
                             System.out.println(c);
                             System.out.println(d);
							 System.out.println(e);
							 System.out.println(f);
                           }//end inner m1 method 
              
                void m2(){
                           class C {
                                  void m2(){
                                      System.out.println(a);
                                     System.out.println(b);
                                   // System.out.println();
                                  }//end inner  m2
                           }//end C
                     }//end outer m2
                }//end CLASS B
	 }//end OUTER METHED 
	public static void main(String[] args) {
	
PQR p1=new PQR();    PQR p2=new PQR();
p1.a=5;                             p2.a=7;
p1.b=6;                            p2.b=8;
p1.m1();                          p2.m1();
p1.m2();                           p2.m2();


		System.out.println("Hello World!");
	}//end maon method 
}//end class pqr
