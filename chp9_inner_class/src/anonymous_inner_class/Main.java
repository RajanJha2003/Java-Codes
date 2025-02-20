package anonymous_inner_class;

interface A{
	void meth1();
}


abstract class B{
	abstract void meth2();
}


class C{
	void meth3() {
		
	}
}


public class Main {
	public static void main(String[] args) {
		A a=new A() {
			
			@Override
			public void meth1() {
				// TODO Auto-generated method stub
				System.out.println("A class meth1");
				
			}
		};
		a.meth1();
		
		
		B b=new B() {
			
			@Override
			void meth2() {
				// TODO Auto-generated method stub
				System.out.println("b class meth2");
				
			}
		};
		b.meth2();
		
		
		C c=new C() {
			void meth3() {
				System.out.println("c class  meth3");
			}
			
		};
		c.meth3();
	}

}
