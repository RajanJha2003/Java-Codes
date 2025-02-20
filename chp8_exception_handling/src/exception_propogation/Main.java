package exception_propogation;

import java.io.IOException;

class A{
	void meth() throws IOException {
		IOException io=new IOException();
		throw io;
	}
}


class B {
	
	void meth1() throws IOException {
		A a=new A();
		a.meth();
	}
	
}



public class Main {
	public static void main(String[] args) {
		B b=new B();
		try {
			b.meth1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
