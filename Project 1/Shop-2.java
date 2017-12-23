import java.util.Scanner; 
public class Shop {
	public static Scanner scan = new Scanner(System.in); 
	public static String name;
	public static int function, amount;
	public static double total, discount;
	public static boolean setup = false;
	public static boolean buy = false;

	public static void main(String[] args){
		run();
	}
	public static void run(){

		System.out.println("This function supports 4 functions. ");
		System.out.println("  " + "1. Setup Shop");
		System.out.println("  " + "2. Buy");
		System.out.println("  " + "3. List Items");
		System.out.println("  " + "4. Checkout");
		System.out.print("Please choose the function you want: ");
		int function = scan.nextInt();

		if (function == 1){
			setupShop();
		}
		if (function == 2) {
			buy();
		}
		if (function == 3) {
			listItems(int[] amounts, String[] names, double[] prices, int MAX);
		}
		if (function == 4){
			checkOut(int MAX, int[] amounts, double[] prices);
		}
		if (function >= 5){
			System.out.println("Error: do not know function" + function);
			run();
		}
	}    

	public static void setupShop(){
		int MAX;

		System.out.print("Please enter the number of items: ");
		MAX = scan.nextInt();
		String[] names = new String[MAX]; 
		double[] prices = new double[MAX]; 
	

		for (int i = 0; i < MAX; i++) {

			System.out.print("Enter the name of product " + i + ": ");
			names[i] = scan.next();

			System.out.print("Enter price of product " + i + ": ");
			prices[i] = scan.nextDouble();

			System.out.print("Please enter the amount to qualify for discount: ");
			total = scan.nextInt();

			System.out.print("Please enter the discount rate (0.1 for 10%): ");
			discount = scan.nextDouble();
			setup = true;
			run();
		}
	}
	public static void buy(String[] names, int[]amounts, int MAX){
		if (setup == false){
			System.out.println("Shop is not setup yet!");
			run();
		}
		if (setup == true){
			for (int i = 0; i < MAX; i++) {
				System.out.print("Enter the amount of " + names[i] + ": ");
				amounts[i] = scan.nextInt();
				buy = true;
			}
			run();
		}
	}
	public static void listItems(int[] amounts, String[] names, double[] prices, int MAX  ){
		if (setup == false){
			System.out.println("Shop is not setup yet!");
			run();
		}
		if (setup == true && buy == false){
			System.out.println("Try again: You have not bought anything");
			run();
		}
		for (int i = 0; i < MAX; i++) {
			if (amounts[i] > 0) {
				System.out.println(amounts[i] + " count of " + names[i] + " @ "
						+ prices[i] + " = $" + (amounts[i] * prices[i]));
			}
			run();
		}
	}

	public static void checkOut(int MAX, int[] amounts, double[] prices){
		double subTotal = 0; 
		double[] costs = new double[MAX];
		if (setup == false){
			System.out.println("Shop is not setup yet!");
			run();
		}
		if (setup == true && buy == false){
			System.out.println("Try again: You have not bought anything");
			run();
		}
		for (int i = 0; i < MAX; i++) {
			costs[i] = amounts[i] * prices[i];
			subTotal = subTotal + costs[i];

			if(subTotal > total){
				double discount1 = discount * subTotal;
				System.out.println("Thanks for coming!");
				System.out.println("Sub Total: $" + subTotal);
				System.out.println("Discount: $" + discount1);
				System.out.println("Total:   $" + (subTotal - discount1));
			}
			else {
				System.out.println("Thanks for coming!");
				System.out.println("Sub Total: $" + subTotal);
				System.out.println("Discount: $0.0");
				System.out.println("Total:   $" + subTotal);
			}
		}

	}
}