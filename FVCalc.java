// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	int invested = 200;
	double interestrate = 2.5;
	double years = 5.0;
	int futurevalue = invested * (int)(Math.pow((1 + interestrate/100), years));
	System.out.println("The future value of an investment of " + invested + " Shekels after " + years + " years at an interest rate of " + interestrate + "% is " + futurevalue + " Shekels.");
	}
}