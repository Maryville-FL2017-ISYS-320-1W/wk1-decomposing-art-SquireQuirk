/*
  	ISYS 320
  	Name(s): Patrick Quirk	
  	Date: 11/4/17
*/

// 1. Your predicted output 
// This is message 1. This is message 2. This is message 1. Done with message 2. Done with main. 
 

public class Tricky {
    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }
    
    public static void message1() {
        System.out.println("This is message1.");
    }
    
    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message 2.");
    }
}


// 3. Were you correct? Explain any differences
// I did not expect for the message to be printed out in a new line. I guess that is what System.out.printIn does.
 
 

