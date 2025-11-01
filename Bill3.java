// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Define the names of the diners
		String diner1 = "Dan";
		String diner2 = "Lisa";
		String diner3 = "Ron";
		double Totalbill = 100.0;
		double EachPays = Math.ceil(Totalbill / 3);
		System.out.println("The bill at a restaurant is " + Totalbill + " Shekels for three diners");  
		System.out.println(diner1 + ", " + diner2 + ", and " + diner3 + " split the cost of the bill. ");
		System.out.println("Each person pays " + EachPays + " Shekels.");
	}
}
