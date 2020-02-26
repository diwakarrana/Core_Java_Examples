package enums_example;

enum EnumConstructor1 {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	
	static String str = "Diwakar";
	
	EnumConstructor1(){
		System.out.println("constructor is running for "+this.toString());
	}
	
	static void myName() {
		System.out.println("my name is "+str);
	}
}//end of enum

public class EnumConstructor{

	public static void main(String[] args) {
		EnumConstructor1.myName();
	EnumConstructor1 obj = EnumConstructor1.MONDAY;
		System.out.println("external "+obj);
		obj.myName();
	}
}
