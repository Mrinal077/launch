package pack;

public class reversestring {

	static String rin= "SUM";
	public static void main(String[] args) {
		
		String rev="";

	for (int i = rin.length()-1 ; i>=0 ; i--) {
		
		 rev= rev+rin.charAt(i);
		
				 
	}
	 System.out.println(rev);
	}

}
