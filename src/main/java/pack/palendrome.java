package pack;

public class palendrome {

	public static void main(String[] args) {

		String x= "abcfdcba";
		int i=0;
		int j= x.length()-1;
		
		for(i=0;i<j;i++)
		{
			if (x.charAt(i)==x.charAt(j))
			{
				j--;
			}
			else {
				System.out.println("not palendrome");
				return;
			}
		}
		
		
		System.out.println("it is palendrome");
	}

}
