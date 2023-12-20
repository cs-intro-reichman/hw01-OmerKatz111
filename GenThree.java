/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here	
	    int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		double ran1, ran2, ran3;
		ran1 = Math.random();
		ran2 = Math.random();
		ran3 = Math.random();
		int n1 = (int) (((b - a) * ran1) + a);
		int n2 = (int) (((b - a) * ran2) + a);
		int n3 = (int) (((b - a) * ran3) + a);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println("The minimal generated number was " + Math.min(n1,Math.min(n2,n3)));
	}   
}
