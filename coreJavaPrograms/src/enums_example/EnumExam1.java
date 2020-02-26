package enums_example;

public class EnumExam1 {

	public enum EnumName{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	}
	public static void main(String[] args) {
		
		for(EnumName s : EnumName.values())
		{
			System.out.println(s.ordinal()+" "+s.name());
		}
	}
}


