package _02_Generics_Store;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	// There is a generic Cart class that can hold different
	// types of objects.
	//
	// Candy and Cereal are Food objects
	// Clothing and Toy are NonFood objects.

	public static void main(String[] args) {
		// 2. Create a Cart object of type Candy
	//	Cart<Candy> cart1 = new Cart<Candy>();
		// 3. Create another Cart object of type Cereal
	//	Cart<Cereal> cart2 = new Cart<Cereal>();
		// 4. Add a few items to EACH cart
	//	Cereal cereal = new Cereal();
	//	Candy candy = new Candy();
	//	cart1.add(candy);
	//	cart1.add(candy);
	//	cart2.add(cereal);
	//	cart2.add(cereal);
		// 5. Call the showCart() method on EACH cart
	//	cart1.showCart();
	//	cart2.showCart();
		// 6. Run the code

		// 7. Comment out the code you have so far

		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		Cart<Clothing> cart3 = new Cart<Clothing>();
		Cart<Toy> cart4 = new Cart<Toy>();
		Clothing clothing = new Clothing();
		Toy toy = new Toy();
			cart3.add(clothing);
			cart3.add(clothing);
			cart4.add(toy);
			cart4.add(toy);
			cart3.showCart();
			cart4.showCart();
		// Why are there errors?
			
//Compile errors occur because the cart class is a bounded type Generic class and only extends the food class, not the non-food class.
			
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit

		// 10. Run the code. Does it work?
//Yes!!
	}
}
