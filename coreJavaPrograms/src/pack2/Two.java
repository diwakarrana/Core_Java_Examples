package pack2;

import pack1.One;

public class Two {

	public static void main(String[] args) {
		System.out.println("p2.two main method");
		One obj1 = new One();
		obj1.fun();
		pack1.Two obj2 = new pack1.Two();
		obj2.fun();
	}

}
