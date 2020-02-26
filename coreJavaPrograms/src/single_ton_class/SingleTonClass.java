package single_ton_class;

public class SingleTonClass {
	
	int check;
	
	static SingleTonClass obj = null;
	static int count ;
	
	 private SingleTonClass()
	{
		 
	}
	 
	 static Object getInstance()
	 {
		 if(count==0)
			{
				obj = new SingleTonClass();
				count++;
			}
		return obj;
	 }
	public static void main(String[] args) {
		
		SingleTonClass x = (SingleTonClass) SingleTonClass.getInstance();
		SingleTonClass y = (SingleTonClass) SingleTonClass.getInstance();
		System.out.println("..."+y.check);
	}
}
