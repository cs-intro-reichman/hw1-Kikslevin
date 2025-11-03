// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	int invested = Integer.parseInt(args[0]);
	double interestrate = Double.parseDouble(args[1]);
	int years = Integer.parseInt(args[2]);
	double futurevalue = invested * (double)(Math.pow((1 + interestrate/100), years));
	System.out.println("The future value of an investment of " + invested + " Shekels after " + years + " years at an interest rate of " + interestrate + "% is " + futurevalue + " Shekels.");
	}
}