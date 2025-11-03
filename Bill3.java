// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Define the names of the diners
		String diner1 = "a";
		String diner2 = "b";
		String diner3 = "c";
		double Totalbill = Double.parseDouble(args[3]);
		double EachPays = Math.ceil(Totalbill / 3);
		System.out.println("The bill at a restaurant is " + Totalbill + " Shekels for three diners");  
		System.out.println(diner1 + ", " + diner2 + ", and " + diner3 + " split the cost of the bill. ");
		System.out.println("Each person pays " + EachPays + " Shekels.");
	}
}
