/*
  	ISYS 320
  	Name(s): Patrick Quirk	
  	Date: 11/4/17
*/

public class RepeatedMessages {
	 public static void main(String[] args) {
		 Loop();
		 	 
	 }
	 
	 public static void Message1() {
	        System.out.println("Milhouse did not test cootie positive.");
	 }
	 
	 public static void Loop() {
		 for(int i = 0; i < 1000; i++) {
			 Message1();
		 }
	 }
}
