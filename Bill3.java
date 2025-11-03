// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Define the names of the diners
		String diner1 = args[0];
		String diner2 = args [1];
		String diner3 = args[2];
		double Totalbill = Double.parseDouble(args[3]);
		double EachPays = Math.ceil(Totalbill / 3);
		System.out.println( "Dear " + diner3 + ", " + diner2 + ", and " + diner1 + ": pay " + EachPays + " Shekels each");
	}
}
