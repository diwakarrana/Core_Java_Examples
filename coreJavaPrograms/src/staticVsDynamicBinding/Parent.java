package staticVsDynamicBinding;

public class Parent {
	
	protected String var = "Parent VARIABLE";
	
	public void m1()
	{
		System.out.println("Parent virtual function");
	}
	
	static protected void m2() {
		System.out.println("Parent static method");
	}
	
	final protected void m3() {
		System.out.println("Parent final method");
	}
	
	private void m4() {
		System.out.println("Parent private method");
	}
	
	public void test() {
		System.out.println(this.var);
		m1();
		m2();
		m3();
		m4();
	}
}
