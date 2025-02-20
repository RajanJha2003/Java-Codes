package passing_class_as_parameter;

class A{
	void meth1() {
		
	}
}


class B{
	void meth2() {
		
	}
}



class C{
	void meth3( A a, B b) {
		a.meth1();
		b.meth2();
		
	}
}


public class Main {
	public static void main(String[] args) {
		C c=new C();
		c.meth3(new A() {
			@Override
			void meth1() {
				// TODO Auto-generated method stub
				System.out.println("class A");
			}
		}, new B() {
			@Override
			void meth2() {
				// TODO Auto-generated method stub
				System.out.println("class B");
			}
		});
		
		
	}

}
