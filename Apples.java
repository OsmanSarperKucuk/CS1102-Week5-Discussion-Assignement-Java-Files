public class Apples extends Fruits {
	
	public Apples () {	
		super(); // use of super to call the superclass constructor		
	}
	
	void isDelicious() {
		super.Delicious(); //use of super to call superclass method
	}
	
	{
	super.quantity = 5; // use of super to call superclass variable
	}
	
	public static void main (String[] args) {
		
		Apples applebasket1 = new Apples(); // create an apples object
		
		System.out.print ("Apples are ");
	
		applebasket1.isDelicious();
		
		System.out.print ("applebasket1 has " + applebasket1.quantity +" apples" );
	}
}

/*
OUTPUT:
Apples are Very Delicious
applebasket1 has 5 apples
*/