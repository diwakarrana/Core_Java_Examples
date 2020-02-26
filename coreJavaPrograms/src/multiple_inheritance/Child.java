package multiple_inheritance;

public class Child implements InterfaceFirst, InterfaceSecond {

	public static void main(String[] args) {
		new Child().display();
	}
	@Override
	public void display() {
		System.out.println("Hi its working fine");	
	}
}
