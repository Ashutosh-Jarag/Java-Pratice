class Outer {

		class Inner {
		public void show()
		{

			// Print statement
			System.out.println("HELLO INNERCLASS");
		}
	}
}


public class innerclass {

		public static void main(String[] args)
	{

		// Note how inner class object is created inside
		// main()
		Outer.Inner in = new Outer().new Inner();

		// Calling show() method over above object created
		in.show();
	}
}
