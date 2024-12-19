package launch;

public class leapyear{
	
	public static void main(String[] args) {
	int i=2025;

 boolean leap = true;
 
 if ( i% 4== 0) {
	 
	 if (i% 100 == 0) {
		 if(i% 400 ==0) {
			 leap = true;
		 }		 
			 else 
				 leap= false;	 
			 
		 }
	 }
 
	
if (leap) {
	
System.out.println("it is a leap year");
}
else {
	System.out.println("Not a leap year");
}
	
}}

