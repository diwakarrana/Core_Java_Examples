package staticVsDynamicBinding;

public class Child extends Parent {

protected String var = "Child VARIABLE";
	
	 public void m1()
	{
		System.out.println("Child virtual function");
	}
	
	static protected void m2() {
		System.out.println("Child static method");
	}
	
	private void m4() {
		System.out.println("Parent private method");
	}
	
}
