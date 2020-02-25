package var_args;

public class Var_Args_Addition {

	public static void main(String[] args) {
		System.out.println("enter values you want to add");
		int sum1 = add(12, 24);
		int sum2 = add(12, 24, 36);
		int sum3 = add(12, 24, 36, 72);
		int sum4 = add(12, 24, 36, 72, 45, 67,68);
		System.out.println(sum1+" "+sum2+" "+sum3+" "+sum4);

	}
	
	public static int add(int... operands)
	{
		int sum = 0;
		for(int x : operands)
		{
			sum += x;
		}
		return sum;
	}

}
