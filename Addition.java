public class Addition {

	int x;
	int y;
	
	public Addition (int x, int y) {
	
	this.x = x; //use of this; referring to the class variable y.
	this.y = y; //use of this; referring to the class variable y.
	System.out.println("Addition is " + (x+y));
	
	}
	
	public Addition () {
		this (0,0); //use of this; with Addition() constructor initialize integers as 0 and 0. 
		
	}
	
	public static void main (String[] args) {
	
		Addition a;
		a = new Addition (1,2);
		
		System.out.println("Class variable x is " + (a.x));
		System.out.println("Class variable y is " + (a.y));
		
		Addition b;
		b = new Addition ();
		
	}
}

/*
OUTPUT:
Addition is 3
Class variable x is 1
Class variable y is 2
Addition is 0
*/

