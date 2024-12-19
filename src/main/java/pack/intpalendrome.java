package pack;

public class intpalendrome {

	public static void main(String[] args) {

		String s= "12390321";
		int i=0;
		int j= s.length()-1;
		
		for (i=0; i<j;i++)
		{
			if(s.charAt(i)== s.charAt(j))
			{
				j--;
			}
			else {
				System.out.println("it is not palendrome");
				return;
			}
			
		}
		System.out.println("it is palendrome");
		
	}

}
package pack;

public class intpalendrome {

	public static void main(String[] args) {

		String s= "12390321";
		int i=0;
		int j= s.length()-1;
		
		for (i=0; i<j;i++)
		{
			if(s.charAt(i)== s.charAt(j))
			{
				j--;
			}
			else {
				System.out.println("it is not palendrome");
				return;
			}
			
		}
		System.out.println("it is palendrome");
		
	}

}
