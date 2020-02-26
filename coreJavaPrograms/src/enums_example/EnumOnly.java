package enums_example;

public enum EnumOnly {
	SUNDAY,MONDAY,TESUDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	
	public static void main(String args[])
	{
		for(EnumOnly s : EnumOnly.values())
		{
			System.out.println(s);
		}
		System.out.println();
	}
}
