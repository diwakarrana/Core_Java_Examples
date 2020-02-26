package enums_example;

public enum EnumInitialization {
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	
	public static void main(String args[])
	{
		EnumInitialization obj = EnumInitialization.TUESDAY;
		System.out.println(obj);
	}
}
