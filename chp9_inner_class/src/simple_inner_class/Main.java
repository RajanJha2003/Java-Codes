package simple_inner_class;

class A{
	
  private int a=20;
  
  class B{
	  void meth() {
		  System.out.println(a);
	  }
  }
}


public class Main {
	public static void main(String[] args) {
		A a=new A();
		A.B b=a.new B();
		b.meth();
	}

}
