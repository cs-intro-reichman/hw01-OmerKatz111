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
		int r; // r will indicate the range
		ran1 = Math.random();
		ran2 = Math.random();
		ran3 = Math.random();
		// its not clear if the first has to be smaller, so in that case we will make sure which one is the bigger
		if (b > a){
			r = b - a;
		int n1 = (int) ((r * ran1) + a);
		int n2 = (int) ((r * ran2) + a);
		int n3 = (int) ((r * ran3) + a);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println("The minimal generated number was " + Math.min(n1,Math.min(n2,n3)));
		}
		else {
			r = a - b;
			int n1 = (int) ((r * ran1) + b);
		int n2 = (int) ((r * ran2) + b);
		int n3 = (int) ((r * ran3) + b);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println("The minimal generated number was " + Math.min(n1,Math.min(n2,n3)));
			
	}   
}
}