/*
  	ISYS 320
  	Name(s): Patrick Quirk	
  	Date: 11/4/17
*/

// 4. Your pseudocode algorithm for how to break down the figure



public class StarFigures { 
	public static void main(String[] args) {
		TwoStarLines();
		FiveStar();
		DoubleSpace();
		TwoStarLines();
		FiveStar();
		TwoStarLines();
		DoubleSpace();
		TripleDot();
		TwoStarLines();
		FiveStar();
		
		
		
}
	public static void TwoStarLines() {
	System.out.println("*****\n*****");
	}

	public static void FiveStar() {
		System.out.println(" * *\n  *\n * *");
	}
	
	public static void DoubleSpace() { 
		System.out.println("\n\n");
	}
	
	public static void TripleDot() {
		System.out.println("  *\n  *\n  *");
	}
}
