package launch;

public class Encapsulation {
	
	private int age=10;  //instance veriables
	private String name="komal";
	
		public int getage()
		{
			return age;
		}
		public String getname()
		{
			return name;
		}
	public int setage(int a)
	{
		return a;
	}

		
		public static class one{

			public static void main(String[] args) {
				int a=87;

		Encapsulation obj= new Encapsulation();
System.out.println(obj.getage());
obj.setage(a);
System.out.println(a);

	}
	
		}

}
